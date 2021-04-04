public class LinearSearch {

    public static void main(String args[]) {

        Integer[] values = new Integer[] {103, -110};
    int result = search(10,values);
    System.out.println(result);
    }
    public static int search(Integer n, Integer[] list) {
        int d=0;
        for(Integer p: list) {
            if(n== p){
                return d;

            }  d++;
        }
        return -1;
    }
}
