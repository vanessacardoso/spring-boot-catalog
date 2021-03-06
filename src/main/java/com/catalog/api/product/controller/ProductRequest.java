package com.catalog.api.product.controller;

import com.catalog.api.provider.model.Provider;

import java.math.BigDecimal;
import java.util.List;

public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal discount;
    private List<Provider> provider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public List<Provider> getProvider() {
        return provider;
    }

    public void setProvider(List<Provider> provider) {
        this.provider = provider;
    }
}
