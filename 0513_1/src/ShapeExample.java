import java.util.*;

class Shape{
    Shape next;
    Shape prev;
    String type;

    void paint(){
        System.out.print(getShape());
    }
    void draw(){
        System.out.println(type + "이 연결됨.\n");
    }

    public Shape() {
        this.next = null;
        this.prev = null;
    }

    public String getShape(){
        return type;
    }
}

class Circle extends Shape{
    public Circle(){
        super();
        this.type = "Circle";
    }

    @Override
    void draw() {
        super.draw();
    }

    @Override
    public String getShape() {
        return super.getShape();
    }
}

class Rectangle extends Shape{
    public Rectangle(){
        super();
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        super.draw();
    }

    @Override
    public String getShape() {
        return super.getShape();
    }
}

class Triangle extends Shape{
    public Triangle(){
        super();
        this.type = "Triangle";
    }

    @Override
    void draw() {
        super.draw();
    }

    @Override
    public String getShape() {
        return super.getShape();
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape pStart = null;
        Shape pLast = null;
        int count = 0;

        while(true){
            System.out.print("1.push 2.pop 3.print 4.all del 5.Exit : ");
            int menu = sc.nextInt();
            if(menu == 1){
                System.out.print("도형선택(1.Circle 2.Triangle 3.Rectangle) : ");
                int input = sc.nextInt();

                Shape newShape = null;
                if(input == 1) newShape = new Circle();
                else if(input == 2) newShape = new Triangle();
                else if(input == 3) newShape = new Rectangle();

                newShape.draw();
                if(pStart == null){
                    pStart = newShape;
                    pLast = newShape;
                }else{
                    pLast.next = newShape;
                    newShape.prev = pLast;
                    pLast = newShape;
                }
                count++;

            }
            else if(menu == 2){
                if(pLast == null){
                    System.out.println("stack이 비었습니다.\n");
                }else{
                    System.out.println(pLast.getShape()+"이 삭제됨\n");
                    if(pLast.prev == null){
                        pLast = null;
                        pStart = null;
                    }else {
                        pLast = pLast.prev;
                        pLast.next = null;
                    }
                    count--;
                }
            }
            else if(menu == 3){
                if(pLast == null){
                    System.out.println("stack이 비었습니다.\n");
                }else{
                    Shape current = pStart;
                    for(int i = 0; i<count; i++){
                        current.paint();
                        if (current.next == null)
                            break;
                        System.out.print("->");
                        current = current.next;
                    }
                    System.out.println("\n");
                }
            }
            else if(menu == 4){
                while(pLast != null){
                    System.out.println(pLast.getShape()+"이 삭제됨");
                    if(pLast.prev == null){
                        pLast = null;
                        pStart = null;
                    }else {
                        pLast = pLast.prev;
                        pLast.next = null;
                    }
                }
                count = 0;
                System.out.println("stack이 비었습니다.\n");
            }
            else{
                System.out.println("종료합니다.");
                break;
            }
        }



    }
}