package com.wejuai.dto.request;

/**
 * @author ZM.Wang
 */
public enum HobbyType {

    TRANSGENDER("transgender"),
    CONTORTION("contortion"),
    CURIO("CURIO"),
    NBA("NBA"),
    IT("it");

    private final String id;

    HobbyType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
