package com.crls.user.service;

import com.crls.thrift.user.UserInfo;
import com.crls.thrift.user.UserService;
import com.crls.user.mapper.UserMapper;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService.Iface {

    @Autowired
    UserMapper userMapper;
    @Override
    public UserInfo getUserById(int id) throws TException {
        return userMapper.getUserById(id);
    }

    @Override
    public UserInfo getUserByName(String userName) throws TException {
        return userMapper.getUserByName(userName);
    }

    @Override
    public void regiserUser(UserInfo userInfo) throws TException {
        userMapper.registerUser(userInfo);
    }
}
