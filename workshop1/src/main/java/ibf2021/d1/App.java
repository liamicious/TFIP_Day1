package ibf2021.d1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Console;

public class App {
    /*  
    add - add one or more items to the cart. Multiple items are separated by a comma (,).
    You should not add an item that is already in the cart. Print an appropriate message.
    Item names are case sensitive (or you can try implementing case insensitive)
    delete - delete an item from the cart based on the item’s index (from list command). If an incorrect index is provided, display an error message 
    */

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
        // Scan user input for first string (list/add/delete)
        String command = scanner.next();
        command = command.toLowerCase();
        // Scan remainder of user input for fruits
        String fruit = scanner.nextLine();
        fruit = fruit.toLowerCase();

        // To keep program running
        while(!"exit".equals(command)){
            
            if("list".equals(command)){
                if(cart.size() <=0 ){
                    System.out.println("Your shopping cart is empty.");
                }
                else{
                    for(int i =0; i < cart.size(); i++){
                        System.out.println(i+1 + ". " + cart.get(i));
                    }
                }
            }
            else if(command.trim().equals("add")){
                String line = command;
                String line2 = line.substring(4);
                String[] items = line2.trim().split(",");

                for (String item : items) {
                    cart.add(item.trim());
                    System.out.println(line2 + " added to cart");
                }
            }

            else if(command.trim().equals("delete")){
                int position = -1;

                while(position == -1){
                    try{
                        String line = command;
                        String line2 = line.substring(7);

                        //Convert string into interger to save into position
                        position = Integer.parseInt(line2.trim()) -1;
                    }
                    catch (NumberFormatException nfe) {
                        System.out.println("Please provide a number.");
                        //command = console.readLine();
                        //command = command.toLowerCase();
                    }
                    if(position >0 && position < cart.size()){
                        String item = cart.remove(position);
                        System.out.println(item + " was removed from cart.");
                    }
                }
            }

            else{
                System.out.println("Please try again: ");
            }
            // prompt for user next action
            //command = console.readLine();
            command = scanner.next();
            fruit = scanner.nextLine();
            }

        }

    }
    
