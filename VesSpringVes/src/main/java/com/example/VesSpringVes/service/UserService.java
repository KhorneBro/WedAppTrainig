package com.example.VesSpringVes.service;

import com.example.VesSpringVes.entity.UsersEntity;
import com.example.VesSpringVes.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    SessionFactory sessionFactory;

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUsers(UsersEntity usersEntity){
        userRepository.save(usersEntity);
    }

    public List<UsersEntity> findAll(){
        return userRepository.findAll();
    }

    public UsersEntity findById(Integer usersId){
        return userRepository.findById(usersId).orElse(null);
    }

    public List<UsersEntity> findAllByName(String name){
        return userRepository.findAllByName(name);
    }

    public void deleteUsers(Integer id){
        userRepository.deleteById(id);
    }

    @Transactional
    public UsersEntity editUser(UsersEntity usersEntity){

//        Session session = sessionFactory.getCurrentSession();
//        UsersEntity exictingUser = session.get(UsersEntity.class, usersEntity.getId());
//        exictingUser.setName(usersEntity.getName());
//        exictingUser.setSecondname(usersEntity.getSecondname());
//        exictingUser.setLastname(usersEntity.getLastname());
//        session.save(exictingUser);

        return userRepository.save(usersEntity);
    }
}
