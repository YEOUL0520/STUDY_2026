import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str_split[] = str.split(" ");
        int max = 0;
        int maxidx = 0;
        for(int i=0; i<str_split.length; i++){
            if(str_split[i].length()>max){
                max = str_split[i].length();
                maxidx = i;
            }
        }
        System.out.println("입력한 단어의 개수 : " + str_split.length);
        System.out.println("가장 긴단어 : " + str_split[maxidx]);
    }
}
