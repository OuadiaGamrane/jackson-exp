package com.octo.poc.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Subscription {

    private String type;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", include = JsonTypeInfo.As.EXTERNAL_PROPERTY, defaultImpl = GenericSubsciptionData.class)
    @JsonSubTypes(value = {
            @JsonSubTypes.Type(value = BeneficiaireSubscription.class, name = "Beneficiaire"),
            @JsonSubTypes.Type(value = CarteSubscription.class, name = "Carte")
    })
    private GenericSubsciptionData genericSubsciptionData;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GenericSubsciptionData getGenericSubsciptionData() {
        return genericSubsciptionData;
    }

    public void setGenericSubsciptionData(GenericSubsciptionData genericSubsciptionData) {
        this.genericSubsciptionData = genericSubsciptionData;
    }
}
