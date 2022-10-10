package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Performance;
import com.wejuai.entity.mysql.Sex;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.wejuai.dto.Constant.DATE_FORMAT2;
import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;

/**
 * @author ZM.Wang
 */
public class UserInfo {

    @ApiModelProperty("用户id")
    private String id;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("年龄")
    private String age;
    @ApiModelProperty("生日，时间戳long型")
    private String birthday;
    @ApiModelProperty("性别")
    private Sex sex;
    @ApiModelProperty("简介")
    private String inShort;
    @ApiModelProperty("可以随便填的所在地")
    private String location;
    @ApiModelProperty("头像")
    private String headImage;
    @ApiModelProperty("封面")
    private String cover;
    @ApiModelProperty("消息数")
    private long msgNum;
    @ApiModelProperty("作为买家的评分")
    private String buyerScore;
    @ApiModelProperty("作为卖家的评分")
    private String sellerScore;
    @ApiModelProperty("积分")
    private long integral;
    @ApiModelProperty("用户账号id，只有本人能看到自己的，聊天用的")
    private String accountsId;
    @ApiModelProperty("爱好数量")
    private long hobbyNum;
    @ApiModelProperty("用户手机性能")
    private Performance performance;
    @ApiModelProperty("是否关注")
    private boolean follow;
    @ApiModelProperty("手机号")
    private String phone;

    public UserInfo(User user, boolean myself) {
        this.id = user.getId();
        this.nickName = user.getNickName();
        this.age = user.getBirthday() == null ? "永远的18岁" : LocalDate.now().getYear() - user.getBirthday().getYear() + "";
        this.birthday = user.getBirthday() == null ? "未知" : user.getBirthday().format(DateTimeFormatter.ofPattern(DATE_FORMAT2));
        this.sex = user.getSex();
        this.inShort = user.getInShort();
        this.location = user.getLocation();
        this.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
        this.cover = user.getHeadImage() == null ? "" : MediaUtils.buildUrl(user.getCover());
        this.sellerScore = user.getSeller();
        this.hobbyNum = user.getHobbyNum();
        if (myself) {
            this.msgNum = user.getMsgNum();
            this.buyerScore = user.getBuyer();
            this.integral = user.getIntegral();
            this.accountsId = user.getAccounts().getId();
            this.phone = user.getAccounts().getPhone();
            this.performance = user.getPerformance() == null ? Performance.NEW : user.getPerformance();
        }
    }

    public boolean getFollow() {
        return follow;
    }

    public UserInfo setFollow(boolean follow) {
        this.follow = follow;
        return this;
    }

    UserInfo() {
    }

    public String getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCover() {
        return cover;
    }

    public String getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public String getInShort() {
        return inShort;
    }

    public String getLocation() {
        return location;
    }

    public String getHeadImage() {
        return headImage;
    }

    public long getMsgNum() {
        return msgNum;
    }

    public String getBuyerScore() {
        return buyerScore;
    }

    public String getSellerScore() {
        return sellerScore;
    }

    public long getIntegral() {
        return integral;
    }

    public String getAccountsId() {
        return accountsId;
    }

    public long getHobbyNum() {
        return hobbyNum;
    }

    public Performance getPerformance() {
        return performance;
    }

    public String getPhone() {
        return phone;
    }
}
