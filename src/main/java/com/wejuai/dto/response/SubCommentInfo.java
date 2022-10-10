package com.wejuai.dto.response;

import com.wejuai.entity.mongo.SubComment;
import com.wejuai.entity.mysql.User;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class SubCommentInfo {

    @ApiModelProperty("二级评论id")
    private String id;
    @ApiModelProperty("一级评论id")
    private String upperId;
    @ApiModelProperty("创建时间")
    private String createdAt;
    @ApiModelProperty("评论内容")
    private String text;
    @ApiModelProperty("二级评论人信息")
    private UserBaseInfo senderInfo;
    @ApiModelProperty("点赞数")
    private long starNum;
    @ApiModelProperty("应用信息")
    private AppMiniInfo appInfo;
    @ApiModelProperty("是否阅读")
    private boolean watch;

    public SubCommentInfo(SubComment subComment, User sender) {
        this.id = subComment.getId();
        this.upperId = subComment.getCommentId();
        this.createdAt = DateFormatUtils.format(subComment.getCreatedAt(), DATE_FORMAT5);
        this.text = subComment.getText();
        this.senderInfo = new UserBaseInfo(sender);
        this.starNum = subComment.getStarNum();
        this.watch = subComment.getWatch();
        this.appInfo = new AppMiniInfo(subComment.getAppId(), subComment.getAppType(), subComment.getAppTitle());
    }

    SubCommentInfo() {
    }

    public String getId() {
        return id;
    }

    public String getUpperId() {
        return upperId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public UserBaseInfo getSenderInfo() {
        return senderInfo;
    }

    public long getStarNum() {
        return starNum;
    }

    public AppMiniInfo getAppInfo() {
        return appInfo;
    }

    public boolean getWatch() {
        return watch;
    }
}
