package com.iguihua.service.impl;

import com.iguihua.mapper.UserMapper;
import com.iguihua.model.UserModel;
import com.iguihua.postDto.UserDto;
import com.iguihua.service.UserService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yongzhang on 23/10/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void create(UserDto userDto) {
        UserModel usermodel = new UserModel();
        userMapper.create(usermodel);
    }
}
