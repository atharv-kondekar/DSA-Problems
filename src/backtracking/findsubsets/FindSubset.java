package backtracking.findsubsets;

public class FindSubset {

    public static void findSubsetOfString(String str,String ans,int i){
        // Base
        if ( i == str.length() ){
            if(ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);

            return;
        }

        //Work
        findSubsetOfString(str,ans+str.charAt(i),i+1);  // Yes
        findSubsetOfString(str,ans,i+1);                    // No
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsetOfString(str,"",0);
    }
}
