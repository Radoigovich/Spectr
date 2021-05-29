package com.simbirsoft.spectr.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Role {
    @JsonValue
    USER ("USER"),
    @JsonValue
    MODERATOR ("MODERATOR"),
    @JsonValue
    ADMIN("ADMIN");

    private String name;

    Role() {
    }

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
