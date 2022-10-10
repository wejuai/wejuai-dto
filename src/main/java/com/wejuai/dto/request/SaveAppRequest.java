package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author ZM.Wang
 */
public abstract class SaveAppRequest {

	@NotBlank(message = "创建者必填")
	@ApiModelProperty("创建者用户id")
	String userId;

	@NotBlank(message = "爱好类型必填")
	@ApiModelProperty("所属爱好的id")
	String hobbyId;

	@NotBlank(message = "标题必填")
	@ApiModelProperty("标题")
	String title;

	@ApiModelProperty("积分")
	long integral;

	public String getUserId() {
		return userId;
	}

	public String getHobbyId() {
		return hobbyId;
	}

	public String getTitle() {
		return title;
	}

	public long getIntegral() {
		return integral;
	}

}
