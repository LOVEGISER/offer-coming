package com.offer.mybatis.repository;

import com.offer.mybatis.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
  User selectById(String id);
}
