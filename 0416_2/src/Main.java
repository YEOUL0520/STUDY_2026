import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception{
        System.out.print("문자열 입력 : ");
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        String new_st[] = st.split("[=&]");

        System.out.println("name : " + new_st[1]);
        System.out.println("score : " + new_st[3]);
        System.out.println("course : " + new_st[5]);
    }
}
