package com.wejuai.dto.response;

import com.wejuai.entity.mongo.CelestialBody;

/**
 * @author ZM.Wang
 */
public class CelestialBodyImageOssKey {
    private String back;

    private String up;

    private int angle;

    public CelestialBodyImageOssKey(CelestialBody celestialBody) {
        this.back = celestialBody.getBackground();
        this.up = celestialBody.getTexture();
        this.angle = celestialBody.getAngle();
    }

    CelestialBodyImageOssKey() {
    }

    public String getBack() {
        return back;
    }

    public String getUp() {
        return up;
    }

    public int getAngle() {
        return angle;
    }
}
