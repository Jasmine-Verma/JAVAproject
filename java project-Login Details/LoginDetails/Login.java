package LoginDetails;

import java.io.*;
import java.util.*;

public class Login{
    boolean log;
    public boolean loginMember(String username, String password){
        try{
            File f = new File("C:\\Users\\Jasmine Verma\\Desktop\\Login Details\\members.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String record3;
            String[] ar = new String[2];

            while((record3 = br.readLine())!=null){
                StringTokenizer st = new StringTokenizer(record3,",");
                for(int i=0;i<2;i++){
                    ar[i] = st.nextToken();
                }
                if(username.equalsIgnoreCase(ar[0]) && password.equalsIgnoreCase(ar[1])){
                    log = true;
                    break;
                }else{
                    log = false;
                    continue;
                }
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return log;
    }
}