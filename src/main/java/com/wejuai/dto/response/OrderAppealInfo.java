package com.wejuai.dto.response;

import com.wejuai.entity.mysql.ApplyStatus;
import com.wejuai.entity.mysql.OrderAppeal;
import com.wejuai.entity.mysql.OrdersPageType;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * @author ZM.Wang
 */
public class OrderAppealInfo {

    private String id;

    private String userId;

    private String createdAt;

    @ApiModelProperty("订单类型")
    private OrdersPageType type;

    @ApiModelProperty("订单id")
    private String typeId;

    @ApiModelProperty("订单问题")
    private String question;

    @ApiModelProperty("状态")
    private ApplyStatus status;

    @ApiModelProperty("驳回原因")
    private String rejectionReason;

    @ApiModelProperty("处理时间")
    private String completedAt;

    public OrderAppealInfo(OrderAppeal orderAppeal) {
        this.id = orderAppeal.getId();
        this.userId = orderAppeal.getUser().getId();
        this.createdAt = DateFormatUtils.format(orderAppeal.getCreatedAt(), "yyyy-MM-dd HH:mm:ss");
        this.type = orderAppeal.getType();
        this.typeId = orderAppeal.getTypeId();
        this.question = orderAppeal.getQuestion();
        this.status = orderAppeal.getStatus();
        if (status != ApplyStatus.UNTREATED) {
            this.completedAt = DateFormatUtils.format(orderAppeal.getCompletedAt(), "yyyy-MM-dd HH:mm:ss");
            this.rejectionReason = orderAppeal.getRejectionReason();
        }
    }

    OrderAppealInfo() {
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public OrdersPageType getType() {
        return type;
    }

    public String getTypeId() {
        return typeId;
    }

    public String getQuestion() {
        return question;
    }

    public ApplyStatus getStatus() {
        return status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public String getCompletedAt() {
        return completedAt;
    }
}
