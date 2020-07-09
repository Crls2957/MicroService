package com.crls.user.mapper;


import com.crls.thrift.user.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id,userName, password, realName ," +
            "email from user where id=#{id}")
    UserInfo getUserById(@Param("id")int id);


    @Select("select id,userName, password, realName," +
            "email from user where userName=#{userName}")
    UserInfo getUserByName(@Param("userName")String userName);


    @Insert("insert into user (userName, password, realName, email)" +
            "values (#{u.userName}, #{u.password}, #{u.realName},#{u.email})")
    void registerUser(@Param("u") UserInfo userInfo);

}
