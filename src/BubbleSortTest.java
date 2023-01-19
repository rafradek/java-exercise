import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class BubbleSortTest {
    
    @Test
    public void sortTest(){
        assertEquals(Arrays.asList(1, 3, 4, 5, 6, 8, 8), BubbleSort.sort(Arrays.asList(1, 4, 5, 6, 8, 3, 8)));
        assertEquals(Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0), BubbleSort.sort(Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0)));
        assertEquals(Arrays.asList(), BubbleSort.sort(Arrays.asList()));
        assertEquals(Arrays.asList(5.0001), BubbleSort.sort(Arrays.asList(null, 5.0001)));
        assertThrows(RuntimeException.class, ()->BubbleSort.sort(null));
    }
}
