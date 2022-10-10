package com.wejuai.dto.request;

import com.wejuai.entity.mysql.WithdrawalType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author ZM.Wang
 * 提现请求
 */
public class WithdrawalTradeRequest {

    @NotBlank
    @ApiModelProperty("用户id")
    private String userId;

    @NotNull
    @ApiModelProperty("通道类型")
    private WithdrawalType type;

    @ApiModelProperty("描述")
    private String desc;

    @Min(1)
    @ApiModelProperty("金额")
    private long amount;

    @ApiModelProperty("不用管")
    private String cardNo;

    @ApiModelProperty("不用管")
    private String name;

    public WithdrawalTradeRequest(String userId, WithdrawalType type, String desc, long amount, String cardNo, String name) {
        this.userId = userId;
        this.type = type;
        this.desc = desc;
        this.amount = amount;
        this.cardNo = cardNo;
        this.name = name;
    }

    public WithdrawalTradeRequest addCardInfo(String cardNo, String name) {
        this.cardNo = cardNo;
        this.name = name;
        return this;
    }

    public WithdrawalTradeRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    WithdrawalTradeRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public WithdrawalType getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public long getAmount() {
        return amount;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getName() {
        return name;
    }
}
