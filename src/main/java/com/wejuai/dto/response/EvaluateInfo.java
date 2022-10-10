package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Evaluate;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class EvaluateInfo {

    private String id;
    private String createdAt;

    @ApiModelProperty("评分")
    private long score;
    @ApiModelProperty("内容")
    private String content;

    public EvaluateInfo(Evaluate evaluate) {
        if (evaluate != null) {
            this.id = evaluate.getId();
            this.createdAt = DateFormatUtils.format(evaluate.getCreatedAt(), DATE_FORMAT5);
            this.score = evaluate.getScore();
            this.content = evaluate.getContent();
        }
    }

    EvaluateInfo() {
    }

    public String getId() {
        return id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getScore() {
        return score;
    }

    public String getContent() {
        return content;
    }
}
