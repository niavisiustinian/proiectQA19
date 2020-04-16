import java.util.List;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("1.");

        Hello();
        Hello2();

        System.out.println("2.");
        Suma();

        System.out.println("3.");
        Restul();
        System.out.println("4.");
        System.out.println("a.");
        OperatieA();
        System.out.println("b.");
        OperatieB();
        System.out.println("c.");
        OperatieC();
        System.out.println("d.");
      OperatieD();

    }
    public static void Hello(){
        System.out.println("Hello ");
    }
    public static void Hello2(){
        System.out.println("Iustinian");
    }
    public static void Suma(){
        System.out.println(7+3);
    }
    public static void Restul(){
        System.out.println((float) 10 / 3);

    }
    public static void OperatieA(){
        System.out.println(-5 + 8 * 6);

    }
    public static void OperatieB(){
        System.out.println((55 + 9) % 9);

    }
    public static void OperatieC(){
        System.out.println(20 + -3 * 5 / 8);
    }
    public static void OperatieD(){
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

    }

}
