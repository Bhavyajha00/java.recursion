public class recusion3 {
    public static void printpermutation(String str, int idx, String perm){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length();i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0,i)+ str.substring(i+1);
            printpermutation(newstr, idx+1, perm+currChar);
        }
    }
    public static void main (String args[]) {
        String str = "abc";
        printpermutation(str, 0, " ");
    }
}
