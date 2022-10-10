package com.wejuai.dto.response;

import com.wejuai.entity.mongo.CelestialBody;
import com.wejuai.entity.mongo.CelestialBodyType;
import com.wejuai.entity.mysql.Hobby;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 * 星球信息
 */
public class CelestialBodyInfo {

    private String id;

    @ApiModelProperty("星球类型")
    private CelestialBodyType type;

    @ApiModelProperty("用户基础信息")
    private UserBasicInfo userInfo;

    @ApiModelProperty("爱好基础信息")
    private HobbyInfo hobbyInfo;

    @ApiModelProperty("x轴坐标")
    private double x;

    @ApiModelProperty("y轴坐标")
    private double y;

    @ApiModelProperty("星球大小，km")
    private long size;

    @ApiModelProperty("用户是贡献点，爱好是热度")
    private long point;

    @ApiModelProperty("用户关注爱好数量")
    private long hobbyNum;

    @ApiModelProperty("星球背景小图地址")
    private String smallBackground;

    @ApiModelProperty("星球背景大图地址")
    private String bigBackground;

    @ApiModelProperty("星球花纹小图地址")
    private String smallTexture;

    @ApiModelProperty("星球花纹大图地址")
    private String bigTexture;

    @ApiModelProperty("花纹旋转角度")
    private int angle;

    public CelestialBodyInfo(CelestialBody star) {
        this.id = star.getId();
        this.type = star.getType();
        this.x = star.getX();
        this.y = star.getY();
        this.size = star.getSize();
        this.point = star.getPoint();
        this.bigBackground = MediaUtils.buildUrlByOssKey(star.getBackground());
        this.smallBackground = MediaUtils.buildUrlByOssKey(star.getBackground().replaceAll("big", "small"));
        this.bigTexture = MediaUtils.buildUrlByOssKey(star.getTexture());
        this.smallTexture = MediaUtils.buildUrlByOssKey(star.getTexture().replaceAll("big", "small"));
        this.angle = star.getAngle();
    }

    CelestialBodyInfo() {
    }

    public CelestialBodyInfo userInfo(User user) {
        this.userInfo = new UserBasicInfo(user);
        this.hobbyNum = user.getHobbyNum();
        return this;
    }

    public CelestialBodyInfo hobbyInfo(Hobby hobby) {
        this.hobbyInfo = new HobbyInfo(hobby);
        return this;
    }

    public CelestialBodyInfo setHobbyNum(long hobbyNum) {
        this.hobbyNum = hobbyNum;
        return this;
    }

    public CelestialBodyType getType() {
        return type;
    }

    public UserBasicInfo getUserInfo() {
        return userInfo;
    }

    public HobbyInfo getHobbyInfo() {
        return hobbyInfo;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public long getSize() {
        return size;
    }

    public long getPoint() {
        return point;
    }

    public long getHobbyNum() {
        return hobbyNum;
    }

    public String getId() {
        return id;
    }

    public String getSmallBackground() {
        return smallBackground;
    }

    public String getBigBackground() {
        return bigBackground;
    }

    public String getSmallTexture() {
        return smallTexture;
    }

    public String getBigTexture() {
        return bigTexture;
    }

    public int getAngle() {
        return angle;
    }
}
