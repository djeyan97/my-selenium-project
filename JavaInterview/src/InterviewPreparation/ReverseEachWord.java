package InterviewPreparation;

public class ReverseEachWord {

    public static void main(String[] args) {

        String sentence = "My Name is Deepak Jeyan";
        String[] words = sentence.split(" ");
        String result = "";

        for(String word : words){
            String reversedWord = "";
            for(int i = word.length()-1; i >= 0; i--){
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";

        }
        System.out.println(result);
    }
}
