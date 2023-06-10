package com.reactive.arche.currency;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CurrencyRepository extends ReactiveCrudRepository<Currency, Integer> {
    Flux<Currency> findAllByBookIgnoreCase(String book);
}
