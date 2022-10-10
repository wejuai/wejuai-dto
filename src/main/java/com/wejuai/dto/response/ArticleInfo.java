package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Article;
import com.wejuai.entity.mysql.ArticleDraft;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;

import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;


/**
 * @author ZM.Wang
 */
public class ArticleInfo extends AppBaseInfo {

    @ApiModelProperty("缩略内容")
    private String inShort;

    @ApiModelProperty("文章内容")
    private String text;

    @ApiModelProperty("购买后邮件发送内容")
    private String emailText;

    @ApiModelProperty("销量")
    private long sales;

    @ApiModelProperty("是否解锁")
    private boolean unLock;

    @ApiModelProperty("是否点赞")
    private boolean star;

    @ApiModelProperty("是否收藏")
    private boolean collect;

    @ApiModelProperty("作者删除")
    private boolean authorDel;

    public ArticleInfo(Article article, boolean unlock, boolean author, boolean star, boolean collect) {
        this(article);
        this.unLock = unlock;
        this.star = star;
        this.collect = collect;
        if (unlock || author) {
            this.text = article.getText();
        }
        if (author) {
            this.emailText = article.getEmailText();
        }
    }

    public ArticleInfo(Article article, boolean console) {
        this(article);
        this.emailText = article.getEmailText();
        this.text = article.getText();
    }

    public ArticleInfo(Article article) {
        if (article != null) {
            super.id = article.getId();
            super.hobbyId = article.getHobby().getId();
            super.hobbyName = article.getHobby().getName();
            super.hobbyImage = MediaUtils.buildUrl(article.getHobby().getAvatar());
            super.displayNum = article.getDisplayNum();
            super.collectNum = article.getCollectNum();
            super.commentNum = article.getCommentNum();
            super.starNum = article.getStarNum();
            super.title = article.getTitle();
            super.integral = article.getIntegral();
            super.createdAt = article.getCreatedAt().getTime();
            User user = article.getUser();
            super.userId = user.getId();
            super.nickName = user.getNickName();
            super.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            super.coverUrl = article.getCover() == null ? null : MediaUtils.buildUrl(article.getCover());
            super.del = article.getDel();
            this.authorDel = article.getAuthorDel();
            this.sales = article.getSales();
            this.inShort = article.getInShort();
        }
    }

    public ArticleInfo(ArticleDraft articleDraft) {
        if (articleDraft != null) {
            super.id = articleDraft.getId();
            this.inShort = articleDraft.getInShort();
            super.displayNum = articleDraft.getDisplayNum();
            super.collectNum = articleDraft.getCollectNum();
            super.commentNum = articleDraft.getCommentNum();
            super.starNum = articleDraft.getStarNum();
            super.title = articleDraft.getTitle();
            User user = articleDraft.getUser();
            super.userId = user.getId();
            super.nickName = user.getNickName();
            super.integral = articleDraft.getIntegral();
            super.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            this.text = articleDraft.getText();
            super.coverUrl = articleDraft.getCover() == null ? null : MediaUtils.buildUrl(articleDraft.getCover());
            if (articleDraft.getHobby() != null) {
                super.hobbyId = articleDraft.getHobby().getId();
                super.hobbyName = articleDraft.getHobby().getName();
                super.hobbyImage = MediaUtils.buildUrl(articleDraft.getHobby().getAvatar());
            }
        }
    }

    public ArticleInfo setFollow(boolean follow) {
        super.follow = follow;
        return this;
    }

    ArticleInfo() {
    }

    public String getText() {
        return text;
    }

    public String getEmailText() {
        return emailText;
    }

    public boolean getUnLock() {
        return unLock;
    }

    public boolean getStar() {
        return star;
    }

    public boolean getCollect() {
        return collect;
    }

    public String getInShort() {
        return inShort;
    }

    public boolean getAuthorDel() {
        return authorDel;
    }

    public long getSales() {
        return sales;
    }
}
