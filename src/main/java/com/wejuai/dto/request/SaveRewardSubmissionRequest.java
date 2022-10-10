package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author ZM.Wang
 */
public class SaveRewardSubmissionRequest {

    @ApiModelProperty("选填id，修改时添加")
    private String id;

    @ApiModelProperty("提交者用户id")
    @NotBlank(message = "提交者用户id必填")
    private String userId;

    @ApiModelProperty("提交的悬赏id")
    @NotBlank(message = "悬赏id必填")
    private String rewardDemandId;

    @ApiModelProperty("选定结果前展示内容")
    private String inShort;

    @ApiModelProperty("选定后展示内容内容，富文本")
    @NotBlank(message = "提交内容必填")
    private String text;

    public SaveRewardSubmissionRequest(String id, String userId, String rewardDemandId, String inShort, String text) {
        this.id = id;
        this.userId = userId;
        this.rewardDemandId = rewardDemandId;
        this.text = text;
        this.inShort = inShort;
    }

    SaveRewardSubmissionRequest() {
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getRewardDemandId() {
        return rewardDemandId;
    }

    public String getText() {
        return text;
    }

    public String getInShort() {
        return inShort;
    }
}
