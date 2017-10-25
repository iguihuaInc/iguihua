package com.iguihua.controller;

import com.iguihua.postDto.UserDto;
import com.iguihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yongzhang on 24/10/2017.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody UserDto userDto, BindingResult bindingResult) {
        userService.create(userDto);
    }
}
