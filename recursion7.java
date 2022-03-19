import java.util.ArrayList;

public class recursion7 {
    public static void printSubsets(ArrayList<Integer>subset){
        for(int i=0;i<subset.size();i++){
            System.out.println(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSUbsets(int n,ArrayList<Integer>subset){
        if(n==0){
            printSubsets(subset);
            return;
        }
        findSUbsets(n-1,subset);
        subset.add(n);
        findSUbsets(n-1, subset);
        subset.remove(subset.size()-1);
    }
    public static void main(String args[]){
        int n=3;
        findSUbsets(n, new ArrayList<Integer>());
    }
}
