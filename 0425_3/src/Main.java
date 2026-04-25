import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int student[] = new int[5];
        String result[] = new String[5];
        for(int n=0; n<5; n++){
            for(int m = 0; m<4; m++){
                student[n] += sc.nextInt();
            }
            if (student[n]/4 >= 80){
                result[n] = "pass";
                count++;
            }
            else
                result[n] = "fail";
        }

        for(int n=0; n<5; n++){
            System.out.println(result[n]);
        }
        System.out.print("Successful : " + count);
    }
}
