import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfHashExists(){
        assertNotNull("CodeupCrypt.hash is not null", CodeupCrypt.hash);
    }

    @Test
    public void testHashPassword(){
        assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
        assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
        assertEquals("123", CodeupCrypt.hashPassword("123"));
        assertEquals("124", CodeupCrypt.hashPassword("12a"));
    }

    @Test
    public void testCheckPassword(){
        assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
    }

}
