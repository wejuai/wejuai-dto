package com.wejuai.dto.response;

import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;

/**
 * @author ZM.Wang
 */
public class UserBaseInfo {

    @ApiModelProperty("用户id")
    private String id;
    @ApiModelProperty("用户昵称")
    private String nickName;
    @ApiModelProperty("头像地址")
    private String headImage;
    @ApiModelProperty("用户简介")
    private String inShort;
    @ApiModelProperty("作为买家的评分")
    private String buyerScore;
    @ApiModelProperty("作为卖家的评分")
    private String sellerScore;

    public UserBaseInfo(User user) {
        if (user != null) {
            this.id = user.getId();
            this.nickName = user.getNickName();
            this.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            this.inShort = user.getInShort() == null ? "" : user.getInShort();
            this.buyerScore = user.getBuyer();
            this.sellerScore = user.getSeller();
        }
    }

    UserBaseInfo() {
    }

    public String getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public String getInShort() {
        return inShort;
    }

    public String getBuyerScore() {
        return buyerScore;
    }

    public String getSellerScore() {
        return sellerScore;
    }
}
