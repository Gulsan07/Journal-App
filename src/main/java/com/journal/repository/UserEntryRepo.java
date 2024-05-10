package com.journal.repository;

import com.journal.entities.JournalEntry;
import com.journal.entities.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserEntryRepo extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);
}
