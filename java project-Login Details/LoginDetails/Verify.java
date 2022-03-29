package LoginDetails;

import java.util.*;
import java.io.*;


public class Verify{
        int choice;
    public void displayOptions(){
        Scanner scn = new Scanner(System.in);

        char cha='y';
        System.out.println("Press 1 to display all contacts:");
        System.out.println("Press 2 to add a contact:");
        System.out.println("Press 3 to update a contact:");
        System.out.println("Press 4 to delete a contact:");

        do{
            System.out.print("\nEnter choice:");
            choice = scn.nextInt();

            switch(choice){
                case 1: System.out.println("Display members");
                        break;
                case 2: System.out.println("Add members");
                        break;
                case 3: System.out.println("Update members");
                        break;
                case 4: System.out.println("Delete members");
                        break;
            }
            System.out.print("Do you want to do any more operations? ");
            cha = scn.next().charAt(0);

        }while(cha=='Y' || cha=='y');
    }
}