import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<3; i++){
            System.out.print("문자열 입력 : ");
            String str = sc.nextLine();
            str = str.replace("zero","0");
            str = str.replace("one","1");
            str = str.replace("two","2");
            str = str.replace("three","3");
            str = str.replace("four","4");
            str = str.replace("five","5");
            str = str.replace("six","6");
            str = str.replace("seven","7");
            str = str.replace("eight","8");

            System.out.println("숫자 출력 : " + str);
        }
    }
}
