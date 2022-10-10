package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Hobby;
import com.wejuai.util.MediaUtils;

/**
 * @author ZM.Wang
 */
public class HobbyInfo {

    private String id;
    private String name;
    private String image;
    private long followed;

    public HobbyInfo(Hobby hobby) {
        if (hobby != null) {
            this.id = hobby.getId();
            this.name = hobby.getName();
            this.image = MediaUtils.buildUrl(hobby.getAvatar());
        } else {
            this.id = "xxxxxxxxxxxxxxxxxxxxxxxx";
            this.name = "未知爱好";
            this.image = MediaUtils.buildUrlByOssKey(MediaUtils.DEF_HEAD_IMAGE);
        }
    }

    HobbyInfo() {
    }

    public long getFollowed() {
        return followed;
    }

    public HobbyInfo setFollowed(long followed) {
        this.followed = followed;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}
