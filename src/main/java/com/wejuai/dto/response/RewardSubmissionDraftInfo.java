package com.wejuai.dto.response;

import com.wejuai.entity.mysql.RewardDemandStatus;
import com.wejuai.entity.mysql.RewardSubmissionDraft;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class RewardSubmissionDraftInfo {

    private String id;
    private String createdAt;
    @ApiModelProperty("内容")
    private String text;
    @ApiModelProperty("选定前内容")
    private String inShort;
    @ApiModelProperty("悬赏标题")
    private String title;
    @ApiModelProperty("悬赏状态")
    private RewardDemandStatus rewardDemandStatus;

    public RewardSubmissionDraftInfo(RewardSubmissionDraft rewardSubmissionDraft) {
        this.id = rewardSubmissionDraft.getId();
        this.createdAt = DateFormatUtils.format(rewardSubmissionDraft.getCreatedAt(), DATE_FORMAT5);
        this.inShort = rewardSubmissionDraft.getInShort();
        this.title = rewardSubmissionDraft.getRewardDemand().getTitle();
        this.rewardDemandStatus = rewardSubmissionDraft.getRewardDemand().getStatus();
    }

    public RewardSubmissionDraftInfo(RewardSubmissionDraft rewardSubmissionDraft, boolean details) {
        this(rewardSubmissionDraft);
        this.text = rewardSubmissionDraft.getText();
    }

    RewardSubmissionDraftInfo() {
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public String getInShort() {
        return inShort;
    }

    public String getTitle() {
        return title;
    }

    public RewardDemandStatus getRewardDemandStatus() {
        return rewardDemandStatus;
    }
}
