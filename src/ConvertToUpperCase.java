import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("test", "satya", "values");
        List<String> result = convertToUpperCase(values);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> convertToUpperCase(List<String> s) {
        return s.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());

    }

}
