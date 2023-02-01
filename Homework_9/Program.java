package Java.JavaHomework.Homework_9;

class Program {
    public static void main(String[] args) {
        Documents dc = new Documents();
        Worker worker = new Worker(22, 50000, "Bob");
        dc.addText(worker);
        dc.click();
        
        System.out.println();
        
        Worker worker2 = new Worker(23, 60000, "Sam");
        dc.addText(worker2);
        dc.click();

        System.out.println();

        Worker worker3 = new Worker(24, 100000, "Alex");
        dc.addText(worker3);
        dc.click();
    }
}
