package com.haken.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageRequest {

    private String name;

    public ImageRequest() {
        // Jackson deserialization
    }

    public ImageRequest(String name) {
        this.name = name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
}
