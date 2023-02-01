package Java.JavaHomework.Homework_7;

public class Controller {
    public static void run(){
        Children child = new Children("Коля", "Иванов", 16, "Сын");
        System.out.println(child);
        System.out.println(child.mother());
        System.out.println(child.father());
        System.out.println(child.grandFather());
        System.out.println(child.grandMother());
    }
}
