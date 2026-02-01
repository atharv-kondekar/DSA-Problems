package two_pointer;

class Find_the_Index_of_the_First_Occurrence_in_a_String_28{
    public int strStr(String haystack, String needle) {
        
        for(int i = 0 ,j=needle.length() ; j <=haystack.length() ; i++,j++)
        {
            if(haystack.substring(i,j).equals(needle))
            {
                return i;
                // Here the substring(i,j) : i - includes & j- excludes
            }
        }

        return -1;
    }
}
