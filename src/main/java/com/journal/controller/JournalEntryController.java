//package com.journal.controller;
//
//import com.journal.entities.JournalEntry;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalEntryController {
//
//    private Map<Long, JournalEntry> journalEntry = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntry.values());
//    }
//
//    @GetMapping("/id/{id}")
//    public JournalEntry getEntryById(@PathVariable Long id){
//        return journalEntry.get(id);
//    }
//
//    @DeleteMapping("/id/{id}")
//    public boolean deleteEntryById(@PathVariable Long id){
//        journalEntry.remove(id);
//        return true;
//    }
//
//    @PostMapping
//    public boolean saveEntry(@RequestBody JournalEntry entry){
//         journalEntry.put(entry.getId(),entry);
//         return true;
//    }
//
//    @PutMapping("/id/{id}")
//    public boolean updateEntry(@PathVariable Long id, @RequestBody JournalEntry entry){
//        journalEntry.put(id , entry);
//        return true;
//    }
//
//}
