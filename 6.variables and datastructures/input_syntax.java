import java.util.*;
public class input_syntax {
    public static void main(String args[]) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); // name of scanner function is sc, main thing of input 
        // Read a single word from the user input (up to the first space)
        String input = sc.next();
        System.out.println(input); 
         //name of the string is input sc.next is used to take inout of only one word
        String name = sc.nextLine();
        
        System.out.println(name);            // sc.nextline is used to take inout the whole line oft he code
        // System.out.println(input);           // Output the input word
        int num  = sc.nextInt();
        System.out.println(num);
        float price = sc.nextFloat();
        System.out.println(price); 
        sc.close();                   // optional used to close the scanner function
    }
}
