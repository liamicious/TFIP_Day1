package ibf2021.d1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
       public static void main(String[] args) {

        // Declaration of shopping cart
        ArrayList<String> cart = new ArrayList<>();

        // Welcome message to user:
        System.out.println("Welcome to your shopping cart! ");
        System.out.println("1. list ");
        System.out.println("2. add ");
        System.out.println("3. delete ");
        System.out.println("Please enter your desired command: ");

        // Init scanner
        Scanner scanner = new Scanner(System.in);
        String command = scanner.next();                                // Scan user input for first string (list/add/delete)
        command = command.toLowerCase();
        String item = scanner.nextLine();                               // Scan remainder of user input for item
        item = item.toLowerCase();

        // Check for invalid commands and exit if true
        if (!"list".equals(command) && !"add".equals(command) && !"delete".equals(command) && !"exit".equals(command)) {
                System.out.println("Invalid command, program will exit.");
                scanner.close();
                return;     
        }

        // To keep program running
        while(!"exit".equals(command)){
            // Start of list function
            if("list".equals(command.trim())){
                if(cart.size() <=0 ){
                    System.out.println("Your shopping cart is empty.");
                }
                else{
                    for(int i =0; i < cart.size(); i++){
                        System.out.println(i+1 + ". " + cart.get(i));
                    }
                }
                command = scanner.next();
                item = scanner.nextLine();
                item.trim().split(",");
            }
            // Start of add function
            else if("add".equals(command.trim())){    
                while ("".equals(item.trim())) {
                    System.out.println("Please add an item or seperate the items with a comma");
                    command = scanner.next();
                    item = scanner.nextLine();
                    item.trim().split(",");
                }
                    String[] tempCart = item.trim().split(",");
                    for (int i = 0; i < tempCart.length; i++) {             // check i against total entries/length of array
                        if (cart.contains(tempCart[i].trim())) {
                                System.out.println("You already have " + tempCart[i] + " in your cart");
                        }

                        else{
                                cart.add(tempCart[i].trim());
                                System.out.println(tempCart[i].trim() + " added to the cart");
                        }        
                    }
                command = scanner.next();
                item = scanner.nextLine();
                item.trim().split(",");
            }
            else if("delete".equals(command.trim())){
                int position = -1;
                while (position == -1) {
                    try {
                        position = Integer.parseInt(item.trim());               // Update position number from -1 to user's input in console
                    } catch (NumberFormatException nfe) {                       // catch for invalid user input
                        System.out.println("Please provide a number");
                    }

                    if ((position > 0) && position <= cart.size()) {
                        String remove = cart.remove(position-1);                // updated item to name of deleted item
                        System.out.println(remove + " removed from cart");
                        break;
                    }

                    System.out.println("Incorrect item index, please enter correct index number");
                    item = scanner.next();
                    item.trim().split(",");
                    position = -1;
                }         

                command = scanner.next();
                item = scanner.nextLine();
                item.trim().split(",");
            }

            else{
                System.out.println("Invalid command, program will exit.");
                scanner.close();
            }
        }
        
        scanner.close();
        System.out.println("Program has ended.");
    }
}
