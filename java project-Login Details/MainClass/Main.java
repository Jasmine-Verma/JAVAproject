package MainClass;

import LoginDetails.*;

import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        try{
            Login l = new Login();
            Verify v = new Verify();

            String uname, pwd;

            Scanner scn = new Scanner(System.in);

            System.out.println("---------------------------------------------------------------");
            System.out.println("-------------------------FRIEND'S LIST-------------------------");
            System.out.println("---------------------------------------------------------------");

            System.out.println("Enter Username:");
            uname = scn.nextLine();
            System.out.println("Enter Password:");
            pwd = scn.nextLine();        

            boolean verified = l.loginMember(uname, pwd);

            if(verified == true){
                v.displayOptions();
            }else{
                char cha1 = 'n';
                String runame, rpwd;

                File f = new File("C:\\Users\\Jasmine Verma\\Desktop\\Login Details\\members.txt");
                FileWriter fw = new FileWriter(f, true);
                BufferedWriter bw = new BufferedWriter(fw);

                System.out.println("Login Failed!");
                System.out.println("\nDo you want to register? ");
                cha1 = scn.next().charAt(0);

                if(cha1=='Y' || cha1=='y'){
                    scn.nextLine();
                    System.out.print("Enter username:");
                    runame = scn.nextLine();
                    System.out.print("Enter password:");
                    rpwd = scn.nextLine();

                    bw.flush();
                    bw.newLine();
                    bw.write(runame+","+rpwd);

                    System.out.println("Registeration Succesfull!\n");                    
                    v.displayOptions();
                }else{
                    System.out.println("You denied to register!");
                }
                bw.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}