import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String args[]) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int num1 = Integer.parseInt(br.readLine());
     int num2 = Integer.parseInt(br.readLine());

     int c1 = num2%10;
     int c2 = (num2/10)%10;
     int c3 = (num2/100)%10;

     int first = num1*c1;
     int sec = num1*c2;
     int third = num1*c3;

     System.out.println(first);
     System.out.println(sec);
     System.out.println(third);
     System.out.println(third*100+sec*10+first);
    }
}
