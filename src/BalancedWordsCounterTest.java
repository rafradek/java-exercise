import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BalancedWordsCounterTest {
    @Test
    public void counterTest(){
        assertEquals(28, BalancedWordsCounter.count("aabbabcccba"));
        assertEquals(0, BalancedWordsCounter.count(""));
        assertThrows(RuntimeException.class, ()->BalancedWordsCounter.count("abababa1"));
        assertThrows(RuntimeException.class, ()->BalancedWordsCounter.count(null));
    }
}
