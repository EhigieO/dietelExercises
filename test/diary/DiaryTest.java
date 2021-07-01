package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void eachStartWith(){
        diary = new Diary("Hatred Stories");
    }

    @Test
    void name() {
        assertNotNull(diary);
        assertEquals("Hatred Stories",diary.getTitle());
    }
    @Test
    void diaryCanAddEntryTest(){
        diary = new Diary("Confidence Diary");
        Entry  entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake...");

        diary.addEntry(entry);
        diary.addEntry(entry);
        assertEquals(2,diary.getNumberOfEntries());
    }
    @Test
    void diaryCanCreateEntriesAsStringTest(){
        diary = new Diary("Blessings Diary");
        diary.addEntry("Heart Torn Apart","It was a cold sunny wednessday...");

        diary.addEntry("He came begging","Turn to page 2");
        assertEquals(2,diary.getNumberOfEntries());
    }
    @Test
    void entryCanBeSearchedByTitle(){
        diary = new Diary("Blessings Diary");
        Entry entry = new Entry();
        entry.setTitle("Heart Torn Apart");
        entry.setBody("It was a sunny afternoon");
        diary.addEntry(entry);
        diary.addEntry("He came begging","Turn to page 2");

        Entry foundEntry = diary.findEntryByTitle("Heart Torn Apart");
        assertEquals(foundEntry,entry);
        assertEquals(2,diary.getNumberOfEntries());

    }
    @Test
    void diaryCanDeleteEntries(){
        diary = new Diary("Blessings Diary");
        Entry entry = new Entry();
        entry.setTitle("Heart Torn Apart");
        entry.setBody("It was a sunny afternoon");
        diary.addEntry(entry);
        diary.addEntry("He came begging","Turn to page 2");

        assertEquals(2,diary.getNumberOfEntries());

        diary.deleteEntryByTitle("He came begging");
        assertEquals(1,diary.getNumberOfEntries());
    }
}
