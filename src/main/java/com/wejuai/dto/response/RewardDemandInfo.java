package com.wejuai.dto.response;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.wejuai.entity.mysql.RewardDemand;
import com.wejuai.entity.mysql.RewardDemandStatus;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;

import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;


/**
 * @author ZM.Wang
 */
public class RewardDemandInfo extends AppBaseInfo {

    @ApiModelProperty("内容")
    private String text;
    @ApiModelProperty("截止日期")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate deadline;
    @ApiModelProperty("状态")
    private RewardDemandStatus status;
    @ApiModelProperty("是否点赞")
    private boolean star;
    @ApiModelProperty("是否收藏")
    private boolean collect;
    @ApiModelProperty("是否延期过")
    private boolean extension;
    @ApiModelProperty("评分限制")
    private double scoreLimit;
    @ApiModelProperty("总答题数量")
    private long rewardSubmissionCount;

    @ApiModelProperty("是否回答过")
    private boolean answer;

    public RewardDemandInfo(RewardDemand rewardDemand) {
        if (rewardDemand != null) {
            super.id = rewardDemand.getId();
            super.hobbyId = rewardDemand.getHobby().getId();
            super.hobbyName = rewardDemand.getHobby().getName();
            super.hobbyImage = MediaUtils.buildUrl(rewardDemand.getHobby().getAvatar());
            super.displayNum = rewardDemand.getDisplayNum();
            super.collectNum = rewardDemand.getCollectNum();
            super.commentNum = rewardDemand.getCommentNum();
            super.starNum = rewardDemand.getStarNum();
            super.integral = rewardDemand.getIntegral();
            super.title = rewardDemand.getTitle();
            super.createdAt = rewardDemand.getCreatedAt().getTime();
            super.del = rewardDemand.getDel();
            User user = rewardDemand.getUser();
            super.userId = user.getId();
            super.nickName = user.getNickName();
            super.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            this.text = rewardDemand.getText();
            this.status = rewardDemand.getStatus();
            this.deadline = rewardDemand.getDeadline();
            this.extension = rewardDemand.getExtension();
            this.scoreLimit = rewardDemand.getScoreLimit();
            this.rewardSubmissionCount = rewardDemand.getRewardSubmissionCount();
        }
    }

    public RewardDemandInfo setAnswer(boolean answer) {
        this.answer = answer;
        return this;
    }

    public RewardDemandInfo setStar(boolean star) {
        this.star = star;
        return this;
    }

    public RewardDemandInfo setCollect(boolean collect) {
        this.collect = collect;
        return this;
    }

    public RewardDemandInfo setFollow(boolean follow) {
        super.follow = follow;
        return this;
    }

    RewardDemandInfo() {
    }

    public String getText() {
        return text;
    }

    public RewardDemandStatus getStatus() {
        return status;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public boolean getExtension() {
        return extension;
    }

    public double getScoreLimit() {
        return scoreLimit;
    }

    public long getRewardSubmissionCount() {
        return rewardSubmissionCount;
    }

    public boolean getStar() {
        return star;
    }

    public boolean getCollect() {
        return collect;
    }

    public boolean getAnswer() {
        return answer;
    }
}
