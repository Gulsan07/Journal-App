package com.journal.service.impl;

import com.journal.entities.User;
import com.journal.repository.UserEntryRepo;
import com.journal.service.UserEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserEntryServiceImpl implements UserEntryService {

    @Autowired
    private UserEntryRepo userEntryRepo;

    public void saveUser(User user){
        userEntryRepo.save(user);
    }

    public List<User> getAllUser(){
        return this.userEntryRepo.findAll();
    }

    public Optional<User> findById(ObjectId id) {
        return this.userEntryRepo.findById(id);
    }

    public void deleteById(ObjectId id){
        this.userEntryRepo.deleteById(id);
    }

    public User findByUserName(String username){
        return this.userEntryRepo.findByUserName(username);
    }

}
