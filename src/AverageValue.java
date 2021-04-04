import java.util.Arrays;
import java.util.List;

public class AverageValue {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,8,14);
        Double result = returnAverage(values);
        System.out.println(result);
    }

    public static Double returnAverage(List<Integer> list) {

       return list.stream()
                .mapToInt( x->x)
                .average()
                .getAsDouble();
    }
}
