package two_pointer;

class Valid_Palindrome_125_02 {

  // This Solution takes the 3ms of the Running time 
    public boolean isPalindrome(String s) {
        
        if (s.isBlank())
            return true;
        
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            // "!Character.isLetterOrDigit(a)" Calling this Method takes extra time 
            if (!Character.isLetterOrDigit(a)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(b)) {
                right--;
                continue;
            }

            if (a != b)
                return false;

            left++;
            right--;
        }

        return true;
    }
}
