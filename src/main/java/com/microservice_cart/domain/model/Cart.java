package com.microservice_cart.domain.model;

import java.time.LocalDate;

public class Cart {

    private final Long id;
    private final Long userId;
    private LocalDate lastUpdate;
    private LocalDate created;

    public Cart(Long id, Long userId, LocalDate lastUpdate, LocalDate created) {
        this.id = id;
        this.userId = userId;
        this.lastUpdate = lastUpdate;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
