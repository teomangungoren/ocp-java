package coreJava.Enums;

enum Friends{
    Rachel,Ross,Chandler,Monica,Joey
}

public class EnumDemo {
    public static void main(String[] args) {
        Friends c1,c2,c3;

        System.out.println("Here are all friends constants:" + "and their ordinal values:  ");
        for(Friends f:Friends.values())
          System.out.println(f+" "+f.ordinal());

          c1=Friends.Chandler;
          c2=Friends.Joey;
          c3=Friends.Chandler;

          System.out.println();

          if(c1.compareTo(c2)<0)
            System.out.println(c1+" comes before "+c2);

            
          if(c1.compareTo(c2)>0)
            System.out.println(c2+" comes before "+c1);


            if(c1.compareTo(c3)==0)
            System.out.println(c1+" equals "+c2);

            System.out.println();

            if(c1.equals(c2))
             System.out.println("Error!");

             if(c1.equals(c3))
               System.out.println(c1+" equals "+c3);

               if(c1==c3)
                System.out.println(c1+" == "+c3);
    }
}
