import java.util.Scanner; // Import the Scanner class

public class Main {
  public int occasionInput;

  public static void main(String[] args) {
     System.out.println("Welcome card Organizer App!"); // Welcome Message!
     Scanner senderName = new Scanner(System.in);
    System.out.println("Please Enter your name");
    String sender = senderName.nextLine();

    Scanner recipientName = new Scanner(System.in);
    System.out.println("Please Enter recipient name");
    String recipient = recipientName.nextLine();

    Scanner message1 = new Scanner(System.in);   
    System.out.println("Please Enter message");
    String message = message1.nextLine();

    Scanner occasion1 = new Scanner(System.in);   
    System.out.println("Please enter occasion");
    String occasion = occasion1.nextLine();


  }
}
