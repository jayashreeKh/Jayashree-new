package ProgramsByMe;

public class PalindromString {

	static boolean isPalindrome(String str)
    {
 
        int a = 0, b = str.length() - 1;
 
        // While there are characters to compare
        while (a < b) {
 
            // If there is a mismatch
            if (str.charAt(a) != str.charAt(b))
                return false;
 
            // Increment first pointer and
            // decrement the other
            a++;
            b--;
        }
 
        // Given string is a palindrome  
        return true;
    }
 
    // Main driver method
    public static void main(String[] args)
    {
        String str = "JAAJ";
        String str2 = "Codemind";
 
        // Change strings to lowercase
       // str = str.toLowerCase();
      //  str2 = str2.toLowerCase();
 
        // For string 1
        System.out.print("String 1 :");
 
        if (isPalindrome(str))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
 
        // new line for better readability
        System.out.println();
 
        // For string 2
        System.out.print("String 2 :");
        if (isPalindrome(str2))
            System.out.print("It is a palindrome");
        else
            System.out.print("It is not a palindrome");
    }
}