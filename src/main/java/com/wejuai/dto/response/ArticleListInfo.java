package com.wejuai.dto.response;

import com.wejuai.entity.mysql.Article;
import com.wejuai.entity.mysql.ArticleDraft;
import com.wejuai.entity.mysql.User;
import com.wejuai.util.MediaUtils;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;
import static com.wejuai.util.MediaUtils.DEF_HEAD_IMAGE;


/**
 * @author ZM.Wang
 * 文本类列表dto，文章，文章草稿和悬赏共用
 */
public class ArticleListInfo extends AppListBaseInfo {

    @ApiModelProperty("内容缩略")
    private String inShort;
    @ApiModelProperty("是否点赞")
    private boolean star;
    @ApiModelProperty("是否收藏")
    private boolean collect;
    @ApiModelProperty("是否解锁")
    private boolean unLock;

    public ArticleListInfo(Article article, boolean star, boolean collect, boolean unLock) {
        this(article, unLock);
        this.star = star;
        this.collect = collect;
    }

    public ArticleListInfo(Article article, boolean unLock) {
        this(article);
        this.unLock = unLock;
    }

    @SuppressWarnings("WeakerAccess")
    public ArticleListInfo(Article article) {
        if (article != null) {
            User user = article.getUser();
            super.id = article.getId();
            super.userId = user.getId();
            super.nickName = user.getNickName();
            super.createdAt = DateFormatUtils.format(article.getCreatedAt(), DATE_FORMAT5);
            super.title = article.getTitle();
            super.hobbyId = article.getHobby().getId();
            super.hobbyName = article.getHobby().getName();
            super.hobbyImage = MediaUtils.buildUrl(article.getHobby().getAvatar());
            this.inShort = article.getInShort();
            super.displayNum = article.getDisplayNum();
            super.starNum = article.getStarNum();
            super.collectNum = article.getCollectNum();
            super.commentNum = article.getCommentNum();
            super.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            super.coverUrl = article.getCover() == null ? null : MediaUtils.buildUrl(article.getCover());
            super.integral = article.getIntegral();
        }
    }

    public ArticleListInfo(ArticleDraft articleDraft) {
        if (articleDraft != null) {
            User user = articleDraft.getUser();
            super.id = articleDraft.getId();
            super.userId = user.getId();
            super.nickName = user.getNickName();
            super.headImage = user.getHeadImage() == null ? MediaUtils.buildUrlByOssKey(DEF_HEAD_IMAGE) : MediaUtils.buildUrl(user.getHeadImage());
            super.createdAt = DateFormatUtils.format(articleDraft.getCreatedAt(), DATE_FORMAT5);
            super.title = articleDraft.getTitle();
            this.inShort = articleDraft.getInShort();
            super.coverUrl = MediaUtils.buildUrl(articleDraft.getCover());
            if (articleDraft.getHobby() != null) {
                super.hobbyId = articleDraft.getHobby().getId();
                super.hobbyName = articleDraft.getHobby().getName();
                super.hobbyImage = MediaUtils.buildUrl(articleDraft.getHobby().getAvatar());
            }
        }
    }

    ArticleListInfo() {
    }

    public String getInShort() {
        return inShort;
    }

    public boolean getStar() {
        return star;
    }

    public boolean getCollect() {
        return collect;
    }

    public boolean getUnLock() {
        return unLock;
    }
}
