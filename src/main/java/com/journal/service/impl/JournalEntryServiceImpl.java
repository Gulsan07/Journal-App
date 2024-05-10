package com.journal.service.impl;

import com.journal.entities.JournalEntry;
import com.journal.entities.User;
import com.journal.repository.JournalEntryRepo;
import com.journal.service.JournalEntryService;
import com.journal.service.UserEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class JournalEntryServiceImpl implements JournalEntryService {

    @Autowired
    private JournalEntryRepo journalEntryRepo;

    @Autowired
    private UserEntryService userEntryService;

    public void saveEntry(JournalEntry journalEntry, String userName){
        User user = this.userEntryService.findByUserName(userName);
        journalEntry.setDate(LocalDateTime.now());
        JournalEntry save = journalEntryRepo.save(journalEntry);
        user.getJournalEntries().add(save);
        userEntryService.saveUser(user);
    }

    public void saveEntry(JournalEntry journalEntry){
       journalEntryRepo.save(journalEntry);
    }

    public List<JournalEntry> getAllEntry(){
        return this.journalEntryRepo.findAll();
    }

    @Override
    public Optional<JournalEntry> findById(ObjectId id) {
        return this.journalEntryRepo.findById(id);
    }

    public void deleteById(String userName, ObjectId id){
        User user = this.userEntryService.findByUserName(userName);
        user.getJournalEntries().removeIf(x -> x.getId().equals(id));
        this.userEntryService.saveUser(user);
        this.journalEntryRepo.deleteById(id);

    }
}
