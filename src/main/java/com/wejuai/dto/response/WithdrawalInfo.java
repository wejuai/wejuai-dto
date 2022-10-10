package com.wejuai.dto.response;

import com.wejuai.entity.mysql.ApplyStatus;
import com.wejuai.entity.mysql.Withdrawal;
import com.wejuai.entity.mysql.WithdrawalType;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class WithdrawalInfo {

    private String id;

    private String createdAt;

    private String userId;

    @ApiModelProperty("提现积分")
    private long integral;

    @ApiModelProperty("提现通道")
    private WithdrawalType channelType;

    @ApiModelProperty("审核状态")
    private ApplyStatus status;

    @ApiModelProperty("审核时间")
    private String auditedAt;

    @ApiModelProperty("驳回原因")
    private String rejectionReason;

    @ApiModelProperty("是否交易成功")
    private boolean tradeStatus;

    @ApiModelProperty("交易时间")
    private String transferredAt;

    @ApiModelProperty("通道订单号")
    private String channelTradeId;

    @ApiModelProperty("最后一次转账记录id")
    private String lastTransferId;

    public WithdrawalInfo(Withdrawal withdrawal) {
        this.id = withdrawal.getId();
        this.createdAt = DateFormatUtils.format(withdrawal.getCreatedAt(), DATE_FORMAT5);
        this.userId = withdrawal.getUser().getId();
        this.integral = withdrawal.getIntegral();
        this.status = withdrawal.getStatus();
        this.auditedAt = withdrawal.getAuditedAt() == null ? "" : DateFormatUtils.format(withdrawal.getAuditedAt(), DATE_FORMAT5);
        this.rejectionReason = withdrawal.getRejectionReason();
        this.channelType = withdrawal.getChannelType();
        if (withdrawal.getTradeStatus()) {
            this.tradeStatus = true;
            this.channelTradeId = withdrawal.getChannelTradeId();
            this.transferredAt = DateFormatUtils.format(withdrawal.getTransferredAt(), DATE_FORMAT5);
            this.lastTransferId = withdrawal.getLastTransferId();
        }
    }

    WithdrawalInfo() {
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getIntegral() {
        return integral;
    }

    public ApplyStatus getStatus() {
        return status;
    }

    public String getAuditedAt() {
        return auditedAt;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public WithdrawalType getChannelType() {
        return channelType;
    }

    public boolean getTradeStatus() {
        return tradeStatus;
    }

    public String getTransferredAt() {
        return transferredAt;
    }

    public String getChannelTradeId() {
        return channelTradeId;
    }

    public String getLastTransferId() {
        return lastTransferId;
    }

    public String getUserId() {
        return userId;
    }
}
