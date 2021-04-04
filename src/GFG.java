// Java program to find minimum
// number of denominations
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class GFG
{
    static int deno[] = {1,  5, 10};
    static int n = deno.length;

    static void findMin(int V)
    {
        // Initialize result
        Vector<Integer> ans = new Vector<>();
        List<Integer> coins = new ArrayList();
            coins.add(1);
            coins.add(5);
            coins.add(10);
        for (int i = n - 1; i >= 0; i--)
        {

            for(Integer c : coins){
                if (V >= coins.get(i))
                {
                    V -= coins.get(i);
                ans.add(coins.get(i));
                }
            }

        }

        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(" " + ans.elementAt(i));
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 16;
        System.out.print( "Following is minimal number " +"of change for " + n + ": ");
        findMin(n);
    }

}


