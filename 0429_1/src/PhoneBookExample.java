import java.util.*;
class Phone{
    String name;
    String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public String getName() {
        return name;
    }
}

class PhoneBook{
    Scanner sc;
    Phone [] pArray;
    int count;

    public PhoneBook() {
        sc = new Scanner(System.in);
    }

    public void save(){
        for (int n = 0; n<count; n++){
            System.out.print((n+1) + ". 이름입력 : ");
            String name = sc.next();
            System.out.print((n+1) + ". 전화번호입력 : ");
            String tel = sc.next();
            pArray[n] = new Phone(name, tel);
        }

    }

    public String search(String name){
        for (int n = 0; n<count; n++){
            if (pArray[n].getName().equals(name)){
                return pArray[n].getTel();
            }
        }
        return null;
    }

    public void run(){
        System.out.print("저장할 인원 입력 : ");
        count = sc.nextInt();
        sc.nextLine();

        pArray = new Phone[count];

        save();

        while (true){
            System.out.print("검색할 이름 입력 (stop 입력 시 종료) : ");
            String name = sc.next();
            if(name.equals("stop"))
                break;
            if(search(name) == null)
                System.out.println(name + "는 저장목록에 없습니다.");
            else
                System.out.println(name + "의 번호는 " + search(name) + "입니다.");
        }
    }
}

public class PhoneBookExample {
    public static void main(String args[]) throws Exception{
        PhoneBook pb = new PhoneBook();
        pb.run();
    }
}
