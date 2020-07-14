package com.example.swagger_demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @ClassName LoginController
 * @Author Jumy
 * @Description //TODO
 * @Date 2019/10/8 18:26
 * @Version 1.0
 **/
@RestController
@RequestMapping("/swagger")
@Api(description = "测试一个Controller")
public class SwaggerController {


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询用户",notes = "查询用户")
    public Object listUser(User user) {
        return new User(user.getId(),"jumy");
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加用户",notes = "添加用户")
    public Object addUser(@RequestBody() User user) {
        return "add";
    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "修改用户",notes = "修改用户")
    public Object updateUser(@RequestBody User user) {
        return "update";
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "删除用户",notes = "删除用户")
    public Object deleteUser(@ApiParam("用户id")@PathVariable Integer id) {
        return  "delete";
    }

}
