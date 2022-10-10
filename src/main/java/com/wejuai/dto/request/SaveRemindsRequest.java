package com.wejuai.dto.request;

import com.wejuai.entity.mongo.AppType;

import java.util.List;

/**
 * @author ZM.Wang
 */
public class SaveRemindsRequest {

    private String sender;    //发送者
    private List<String> receiver;  //接收者
    private AppType appType;
    private String appId;
    private String text;
    private String commentId;

    public SaveRemindsRequest(String sender, List<String> receiver, AppType appType, String appId, String text, String commentId) {
        this.sender = sender;
        this.receiver = receiver;
        this.appType = appType;
        this.appId = appId;
        this.text = text;
        this.commentId = commentId;
    }

    SaveRemindsRequest() {
    }

    public String getSender() {
        return sender;
    }

    public List<String> getReceiver() {
        return receiver;
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
