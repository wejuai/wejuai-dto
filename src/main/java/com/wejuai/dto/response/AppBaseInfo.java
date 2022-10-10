package com.wejuai.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public abstract class AppBaseInfo {

    @ApiModelProperty("记录id")
    String id;
    @ApiModelProperty("创建时间，时间戳毫秒")
    long createdAt;
    @ApiModelProperty("爱好id")
    String hobbyId;
    @ApiModelProperty("爱好名称")
    String hobbyName;
    @ApiModelProperty("爱好图片")
    String hobbyImage;
    @ApiModelProperty("发布的用户id")
    String userId;
    @ApiModelProperty("发布的用户昵称")
    String nickName;
    @ApiModelProperty("发布的用户头像地址")
    String headImage;
    @ApiModelProperty("标题")
    String title;
    @ApiModelProperty("封面图片")
    String coverUrl;
    @ApiModelProperty("浏览数")
    long displayNum;
    @ApiModelProperty("点赞数")
    long starNum;
    @ApiModelProperty("收藏数")
    long collectNum;
    @ApiModelProperty("评论数")
    long commentNum;
    @ApiModelProperty("积分")
    long integral;
    @ApiModelProperty("是否关注该用户")
    boolean follow;
    @ApiModelProperty("是否被删除")
    boolean del;

    public String getId() {
        return id;
    }

    public String getHobbyId() {
        return hobbyId;
    }

    public String getUserId() {
        return userId;
    }

    public String getNickName() {
        return nickName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public long getDisplayNum() {
        return displayNum;
    }

    public long getStarNum() {
        return starNum;
    }

    public long getCollectNum() {
        return collectNum;
    }

    public long getCommentNum() {
        return commentNum;
    }

    public long getIntegral() {
        return integral;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public boolean getFollow() {
        return follow;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public String getHobbyImage() {
        return hobbyImage;
    }

    public boolean getDel() {
        return del;
    }
}


