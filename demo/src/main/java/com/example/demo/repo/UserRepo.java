package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value ="select * from USER where id=?1 and name=?2",nativeQuery = true)
    Object findByName(String id, String name);

}
