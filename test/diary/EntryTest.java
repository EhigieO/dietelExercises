package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
        Entry entry;
    @BeforeEach
    void setUp() {
         entry = new Entry();
    }
    @Test
    void entryCanBeCreatedTest(){
        assertNotNull(entry);
    }
    @Test
    void entry_Has_Date_After_Creation(){
        assertNotNull(entry.getDateTime());
    }
    @Test
    void testThatEntryHasTitle(){
        entry.setTitle("My break Up Experience with Delly");
        assertEquals("My Break Up Experience with Delly", entry.getTitle());
    }
    @Test
    void testThatEntryHasBody(){
        String entryBody = """
                I did not do anything, he just came and said it won't work he wanted to work on himself
                HE said it wasn't me but him.
                """;
        entry.setBody(entryBody);
        assertEquals(entryBody,entry.getBody());
    }
}