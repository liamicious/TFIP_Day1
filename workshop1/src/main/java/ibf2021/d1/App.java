package ibf2021.d1;

import java.util.ArrayList;
import java.io.Console;

public class App {
   /*  list - list the contents of the cart. If the cart is empty, print an appropriate message. The contents of the cart should be numbered when you are listing them
    add - add one or more items to the cart. Multiple items are separated by a comma (,).
    You should not add an item that is already in the cart. Print an appropriate message.
    Item names are case sensitive (or you can try implementing case insensitive)
    delete - delete an item from the cart based on the item’s index (from list command). If an incorrect index is provided, display an error message */

    public static void main( String[] args ){
        
        //Declaration
        String action = "";

        // Define shopping list and print welcome message
        ArrayList<String> cart = new ArrayList<>(); 
        System.out.println( "Welcome to your Shopping Cart! " );
        Console cons = System.console();
        
        while(action.length() <= 0){
            action = cons.readLine();
            action.trim().toLowerCase();
            if(action == "list"){

            }
            else if (action == "add"){

            }
            else if (action == "delete"){

            }
            else {
                System.out.println("Invalid Entry, please try again. ");
                action = "";
            }
        }
    }
}
                /* case "list":
                if(cart.size()<1){
                    System.out.println("Your shopping cart is empty");
                    action = "";
                }
                else {
                    System.out.println(". ");
                    action = "";

                }            
                break;

                case "add":
                System.out.println("Add");
                action = "";

                break;

                case "delete":
                if(cart.size()<1){
                    System.out.println("Your shopping cart is empty");
                    action = "";

                }
                else{

                }
                break;

                default:
                System.out.printf("Try Again");
                action = "";

            }
        } 
    }      
} */
