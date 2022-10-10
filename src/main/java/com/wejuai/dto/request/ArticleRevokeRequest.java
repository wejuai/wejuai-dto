package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class ArticleRevokeRequest {

    @ApiModelProperty("请求用户id")
    private String userId;

    @ApiModelProperty("是否控制台")
    private boolean console;

    @ApiModelProperty("控制台撤回原因")
    private String content;

    public ArticleRevokeRequest(String userId, boolean console, String content) {
        this.userId = userId;
        this.console = console;
        this.content = content;
    }

    ArticleRevokeRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public boolean getConsole() {
        return console;
    }

    public String getContent() {
        return content;
    }
}
