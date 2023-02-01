package Java.JavaHomework.Homework_7;

public class Parents extends Grandparents{
    private String firstName;
    private String secondName;
    private int age;
    private String status;
    
    public String mother(){
        firstName = "Мария";
        secondName = "Иванова";
        age = 38;
        status = "Мама";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }

    public String father(){
        firstName = "Павел";
        secondName = "Иванов";
        age = 40;
        status = "Папа";
        return String.format("Статус:%s, Имя: %s %s, возраст: %d.", status, firstName, secondName, age);
    }

}
