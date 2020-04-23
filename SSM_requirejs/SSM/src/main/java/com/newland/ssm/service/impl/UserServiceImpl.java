package com.newland.ssm.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.newland.ssm.common.PageInfo;
import com.newland.ssm.dao.UserDao;
import com.newland.ssm.model.User;
import com.newland.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wrp
 * @Description com.newland.ssm.service.impl.UserServiceImpl
 * @Date 2017/1/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void findUser(PageInfo pageInfo, User user) {
        Page<?> page = PageHelper.startPage(pageInfo.getPageNumber(), pageInfo.getPageSize());
        pageInfo.setRows(userDao.findUserByParams(user));
        pageInfo.setTotal(page.getTotal());
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public void batchDeleteUser(List<Integer> userIds) {
        userDao.batchDeleteUser(userIds);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

}
