public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
    
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return checkPalindrome(str, 0, str.length() - 1);
    }

    private static boolean checkPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return checkPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "Able was I ere I saw Elba";
        boolean result = isPalindrome(input);
        System.out.println(result);
    }
}
