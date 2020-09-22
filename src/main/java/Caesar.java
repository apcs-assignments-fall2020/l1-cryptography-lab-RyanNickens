import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
      String x = message.toUpperCase();
      String w = "";
      String y = "";
      for (int i = 0; i < message.length(); i++){
        char axe = x.charAt(i);
        if (axe >= 65 && axe <= 87) {
          axe = (char) (axe + 3); 
          w = w + axe; 
          //return axe;
        }
        if (axe == 88) {
          axe = (char) (65); 
          w = w + axe;
          //return axe;
        }
        if (axe == 89) {
          axe = (char) (66);
          w = w + axe;
          //return axe;
        }
        if (axe == 90) {
          axe = (char) (67);
          w = w + axe;
          //return axe;
        }
        if (axe < 65 && axe > 87) {
          axe = (char) (axe);
          w = w + axe;
        }
        
      }
      y = w.toLowerCase();
      return(y);
    }

    public static String decryptCaesar(String message) {
      String x = message.toUpperCase();
      String w = "";
      String y = "";
      for (int i = 0; i < message.length(); i++){
        char axe = x.charAt(i);
        if (axe >= 68 && axe <= 90) {
          axe = (char) (axe - 3);
          w = w + axe;
          //return axe;
        }
        if (axe == 67) {
          axe = (char) (90); 
          w = w + axe; 
          //return axe;
        }
        if (axe == 66) {
          axe = (char) (89);
          w = w + axe;
          //return axe;
        }
        if (axe == 65) {
          axe = (char) (88);
          w = w + axe;
          //return axe;
        }
        if (axe < 68 && axe > 90) {
          axe = (char) (axe);
          w = w + axe;
        }
        //w = w + (axe);
      }
      y = w.toLowerCase();
      return(y);
        //return message;
        
    }

    public static String encryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
