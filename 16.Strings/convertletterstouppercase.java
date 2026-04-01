import java.util.*;

public class convertletterstouppercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence of your choice: ");
        String sentence = sc.nextLine();
        StringBuilder sb = new StringBuilder(sentence);
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        for (int i = 0; i <= sentence.length()-1; i++) {
            if (sentence.charAt(i)==' ' && i<=sentence.length()-2){
                sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
            }
        }
        System.out.println("After converting each letter to the capital the final word is: "+sb);
        sc.close();
    }

}
