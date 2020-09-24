import java.util.Scanner;
//had to watch youtube video on how vigenere cipher works and  how it was used
// this code does not deal with spaces well, only works without spaces in string
public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String x = message.toUpperCase();
        String noknow = ""; 
  //for loop goes on until all letters are inputted
  //uses given key code below
        for (int i = 0; i < message.length(); i++) { 
            char axe = x.charAt(i);
            if (axe >= 65 && axe <= 90) {
                int biggie = (message.charAt(i) + key.charAt(i)) %26; 
                biggie += 'A'; 
                noknow += (char)(biggie); 
            }
            else {
                noknow += axe;
            }
        } 
      //encrypted text
        return noknow; 
    }

    public static String decryptVigenere(String message, String key) {
        String x = message.toUpperCase();
        String yesknow = ""; 
  //for loop that runs for as many characters that are in input
        for (int i = 0 ; i < message.length() &&  i < key.length(); i++)  { 
            char axe = x.charAt(i);
            if (axe >= 65 && axe <= 90) {
                int smalls = (message.charAt(i) - key.charAt(i) + 26) %26; 
                smalls += 'A'; 
                yesknow += (char)(smalls); 
            }
            else {
                yesknow += axe;
            }
        } 
        //decrypted message
        return yesknow; 
        
    }

//given code
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();
//for this to work the user must type key as same lenght of encrypted message
        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
