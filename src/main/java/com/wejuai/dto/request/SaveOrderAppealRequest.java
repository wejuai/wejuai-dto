package com.wejuai.dto.request;

import com.wejuai.entity.mysql.OrdersPageType;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class SaveOrderAppealRequest {

    private String userId;

    @ApiModelProperty("订单类型")
    private OrdersPageType type;

    @ApiModelProperty("订单id")
    private String typeId;

    @ApiModelProperty("遇到的问题")
    private String question;

    public SaveOrderAppealRequest(String userId, OrdersPageType type, String typeId, String question) {
        this.userId = userId;
        this.type = type;
        this.typeId = typeId;
        this.question = question;
    }

    SaveOrderAppealRequest() {
    }

    public String getUserId() {
        return userId;
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
}
