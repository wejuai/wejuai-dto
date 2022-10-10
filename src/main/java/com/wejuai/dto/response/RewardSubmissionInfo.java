package com.wejuai.dto.response;

import com.wejuai.entity.mysql.RewardSubmission;
import com.wejuai.entity.mysql.RewardSubmissionDraft;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;
import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;

/**
 * @author ZM.Wang
 */
public class RewardSubmissionInfo {

    private String id;
    private String createdAt;
    @ApiModelProperty("发布的用户id")
    private String userId;
    @ApiModelProperty("发布的用户昵称")
    private String nickName;
    @ApiModelProperty("发布的用户头像地址")
    private String headImage;
    @ApiModelProperty("内容")
    private String text;
    @ApiModelProperty("是否被选中")
    private boolean selected;
    @ApiModelProperty("选定前内容")
    private String inShort;
    @ApiModelProperty("评价信息")
    private EvaluateInfo evaluateInfo;

    public RewardSubmissionInfo(RewardSubmission rewardSubmission, boolean author) {
        this(rewardSubmission);
        if (author) {
            this.text = rewardSubmission.getText();
        }
    }

    @SuppressWarnings("WeakerAccess")
    public RewardSubmissionInfo(RewardSubmission rewardSubmission) {
        this.id = rewardSubmission.getId();
        this.createdAt = DateFormatUtils.format(rewardSubmission.getCreatedAt(), DATE_FORMAT5);
        this.selected = rewardSubmission.getSelected();
        this.inShort = rewardSubmission.getInShort();
        User user = rewardSubmission.getUser();
        this.userId = user.getId();
        this.nickName = user.getNickName();
        this.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
    }

    public RewardSubmissionInfo(RewardSubmissionDraft rewardSubmissionDraft) {
        this.id = rewardSubmissionDraft.getId();
        this.createdAt = DateFormatUtils.format(rewardSubmissionDraft.getCreatedAt(), DATE_FORMAT5);
        this.inShort = rewardSubmissionDraft.getInShort();
        this.text = rewardSubmissionDraft.getText();
    }

    RewardSubmissionInfo() {
    }

    public EvaluateInfo getEvaluateInfo() {
        return evaluateInfo;
    }

    public RewardSubmissionInfo setEvaluateInfo(EvaluateInfo evaluateInfo) {
        this.evaluateInfo = evaluateInfo;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public String getText() {
        return text;
    }

    public boolean getSelected() {
        return selected;
    }

    public String getInShort() {
        return inShort;
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
