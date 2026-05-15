import java.util.*;

class Seat{
    private String name;

    public Seat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void cancel(){}
    public void reserve(String name){}
    public boolean isOccupied(){return true;}
    public boolean match(String name){return true;}
}

class Group{
    private char type;
    private Seat[] seats;

    public Group(char type) {
        this.type = type;
    }
    public boolean reserve(){return true;}
    public boolean cancel(){return true;}
    public void show(){}
}

class Concert{
    private String hallName;
    private Group[] group = new Group[3];

    public void reserve(){}
    public void search(){}
    public void cancel(){}
    public void run(){
        
    }
}

public class ConcertExample {
    public static void main(String[] args) {

    }
}