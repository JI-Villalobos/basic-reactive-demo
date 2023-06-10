package com.reactive.arche.currency;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class CurrencyService {
    private final CurrencyRepository repository;

    public CurrencyService(CurrencyRepository repository) {
        this.repository = repository;
    }

    public Mono<Currency> save(Currency currency){
        return repository.save(currency);
    }

    //Flux = list of something
    public Flux<Currency> findAll(){
        return repository.findAll().delayElements(Duration.ofSeconds(1));
    }

    //Mono = single object
    public Mono<Currency> findById(Integer id){
        return repository.findById(id);
    }
}
