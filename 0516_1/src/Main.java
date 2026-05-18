import java.util.*;

class Robot{

}

class DanceRobot extends Robot{
    public void dance(){

        System.out.println("로봇이 춤을 춥니다.");
    }
}

class DrawRobot extends Robot{
    public void draw(){

        System.out.println("로봇이 노래를 합니다.");
    }
}

class SongRobot extends Robot{
    public void song(){

        System.out.println("로봇이 그림을 그립니다.");
    }
}

public class Main {
    public static void action(Robot r){
        if (r instanceof DanceRobot dr){ dr.dance(); }
        else if (r instanceof  DrawRobot dr){ dr.draw(); }
        else if (r instanceof SongRobot sr){ sr.song(); }
    }
    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new DrawRobot(), new SongRobot() };
        for (Robot r : arr){ action(r); }
    }
}