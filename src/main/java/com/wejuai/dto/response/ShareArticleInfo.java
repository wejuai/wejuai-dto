package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Article;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ZM.Wang
 */
public class ShareArticleInfo {

    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("缩略，如果积分为0为空直接取text")
    private String inShort;
    @ApiModelProperty("积分")
    private long integral;
    @ApiModelProperty("内容，积分大于0为空")
    private String text;

    public ShareArticleInfo(Article article) {
        this.title = article.getTitle();
        if (article.getIntegral() > 0) {
            this.integral = article.getIntegral();
            this.inShort = article.getInShort();
        } else {
            this.text = article.getText();
        }
    }

    ShareArticleInfo() {
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getInShort() {
        return inShort;
    }

    public long getIntegral() {
        return integral;
    }
}
