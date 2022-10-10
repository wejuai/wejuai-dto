package com.wejuai.dto.response;

import com.wejuai.entity.mongo.Comment;
import com.wejuai.entity.mysql.User;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.time.DateFormatUtils;

import static com.wejuai.dto.Constant.DATE_FORMAT5;

/**
 * @author ZM.Wang
 */
public class CommentInfo {

    @ApiModelProperty("评论id")
    private String id;
    @ApiModelProperty("创建时间")
    private String createdAt;
    @ApiModelProperty("评论内容")
    private String text;
    @ApiModelProperty("应用信息")
    private AppMiniInfo appInfo;
    @ApiModelProperty("应用创建者信息")
    private UserBaseInfo appCreatorInfo;
    @ApiModelProperty("评论人信息")
    private UserBaseInfo senderInfo;
    @ApiModelProperty("点赞数")
    private long starNum;
    @ApiModelProperty("子回复分页信息")
    private Slice<SubCommentInfo> subComments;
    private boolean watch;
    @ApiModelProperty("点赞")
    private boolean star;
    @ApiModelProperty("作者已评")
    private boolean authorCommented;

    public CommentInfo(Comment comment, User appCreator, User sender) {
        this.id = comment.getId();
        this.starNum = comment.getStarNum();
        this.createdAt = DateFormatUtils.format(comment.getCreatedAt(), DATE_FORMAT5);
        this.text = comment.getText();
        this.authorCommented = comment.getAuthorCommented();
        this.watch = comment.getWatch();
        this.appCreatorInfo = new UserBaseInfo(appCreator);
        this.senderInfo = new UserBaseInfo(sender);
        this.appInfo = new AppMiniInfo(comment.getAppId(), comment.getAppType(), comment.getAppTitle());
    }

    public CommentInfo setSubComments(Slice<SubCommentInfo> subComments) {
        this.subComments = subComments;
        return this;
    }

    public CommentInfo setStar(boolean star) {
        this.star = star;
        return this;
    }

    CommentInfo() {
    }

    public String getId() {
        return id;
    }

    public long getStarNum() {
        return starNum;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getText() {
        return text;
    }

    public UserBaseInfo getAppCreatorInfo() {
        return appCreatorInfo;
    }

    public UserBaseInfo getSenderInfo() {
        return senderInfo;
    }

    public Slice<SubCommentInfo> getSubComments() {
        return subComments;
    }

    public AppMiniInfo getAppInfo() {
        return appInfo;
    }

    public boolean getWatch() {
        return watch;
    }

    public boolean getStar() {
        return star;
    }

    public boolean getAuthorCommented() {
        return authorCommented;
    }
}
