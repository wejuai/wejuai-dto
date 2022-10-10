package com.wejuai.dto.request;


import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class SaveRewardDemandRequest extends SaveAppRequest {

    @ApiModelProperty("缩略文本")
    private String inShort;
    @ApiModelProperty("内容")
    private String text;

    public SaveRewardDemandRequest(String userId, String hobbyId, String title, String inShort, String text, long integral) {
        super.userId = userId;
        super.hobbyId = hobbyId;
        super.title = title;
        super.integral = integral;
        this.inShort = inShort;
        this.text = text;
    }

    SaveRewardDemandRequest() {
    }

    public String getText() {
        return text;
    }


    public String getInShort() {
        return inShort;
    }

}
