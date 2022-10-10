package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class SaveArticleDraftRequest extends SaveAppRequest {
    @ApiModelProperty("id")
    private String id;
    @ApiModelProperty("封面图片")
    private String cover;
    @ApiModelProperty("缩略文本")
    private String inShort;
    @ApiModelProperty("内容")
    private String text;
    @ApiModelProperty("购买后后买这收到邮件内容")
    private String emailText;

    public SaveArticleDraftRequest(String id, String userId, String hobbyId, String title, String cover, String inShort, String text, String emailText, long integral) {
        this.id = id;
        super.userId = userId;
        super.hobbyId = hobbyId;
        super.title = title;
        super.integral = integral;
        this.cover = cover;
        this.inShort = inShort;
        this.text = text;
        this.emailText = emailText;
    }

    SaveArticleDraftRequest() {
    }

    public String getId() {
        return id;
    }

    public String getCover() {
        return cover;
    }

    public String getInShort() {
        return inShort;
    }

    public String getText() {
        return text;
    }

    public String getEmailText() {
        return emailText;
    }
}
