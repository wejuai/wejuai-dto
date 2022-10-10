package com.wejuai.dto.response;

import com.wejuai.entity.mysql.RewardDemand;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class ShareRewardDemandInfo {

    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("内容")
    private String text;
    @ApiModelProperty("已有回答数")
    private long rewardSubmissionCount;
    @ApiModelProperty("积分")
    private long integral;

    public ShareRewardDemandInfo(RewardDemand rewardDemand) {
        this.title = rewardDemand.getTitle();
        this.text = rewardDemand.getText();
        this.rewardSubmissionCount = rewardDemand.getRewardSubmissionCount();
        this.integral = rewardDemand.getIntegral();
    }

    ShareRewardDemandInfo() {
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public long getRewardSubmissionCount() {
        return rewardSubmissionCount;
    }

    public long getIntegral() {
        return integral;
    }
}
