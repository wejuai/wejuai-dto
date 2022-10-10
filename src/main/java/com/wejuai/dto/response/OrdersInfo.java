package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Orders;
import com.wejuai.entity.mysql.OrdersType;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class OrdersInfo {

    private String id;
    private String createdAt;

    @ApiModelProperty("订单类型")
    private OrdersType type;

    @ApiModelProperty("是否收入，true收入，false是支出")
    private boolean income;

    @ApiModelProperty("商品名称")
    private String goodsName;

    @ApiModelProperty("积分")
    private long integral;

    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("是否作废")
    private boolean nullify;

    public OrdersInfo(Orders orders) {
        this.id = orders.getId();
        this.createdAt = DateFormatUtils.format(orders.getCreatedAt(), DATE_FORMAT5);
        this.type = orders.getType();
        this.income = orders.getIncome();
        this.goodsName = orders.getGoodsName();
        this.integral = orders.getIntegral();
        this.userId = orders.getUser().getId();
        this.nullify = orders.getNullify();
    }

    OrdersInfo() {
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public OrdersType getType() {
        return type;
    }

    public boolean getIncome() {
        return income;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public long getIntegral() {
        return integral;
    }

    public String getUserId() {
        return userId;
    }

    public boolean getNullify() {
        return nullify;
    }
}
