package eu.imninja.Tests;

import eu.imninja.iso.ISO;
import eu.imninja.translator.TranslationManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ManagerTest {

    private TranslationManager translationManager;
    private ISO iso = new ISO(getClass().getResource("./config.properties").getPath(),"de");

    @BeforeEach
    void createStuff() {
        translationManager = new TranslationManager(iso);
    }

    @Test
    void getString() {
        assertEquals(translationManager.getString("string"),"test");
    }

    @Test
    void getInt(){
        assertEquals(translationManager.getInt("int"),2);
    }

    @Test
    void getBool(){
        assertTrue(translationManager.getBool("bool"));
    }
    @Test
    void getUnknown(){
        assertEquals(translationManager.getString("gerg"),null);
    }

}
