package com.wejuai.dto.request;

import com.wejuai.entity.mongo.AppType;

/**
 * @author ZM.Wang
 */
public class SaveEvaluateRequest {

    private String userId;
    private AppType appType;
    private String appId;
    private long score;
    private String content;

    public SaveEvaluateRequest(String userId, long score, String content) {
        this.userId = userId;
        this.score = score;
        this.content = content;
    }

    public SaveEvaluateRequest article(String appId) {
        this.appType = AppType.ARTICLE;
        this.appId = appId;
        return this;
    }

    public SaveEvaluateRequest rewardSubmission(String rewardSubmissionId) {
        this.appType = AppType.REWARD_DEMAND;
        this.appId = rewardSubmissionId;
        return this;
    }

    SaveEvaluateRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public AppType getAppType() {
        return appType;
    }

    public String getAppId() {
        return appId;
    }

    public long getScore() {
        return score;
    }

    public String getContent() {
        return content;
    }


}
