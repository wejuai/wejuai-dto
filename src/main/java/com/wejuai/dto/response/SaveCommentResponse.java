package com.wejuai.dto.response;

/**
 * @author ZM.Wang
 */
public class SaveCommentResponse {

    private String receiver;
    private String commentSender;

    public SaveCommentResponse(String receiver, String commentSender) {
        this.receiver = receiver;
        this.commentSender = commentSender;
    }

    SaveCommentResponse() {
    }

    public String getReceiver() {
        return receiver;
    }

    public String getCommentSender() {
        return commentSender;
    }
}
