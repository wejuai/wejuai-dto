package com.wejuai.dto.response;

import com.wejuai.entity.mysql.User;

/**
 * @author ZM.Wang
 */
public class UserBasicInfo {

    private String id;

    private String nickname;

    public UserBasicInfo(String id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    public UserBasicInfo(User user) {
        if (user != null) {
            this.id = user.getId();
            this.nickname = user.getNickName();
        } else {
            this.id = "xxxxxxxxxxxxxxxxxxxxxxxx";
            this.nickname = "未知用户";
        }
    }

    UserBasicInfo() {
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }
}
