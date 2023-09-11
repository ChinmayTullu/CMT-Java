//Time Complexity = O(n*n!)
import java.util.*;

public class Backtracking 
{
    public static void printPermutations(String s, String perm, int in)
    {
        if(s.length()==0)
        {
            System.out.println(perm);
            return;
        }
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            String newStr=s.substring(0, i)+s.substring(i+1);
            printPermutations(newStr, perm+ch, in+1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a letters to get possible permutations:");
        String str=sc.next();
        printPermutations(str, "", 0);
        sc.close();
    }
}