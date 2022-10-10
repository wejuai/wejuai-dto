package com.wejuai.dto.request;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

/**
 * @author ZM.Wang
 */
public class AppAddTextRequest {

    @NotBlank(message = "id必传")
    @ApiModelProperty("id")
    private String id;

    @NotBlank(message = "添加内容必传")
    @ApiModelProperty("添加内容")
    private String addText;

    public AppAddTextRequest(String id, String addText) {
        this.id = id;
        this.addText = addText;
    }

    AppAddTextRequest() {
    }

    public String getId() {
        return id;
    }

    public String getAddText() {
        return addText;
    }
}
