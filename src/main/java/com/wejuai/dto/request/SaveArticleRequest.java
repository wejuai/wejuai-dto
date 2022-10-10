package com.wejuai.dto.request;


import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class SaveArticleRequest extends SaveAppRequest {

    @ApiModelProperty("封面图片")
    private String cover;
    @ApiModelProperty("缩略文本")
    private String inShort;
    @ApiModelProperty("内容")
    private String text;
    @ApiModelProperty("购买后后买这收到邮件内容")
    private String emailText;

    public SaveArticleRequest(String userId, String hobbyId, String title, String cover, String inShort, String text, String emailText, long integral) {
        super.userId = userId;
        super.hobbyId = hobbyId;
        super.title = title;
        super.integral = integral;
        this.cover = cover;
        this.inShort = inShort;
        this.text = text;
        this.emailText = emailText;
    }

    SaveArticleRequest() {
    }

    public String getCover() {
        return cover;
    }

    public SaveArticleRequest setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public String getText() {
        return text;
    }

    public SaveArticleRequest setText(String text) {
        this.text = text;
        return this;
    }

    public String getInShort() {
        return inShort;
    }

    public SaveArticleRequest setInShort(String inShort) {
        this.inShort = inShort;
        return this;
    }

    public String getEmailText() {
        return emailText;
    }
}
