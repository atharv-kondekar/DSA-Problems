package two_pointer;

class Valid_Palindrome_125_01 {
    // this code beats in 2ms
    public boolean isPalindrome(String s) {
    
        if( s.isBlank() )
            return true;
        
        s = s.toLowerCase();

        int left = 0;
        int right = s.length()-1;

        while(left<=right)
        {
            char a = s.charAt(left);
            char b = s.charAt(right);

            int ascii1=(int) a;
            int ascii2=(int) b;

            // It is faster than using the "! Charatcer.LetterOrDigit(a)" beacuse it takes the time pf 1ms for calling method
            if( !(ascii1>=97 && ascii1 <= 122) &&  !( ascii1>= 48 && ascii1 <= 57) )
            {
                left++;
                continue;
            }

            if( !(ascii2>=97  && ascii2<= 122) && !(ascii2>=48  && ascii2<=57)  )
            {
                right--;
                continue;
            }

            if(ascii1 != ascii2)
                return false;
            
            right--;
            left++;
        }

        return true;
    }
}
