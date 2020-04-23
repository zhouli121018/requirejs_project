package com.newland.ssm.service;

import com.newland.ssm.common.PageInfo;
import com.newland.ssm.model.User;

import java.util.List;

/**
 * @author wrp
 * @Description com.newland.ssm.service.UserService
 * @Date 2017/1/13
 */
public interface UserService {

    void findUser(PageInfo pageInfo, User user);

    void createUser(User user);

    void deleteUser(User user);

    void batchDeleteUser(List<Integer> userIds);

    void updateUser(User user);

}
