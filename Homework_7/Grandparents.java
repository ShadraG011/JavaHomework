package Java.JavaHomework.Homework_7;


public class Grandparents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;

    public String grandMother(){
        firstName = "Евдокия";
        secondName = "Петрова";
        age = 38;
        status = "Бабушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
    public String grandFather(){
        firstName = "Александр";
        secondName = "Петров";
        age = 40;
        status = "Бабушка";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }
    
}