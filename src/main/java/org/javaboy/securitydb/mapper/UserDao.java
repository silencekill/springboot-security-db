package org.javaboy.securitydb.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.securitydb.entity.Role;
import org.javaboy.securitydb.entity.User;

import java.util.List;

@Mapper
public interface UserDao {
    User loadUserByUsername(String username);

    List<Role> getUserRolesById(Integer id);

}
