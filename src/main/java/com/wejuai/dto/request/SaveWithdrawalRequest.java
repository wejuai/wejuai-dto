package com.wejuai.dto.request;

import com.wejuai.entity.mysql.WithdrawalType;

/**
 * @author ZM.Wang
 */
public class SaveWithdrawalRequest {

    private String userId;

    private long integral;

    private WithdrawalType channelType;

    private String name;

    private String cardNo;

    public String getUserId() {
        return userId;
    }

    public SaveWithdrawalRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public long getIntegral() {
        return integral;
    }

    public SaveWithdrawalRequest setIntegral(long integral) {
        this.integral = integral;
        return this;
    }

    public WithdrawalType getChannelType() {
        return channelType;
    }

    public SaveWithdrawalRequest setChannelType(WithdrawalType channelType) {
        this.channelType = channelType;
        return this;
    }

    public String getName() {
        return name;
    }

    public SaveWithdrawalRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getCardNo() {
        return cardNo;
    }

    public SaveWithdrawalRequest setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }
}
