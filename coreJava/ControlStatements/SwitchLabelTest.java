package coreJava.ControlStatements;

public class SwitchLabelTest {

    public static void main(String[] args) {
        
        int[][] numbers={
            {1,2,3},
            {4,5,6},
            {7,8,9}
       };
       searchNumber:for(int i=0;i<numbers.length;i++){
         for (int j = 0; j < numbers.length; j++) {
            System.out.println("Current Number"+numbers[i][j]);
            if(numbers[i][j]==5){
                System.out.println("Number 5 found: ");
                break searchNumber;
            }
         }
       }
       System.out.println("Search finished. ");
    }

}
