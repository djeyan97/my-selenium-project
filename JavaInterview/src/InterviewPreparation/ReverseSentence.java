package InterviewPreparation;

public class ReverseSentence {
    public static void main(String[] args) {

        String Sentence = "I am IronMan";
        String[] str = Sentence.split(" ");
        String Reverse = "";

        for(int i = str.length-1; i >= 0; i--){
            Reverse += str[i] + " ";
        }

        System.out.println(Reverse);





    }
}
