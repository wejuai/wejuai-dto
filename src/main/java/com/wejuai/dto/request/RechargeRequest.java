package com.wejuai.dto.request;

import com.wejuai.entity.mysql.ChannelType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;

/**
 * @author ZM.Wang
 */
public class RechargeRequest {

    @ApiModelProperty("分")
    @Min(value = 100, message = "充值必须100积分起")
    private long amount;

    @ApiModelProperty("当前页面")
    private String state;

    @ApiModelProperty("支付通道类型")
    private ChannelType type;

    @ApiModelProperty("前段不用管这个参数")
    private String openId;

    public RechargeRequest(long amount, String state, ChannelType type) {
        this.amount = amount;
        this.state = state;
        this.type = type;
    }

    RechargeRequest() {
    }

    public String getOpenId() {
        return openId;
    }

    public RechargeRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public ChannelType getType() {
        return type;
    }

    public long getAmount() {
        return amount;
    }

    public String getState() {
        return state;
    }
}
