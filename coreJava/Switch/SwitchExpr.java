package coreJava.Switch;

import java.util.Scanner;

public class SwitchExpr {
    

       public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
           int code=sc.nextInt(); 

        int priorityLevel=switch(code){
            case 100,200,300 -> 1;
            case 400,500,600 -> 2;
            case 700,800,900 -> 3;
            default->0;
        };

        System.out.println("Priority level for code "+code+" is "+priorityLevel );

    
    }
}
