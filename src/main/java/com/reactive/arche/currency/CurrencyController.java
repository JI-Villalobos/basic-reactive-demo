package com.reactive.arche.currency;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/currencies")
public class CurrencyController {
    private final  CurrencyService service;

    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @PostMapping
    public Mono<Currency> save(@RequestBody Currency currency){
        return service.save(currency);
    }

    @GetMapping
    public Flux<Currency> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Currency> findById(@PathVariable("id") Integer id){
        return service.findById(id);
    }
}
