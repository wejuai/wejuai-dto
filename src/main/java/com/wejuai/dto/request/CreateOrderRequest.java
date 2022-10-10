package com.wejuai.dto.request;

import com.wejuai.entity.mongo.AppType;
import com.wejuai.entity.mysql.ChannelType;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateOrderRequest {

    @ApiModelProperty("应用id")
    private String appId;

    @NotNull(message = "应用类型必填")
    @ApiModelProperty("应用类型")
    private AppType appType;

    @NotBlank(message = "付款用户必填")
    @ApiModelProperty("付款用户")
    private String userId;

    @NotBlank(message = "支付通道类型必填")
    @ApiModelProperty("支付通道类型")
    private ChannelType channelType;

    public String getAppId() {
        return appId;
    }

    public CreateOrderRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public AppType getAppType() {
        return appType;
    }

    public CreateOrderRequest setAppType(AppType appType) {
        this.appType = appType;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CreateOrderRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public CreateOrderRequest setChannelType(ChannelType channelType) {
        this.channelType = channelType;
        return this;
    }
}
