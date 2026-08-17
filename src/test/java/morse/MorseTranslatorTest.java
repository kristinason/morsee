import morse.MorseTranslator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MorseTranslatorTest {
   

    @Test 
    void textToMorse_HEJ() {
        MorseTranslator t = new MorseTranslator();
        assertEquals(".... . .---", t.textToMorse("HEJ"));
    }
    
    @Test
    void textToMorse_ignoresSpaces() {
        MorseTranslator t = new MorseTranslator();
        assertEquals(".... . .-.. .-.. ---", t.textToMorse("H E L L O"));
    }

    @Test
    void morseToText_HEJ() {
        assertEquals("HEJ", t.morseToText(".... . .---"));
    }

    @Test
    void textToMorse_invalidCharacter_throwsException() { 
        MorseTranslator t = new MorseTranslator();
        assertThrows(IllegalArgumentException.class, 

                 
                () -> t.textToMorse("HELLO!"));
    }
}
