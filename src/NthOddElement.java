import java.util.Arrays;
import java.util.List;

public class NthOddElement {
    public static void main(String[] args) {
        List<Integer> integerValues = Arrays.asList(new Integer[]{0,1});
        Integer result = getElement(integerValues,1);

//        List<Integer> integerValues = Arrays.asList(new Integer[]{3, 79});
//        Integer result = getElement(integerValues,2);
        System.out.println(result);
    }

    public static Integer getElement(List<Integer> list, Integer n) {
        int elementIndex = 2 * (n - 1);
        return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
    }
}
