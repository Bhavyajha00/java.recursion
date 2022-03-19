import java.lang.Character.Subset;
import java.util.ArrayList;

public class recursion8 {
    public static void printSubsets(ArrayList<Integer>subset){
        for(int i = 0; i<subset.size(); i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void FindSubsets(int n, ArrayList<Integer>subset){
        if(n==0){
            printSubsets(subset);
            return;
        }
        FindSubsets(n-1, subset);
        subset.add(n);
        FindSubsets(n-1, subset);
        subset.remove(subset.size()-1);
    }
    public static void main(String [] args){
        int n= 9;
        FindSubsets(n, new ArrayList<Integer>());
    }
}
