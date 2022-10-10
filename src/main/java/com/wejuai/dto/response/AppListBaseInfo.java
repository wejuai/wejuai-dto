package com.wejuai.dto.response;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public abstract class AppListBaseInfo {

    @ApiModelProperty("id")
    String id;
    @ApiModelProperty("发布者用户id")
    String userId;
    @ApiModelProperty("创建时间")
    String createdAt;
    @ApiModelProperty("发布的用户昵称")
    String nickName;
    @ApiModelProperty("发布的用户头像地址")
    String headImage;
    @ApiModelProperty("标题")
    String title;
    @ApiModelProperty("缩略图地址")
    String coverUrl;
    @ApiModelProperty("浏览量")
    long displayNum;
    @ApiModelProperty("点赞量")
    long starNum;
    @ApiModelProperty("收藏量")
    long collectNum;
    @ApiModelProperty("评论数")
    long commentNum;
    @ApiModelProperty("爱好id")
    String hobbyId;
    @ApiModelProperty("爱好名称")
    String hobbyName;
    @ApiModelProperty("爱好图片")
    String hobbyImage;
    @ApiModelProperty("积分")
    long integral;

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
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

    public String getHobbyId() {
        return hobbyId;
    }

    public long getCommentNum() {
        return commentNum;
    }

    public long getIntegral() {
        return integral;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public String getHobbyImage() {
        return hobbyImage;
    }
}
