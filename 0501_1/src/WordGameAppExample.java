import java.util.*;
class Player{
    private String name;
    private String word;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String sayWord(){
        return word;
    }

    public boolean succeed(String lastWord){
        return lastWord.equals(String.valueOf(word.charAt(0)));
    }

    public String lastWord(){
        return String.valueOf(word.charAt((word.length()-1)));
    }
}

class WordGameApp{
    private String startWord = "아버지";
    private Player[] players;
    Scanner sc;
    int count;

    public WordGameApp() {
        sc = new Scanner(System.in);
    }

    public void createPlayers(){
        System.out.print("참여 인원수를 입력하세요 >> ");
        count = sc.nextInt();
        sc.nextLine();

        players = new Player[count];
        for (int i = 0; i<count; i++){
            players[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요 >> ");
            players[i].setName(sc.nextLine());
        }
    }
    public void run(){
        createPlayers();
        int turn = 0;
        System.out.println("시작하는 단어는 아버지입니다.");
        while(true){

            System.out.print(players[turn].getName() + ">> ");
            players[turn].setWord(sc.nextLine());
            if (players[turn].succeed(String.valueOf(startWord.charAt(startWord.length()-1))) == false){
                System.out.println(players[turn].getName() + "이 졌습니다.");
                break;
            }
            startWord = players[turn].sayWord();
            turn++;
            turn = turn % count;
        }
    }
}

public class WordGameAppExample {
    public static void main(String[] args) {
        WordGameApp wg = new WordGameApp();
        wg.run();
    }
}