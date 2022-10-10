package com.wejuai.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class UserIntegralInfo {

    @ApiModelProperty("空闲积分")
    private long total;

    @ApiModelProperty("不可提现积分")
    private long notWithdrawable;

    @ApiModelProperty("提现中积分")
    private long processingWithdrawal;

    public UserIntegralInfo(long total, long notWithdrawable, long processingWithdrawal) {
        this.total = total;
        this.notWithdrawable = notWithdrawable;
        this.processingWithdrawal = processingWithdrawal;
    }

    UserIntegralInfo() {
    }

    public long getTotal() {
        return total;
    }

    public long getProcessingWithdrawal() {
        return processingWithdrawal;
    }

    public long getNotWithdrawable() {
        return notWithdrawable;
    }
}
