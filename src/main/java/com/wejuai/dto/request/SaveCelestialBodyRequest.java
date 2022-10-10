package com.wejuai.dto.request;

import com.wejuai.entity.mongo.CelestialBodyType;

/**
 * @author ZM.Wang
 */
public class SaveCelestialBodyRequest {

    private CelestialBodyType type;

    /** typeId */
    private String id;

    public SaveCelestialBodyRequest(CelestialBodyType type, String id) {
        this.type = type;
        this.id = id;
    }

    SaveCelestialBodyRequest() {
    }

    public CelestialBodyType getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
