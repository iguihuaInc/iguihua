package com.iguihua.mapper;

import com.iguihua.model.UserModel;
import org.springframework.stereotype.Repository;

/**
 * Created by yongzhang on 23/10/2017.
 */
public interface UserMapper {

    void create(UserModel userModel);
}
