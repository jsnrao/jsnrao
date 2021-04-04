public class ReverseString {

    public static void main(String args[]) {
        String value = reverseString("weivretni avaj");
        System.out.println(value);
    }


    public static String reverseString(String s) {
        String result = "";
        for(int p=s.length()-1; p>=0;p--){
            result = result + s.charAt(p);
        }
        return result;
    }
}
