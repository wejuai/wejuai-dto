package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author ZM.Wang
 */
public class SaveRewardSubmissionDraftRequest {

    @NotBlank(message = "悬赏草稿只能修改")
    @ApiModelProperty("逼填id")
    private String id;

    @ApiModelProperty("提交者用户id")
    @NotBlank(message = "提交者用户id必填")
    private String userId;

    @ApiModelProperty("选定结果前展示内容")
    private String inShort;

    @ApiModelProperty("选定后展示内容内容，富文本")
    @NotBlank(message = "提交内容必填")
    private String text;

    public SaveRewardSubmissionDraftRequest(String id, String userId, String inShort, String text) {
        this.id = id;
        this.userId = userId;
        this.inShort = inShort;
        this.text = text;
    }

    SaveRewardSubmissionDraftRequest() {
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getInShort() {
        return inShort;
    }

    public String getText() {
        return text;
    }
}
