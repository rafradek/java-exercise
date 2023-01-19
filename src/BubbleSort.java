import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static List<Comparable> sort(List<Comparable> list) {
        if (list == null) throw new RuntimeException("list is null"); 
        List<Comparable> result = new ArrayList<>(list);
        
        for (int i = 0; i < result.size(); i++) {
            Comparable value1 = result.get(i);
            if (value1 == null) {
                result.remove(i);
                i--;
                continue;
            }
            for (int j = i+1; j < result.size(); j++) {
                Comparable value2 = result.get(j);
                if (value2.compareTo(value1) < 0) {
                    result.set(i, value2);
                    result.set(j, value1);
                }
            }
        }
        return result;
    }
}
