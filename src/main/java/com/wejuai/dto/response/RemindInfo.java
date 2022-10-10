package com.wejuai.dto.response;

import com.wejuai.entity.mongo.Remind;
import com.wejuai.entity.mysql.User;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT;

/**
 * @author ZM.Wang
 */
public class RemindInfo {

    @ApiModelProperty("评论id")
    private String id;
    @ApiModelProperty("创建时间")
    private String createdAt;
    @ApiModelProperty("评论内容")
    private String text;
    @ApiModelProperty("接收者")
    private UserBaseInfo recipient;
    @ApiModelProperty("发送者")
    private UserBaseInfo senderInfo;
    @ApiModelProperty("应用信息")
    private AppMiniInfo appInfo;
    @ApiModelProperty("是否阅读")
    private boolean watch;

    public RemindInfo(Remind remind, User sender, User recipient) {
        this.id = remind.getId();
        this.createdAt = DateFormatUtils.format(remind.getCreatedAt(), DATE_FORMAT);
        this.text = remind.getText();
        this.recipient = new UserBaseInfo(recipient);
        this.senderInfo = new UserBaseInfo(sender);
        this.appInfo = new AppMiniInfo(remind.getAppId(), remind.getAppType(), remind.getAppTitle());
        this.watch = remind.getWatch();
    }

    RemindInfo() {
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public UserBaseInfo getRecipient() {
        return recipient;
    }

    public UserBaseInfo getSenderInfo() {
        return senderInfo;
    }

    public AppMiniInfo getAppInfo() {
        return appInfo;
    }

    public boolean getWatch() {
        return watch;
    }
}
