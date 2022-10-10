package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author ZM.Wang
 */
public class ApplyCancelRewardDemandRequest {

    @ApiModelProperty("悬赏id")
    @NotBlank(message = "悬赏id必填")
    private String id;

    @ApiModelProperty("用户id")
    @NotBlank(message = "用户id必填")
    private String userId;

    @ApiModelProperty("原因")
    @NotBlank(message = "原因必填")
    private String reason;

    public ApplyCancelRewardDemandRequest(String id, String userId, String reason) {
        this.id = id;
        this.userId = userId;
        this.reason = reason;
    }

    ApplyCancelRewardDemandRequest() {
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getReason() {
        return reason;
    }
}
