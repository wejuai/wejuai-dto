package com.wejuai.dto.request;

/**
 * Created by ZM.Wang
 */
public enum SortType {

    TIME("createdAt"),
    STAR("starNum"),
    COLLECTION("collectNum"),
    INTEGRAL("integral"),
    DISPLAY("displayNum");

    private final String value;

    SortType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
