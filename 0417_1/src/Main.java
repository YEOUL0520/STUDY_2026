import java.util.*;

public class Main {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("문자열의 개수 : ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print((i+1)+"번째 문자열 입력 : ");
            String str = sc.next();

            sb.append(str);
        }
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        String str = new String(arr);
        System.out.println("전체문자열의 문자 오름차순 : " + str);
    }
}
