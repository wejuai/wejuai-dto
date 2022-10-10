package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Hobby;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 * 爱好搜索
 */
public class GetHobbyDomain {

    @ApiModelProperty("是否搜出域名，true就是有domain，false就是取answer")
    private boolean type;
    @ApiModelProperty("有相对应的爱好返回的域名")
    private String domain;
    @ApiModelProperty("没有对应爱好返回的闲聊回答")
    private String answer;
    @ApiModelProperty("爱好id")
    private String hobbyId;
    private String name;
    private String avatar;

    public GetHobbyDomain(boolean type, String domain, String answer, String hobbyId) {
        this.type = type;
        this.domain = domain;
        this.answer = answer;
        this.hobbyId = hobbyId;
    }

    public GetHobbyDomain(Hobby hobby) {
        this.type = true;
        this.domain = hobby.getDomain();
        this.hobbyId = hobby.getId();
        this.name = hobby.getName();
        this.avatar = MediaUtils.buildUrl(hobby.getAvatar());
    }

    public GetHobbyDomain(String answer) {
        this.type = false;
        this.answer = answer;
    }

    GetHobbyDomain() {
    }

    public boolean getType() {
        return type;
    }

    public String getDomain() {
        return domain;
    }

    public String getAnswer() {
        return answer;
    }

    public String getHobbyId() {
        return hobbyId;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }
}
