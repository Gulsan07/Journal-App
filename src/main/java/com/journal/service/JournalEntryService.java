package com.journal.service;

import com.journal.entities.JournalEntry;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface JournalEntryService {

    public void saveEntry(JournalEntry journalEntry, String user);
    public List<JournalEntry> getAllEntry();

    Optional<JournalEntry> findById(ObjectId id);

    void deleteById(String userName, ObjectId id);
    public void saveEntry(JournalEntry journalEntry);
}
