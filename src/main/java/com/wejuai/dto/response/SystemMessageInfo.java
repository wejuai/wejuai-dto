package com.wejuai.dto.response;

import com.wejuai.entity.mongo.SystemMessage;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class SystemMessageInfo {

    private String id;

    private String createdAt;

    @ApiModelProperty("美容")
    private String text;

    @ApiModelProperty("是否已读")
    private boolean watch;

    public SystemMessageInfo(SystemMessage systemMessage) {
        this.id = systemMessage.getId();
        this.createdAt = DateFormatUtils.format(systemMessage.getCreatedAt(), DATE_FORMAT5);
        this.text = systemMessage.getText();
        this.watch = systemMessage.getWatch();
    }

    SystemMessageInfo() {
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public boolean getWatch() {
        return watch;
    }
}
