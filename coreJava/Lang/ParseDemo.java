import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in,System.console().charset()));
        String str;
        int i;
        int sum=0;

        System.out.println("Enter numbers,0 t0 quit");
        do{
            str=br.readLine();
            try{
                i=Integer.parseInt(str);
            }catch(NumberFormatException e){
                System.out.println("Invalid format");
                i=0;
            }
            sum+=i;
            System.out.println("Current sum is: "+sum);
        }while(i!=0);
    }
}
