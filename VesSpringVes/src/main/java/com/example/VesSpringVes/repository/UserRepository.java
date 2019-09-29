package com.example.VesSpringVes.repository;

import com.example.VesSpringVes.entity.UsersEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Configuration
public interface UserRepository extends JpaRepository<UsersEntity, Integer> {
    List<UsersEntity> findAllByName(String name);

    void deleteById(Integer id);
}
