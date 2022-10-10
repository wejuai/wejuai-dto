package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author ZM.Wang
 */
public class RemoveCommentRequest {

    @NotBlank(message = "评论id必填")
    @ApiModelProperty("评论id")
    private String id;

    @NotBlank(message = "删除发起人必填")
    @ApiModelProperty("删除发起人")
    private String sender;

    public RemoveCommentRequest(String id, String sender) {
        this.id = id;
        this.sender = sender;
    }

    RemoveCommentRequest() {
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }
}
