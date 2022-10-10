package com.wejuai.dto.request;

import com.wejuai.entity.mongo.AppType;

/**
 * @author ZM.Wang
 */
public class SaveSubCommentRequest {

    private String sender;    //发送者
    private AppType appType;
    private String appId;
    private String text;
    private String commentId;

    public SaveSubCommentRequest(String sender, AppType appType, String appId, String text, String commentId) {
        this.sender = sender;
        this.appType = appType;
        this.appId = appId;
        this.text = text;
        this.commentId = commentId;
    }

    SaveSubCommentRequest() {
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

    public String getCommentId() {
        return commentId;
    }
}
