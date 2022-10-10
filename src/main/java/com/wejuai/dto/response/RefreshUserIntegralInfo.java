package com.wejuai.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class RefreshUserIntegralInfo {

    @ApiModelProperty("是否正确")
    private boolean correct;

    @ApiModelProperty("拥有积分")
    private long hasIntegral;

    @ApiModelProperty("实际积分")
    private long actualIntegral;

    public RefreshUserIntegralInfo(boolean correct, long hasIntegral, long actualIntegral) {
        this.correct = correct;
        this.hasIntegral = hasIntegral;
        this.actualIntegral = actualIntegral;
    }

    RefreshUserIntegralInfo() {
    }

    public boolean getCorrect() {
        return correct;
    }

    public long getHasIntegral() {
        return hasIntegral;
    }

    public long getActualIntegral() {
        return actualIntegral;
    }
}
