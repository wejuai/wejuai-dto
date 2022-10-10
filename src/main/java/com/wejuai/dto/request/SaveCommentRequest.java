package com.wejuai.dto.request;

import com.wejuai.entity.mongo.AppType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * @author ZM.Wang
 */
public class SaveCommentRequest {

    private String sender;    //发送者
    private AppType appType;
    private String appId;
    private String text;

    public SaveCommentRequest(String sender, AppType appType, String appId, String text) {
        this.sender = sender;
        this.appType = appType;
        this.appId = appId;
        this.text = text;
    }

    SaveCommentRequest() {
    }

    public String getSender() {
        return sender;
    }

    public AppType getAppType() {
        return appType;
    }

    public String getAppId() {
        return appId;
    }

    public String getText() {
        return text;
    }
}
