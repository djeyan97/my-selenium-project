package InterviewPreparation;

public class PalindromeCheck {

    public static void main(String[] args) {

        String original = "Madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The given string is Palindrome");
        } else  {
            System.out.println("The given string is not Palindrome");
        }





    }

}
