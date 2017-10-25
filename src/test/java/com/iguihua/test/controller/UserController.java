package com.iguihua.test.controller;

import com.iguihua.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yongzhang on 23/10/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applictionContext.xml")
public class UserController {

    @Autowired
    private UserService userService;
}
