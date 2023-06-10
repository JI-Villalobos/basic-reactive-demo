package com.reactive.arche.currency;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "currency_data")
public class Currency {
    @Id
    private Long id;
    private String book;
    private Integer volume;
    private Integer low;
    private Integer high;

    public Currency(Long id, String book, Integer volume, Integer low, Integer high) {
        this.id = id;
        this.book = book;
        this.volume = volume;
        this.low = low;
        this.high = high;
    }

    public Currency(String book, Integer volume, Integer low, Integer high) {
        this.book = book;
        this.volume = volume;
        this.low = low;
        this.high = high;
    }

    public Currency() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }
}
