package com.octo.poc.dto;

public class CarteSubscription extends GenericSubsciptionData {
    private String name;

    private String numeroDeSerie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
}
