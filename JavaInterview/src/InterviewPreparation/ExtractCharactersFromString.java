package InterviewPreparation;

public class ExtractCharactersFromString {
    public static void main(String[] args) {

        String str = "DeepakJeyan";

        String FirstName = str.substring(0,6);
        String LastName = str.substring(str.length()-5,str.length());

        System.out.println("First Name: " + FirstName);
        System.out.println("Last Name: " + LastName);

    }
}
