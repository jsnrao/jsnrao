public class FindMaximum {

    public static void main(String args[]) {
        Integer values [] = new Integer[] {0, 1};
        Integer result = findMaximumNumber(values);
        System.out.println(result);
    }

    public static Integer findMaximumNumber(Integer values[]) {
        Integer result = 0;
        for(int l=values.length-1; l>=0;l--){
            if(values[l] > result){
                result = values[l];
            }
        }
        return result;
    }
}
