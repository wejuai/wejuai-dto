package com.wejuai.dto.response;

import com.wejuai.entity.mongo.AppType;

/**
 * @author ZM.Wang
 */
public class AppMiniInfo {

    private String id;
    private AppType type;
    private String title;

    @SuppressWarnings("WeakerAccess")
    public AppMiniInfo(String id, AppType type, String title) {
        this.id = id;
        this.type = type;
        this.title = title;
    }

    AppMiniInfo() {
    }

    public String getId() {
        return id;
    }

    public AppType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }
}
