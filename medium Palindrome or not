public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int caseNumber = 1; 
        String input = "MADAM"; 
        switch (caseNumber) {
            case 1:
                if (isPalindrome(input)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }
                break;
                
            case 2:
                if (isPalindrome(input)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not Palindrome");
                }
                break;

            default:
                System.out.println("Invalid case");
                break;
        }
    }
}
