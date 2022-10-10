package com.wejuai.dto.response;

/**
 * @author ZM.Wang
 */
public class IdBaseResponse {

    private String id;

    public IdBaseResponse(String id) {
        this.id = id;
    }

    IdBaseResponse() {
    }

    public String getId() {
        return id;
    }
}
