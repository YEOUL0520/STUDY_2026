import java.util.*;

public class Main {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);

        int[] upperCount = new int[26];
        int[] lowerCount = new int[26];

        int totalUpper = 0;
        int totalLower = 0;

        while (sc.hasNext()){
            String str = sc.next();
            for(char c: str.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    upperCount[c - 'A']++;
                    totalUpper++;
                } else if (c >= 'a' && c <= 'z') {
                    lowerCount[c - 'a']++;
                    totalLower++;
                }
            }
        }

        for(int i=0; i<upperCount.length; i++){
            if(upperCount[i]!=0){
                System.out.printf("%c(%02d)%s\n", (char)(65+i), upperCount[i], "-".repeat(upperCount[i]));
            }
        }
        System.out.println("대문자 합계 : "+ totalUpper);
        for(int i=0; i<lowerCount.length; i++){
            if(lowerCount[i]!=0){
                System.out.printf("%c(%02d)%s\n", (char)(65+i), lowerCount[i], "-".repeat(lowerCount[i]));
            }
        }
        System.out.println("소문자 합계 : "+ totalLower);
    }
}
