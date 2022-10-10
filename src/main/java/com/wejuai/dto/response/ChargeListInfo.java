package com.wejuai.dto.response;

import com.wejuai.entity.mongo.trade.Charge;
import com.wejuai.entity.mongo.trade.TradeStatus;
import com.wejuai.entity.mysql.ChannelType;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class ChargeListInfo {

    private String id;
    private String userId;
    @ApiModelProperty("订单名")
    private String subject;
    @ApiModelProperty("金额（分）")
    private long amount;
    @ApiModelProperty("支付通道")
    private ChannelType channelType;
    @ApiModelProperty("创建时间")
    private String startedAt;
    @ApiModelProperty("状态")
    private TradeStatus status;
    @ApiModelProperty("完成时间")
    private String completedAt;
    @ApiModelProperty("通道订单号")
    private String chanTradeNo;

    public ChargeListInfo(Charge charge) {
        this.id = charge.getId();
        this.userId = charge.getUserId();
        this.amount = charge.getAmount();
        this.channelType = charge.getChannelType();
        this.startedAt = DateFormatUtils.format(charge.getStartedAt(), DATE_FORMAT5);
        this.status = charge.getStatus();
        this.subject = charge.getSubject();
        if (charge.getCompletedAt() != null) {
            this.completedAt = DateFormatUtils.format(charge.getCompletedAt(), DATE_FORMAT5);
            this.chanTradeNo = charge.getChanTradeNo();
        }
    }

    ChargeListInfo() {
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public long getAmount() {
        return amount;
    }

    public ChannelType getChannelType() {
        return channelType;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public TradeStatus getStatus() {
        return status;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public String getChanTradeNo() {
        return chanTradeNo;
    }

    public String getSubject() {
        return subject;
    }
}
