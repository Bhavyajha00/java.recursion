public class recursion4 {
    public static int countpaths(int i, int j, int m, int n){
        if(i==m-1|| j==n-1){
            return 1;
    }
    return countpaths(i+1, j, m, n) + countpaths(i, j+1, m, n);
}
 public static void main(String args[]){
     int m= 4, n=5;
     System.out.println(countpaths(0, 0, m, n));
    }
}