package com.offer.database.repository;

import com.offer.database.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepos extends JpaRepository<User,String> {


}
