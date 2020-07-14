package com.example.swagger_demo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName User
 * @Author Jumy
 * @Description //TODO
 * @Date 2019/10/9 20:17
 * @Version 1.0
 **/
@ApiModel("用户domain类")
public class User {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("姓名")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
