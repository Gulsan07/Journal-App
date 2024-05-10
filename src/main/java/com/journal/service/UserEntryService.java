package com.journal.service;

import com.journal.entities.User;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface UserEntryService {
    public void saveUser(User user);
    public List<User> getAllUser();
    public Optional<User> findById(ObjectId id);

    public void deleteById(ObjectId id);
    public User findByUserName(String username);
}
