package com.wejuai.dto.response;

import com.wejuai.entity.mysql.RewardDemand;
import com.wejuai.entity.mysql.RewardDemandStatus;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;
import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;

/**
 * @author ZM.Wang
 */
public class RewardDemandListInfo extends AppListBaseInfo {

    @ApiModelProperty("内容缩略")
    private String inShort;
    @ApiModelProperty("是否点赞")
    private boolean star;
    @ApiModelProperty("是否收藏")
    private boolean collect;
    @ApiModelProperty("状态")
    private RewardDemandStatus status;
    @ApiModelProperty("评分限制，0是不限制就别显示了")
    private double scoreLimit;

    @SuppressWarnings("WeakerAccess")
    public RewardDemandListInfo(RewardDemand rewardDemand) {
        if (rewardDemand != null) {
            User user = rewardDemand.getUser();
            super.id = rewardDemand.getId();
            super.userId = user.getId();
            super.nickName = user.getNickName();
            super.createdAt = DateFormatUtils.format(rewardDemand.getCreatedAt(), DATE_FORMAT5);
            super.title = rewardDemand.getTitle();
            super.hobbyId = rewardDemand.getHobby().getId();
            super.hobbyName = rewardDemand.getHobby().getName();
            super.hobbyImage = MediaUtils.buildUrl(rewardDemand.getHobby().getAvatar());
            super.displayNum = rewardDemand.getDisplayNum();
            super.starNum = rewardDemand.getStarNum();
            super.collectNum = rewardDemand.getCollectNum();
            super.commentNum = rewardDemand.getCommentNum();
            super.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            super.integral = rewardDemand.getIntegral();
            this.inShort = rewardDemand.getInShort();
            this.status = rewardDemand.getStatus();
            this.scoreLimit = rewardDemand.getScoreLimit();
        }
    }

    public RewardDemandListInfo(RewardDemand rewardDemand, boolean star, boolean collect) {
        this(rewardDemand);
        this.star = star;
        this.collect = collect;
    }

    RewardDemandListInfo() {
    }

    public String getInShort() {
        return inShort;
    }

    public boolean getStar() {
        return star;
    }

    public boolean getCollect() {
        return collect;
    }

    public RewardDemandStatus getStatus() {
        return status;
    }

    public double getScoreLimit() {
        return scoreLimit;
    }
}
