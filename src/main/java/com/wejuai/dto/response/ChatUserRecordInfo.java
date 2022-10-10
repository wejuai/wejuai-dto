package com.wejuai.dto.response;

import com.wejuai.entity.mysql.ChatUserRecord;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

import java.time.ZoneOffset;

/**
 * @author ZM.Wang
 */
public class ChatUserRecordInfo {

    @ApiModelProperty("关系id")
    private String id;

    @ApiModelProperty("对方userId")
    private String userId;

    @ApiModelProperty("对方昵称")
    private String nickname;

    @ApiModelProperty("对方头像")
    private String avatar;

    @ApiModelProperty("未读消息数")
    private long unreadMsgNum;

    @ApiModelProperty("最后时间的时间戳")
    private long lastTime;

    @ApiModelProperty("最后消息内容")
    private String lastText;

    public ChatUserRecordInfo(ChatUserRecord chatUserRecord) {
        this.id = chatUserRecord.getId();
        this.lastText = chatUserRecord.getLastText();
        this.lastTime = chatUserRecord.getLastTime().toEpochSecond(ZoneOffset.of("+8")) * 1000;
        this.userId = chatUserRecord.getSender().getId();
        this.unreadMsgNum = chatUserRecord.getUnreadMsgNum();
        this.nickname = chatUserRecord.getSender().getNickName();
        this.avatar = chatUserRecord.getSender().getHeadImage() == null ? MediaUtils.buildUrlByOssKey(MediaUtils.DEF_HEAD_IMAGE) : MediaUtils.buildUrl(chatUserRecord.getSender().getHeadImage());
    }

    ChatUserRecordInfo() {
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public long getLastTime() {
        return lastTime;
    }

    public String getLastText() {
        return lastText;
    }

    public long getUnreadMsgNum() {
        return unreadMsgNum;
    }
}
