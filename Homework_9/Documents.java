package Java.JavaHomework.Homework_9;

class Documents implements Button{
    
    Worker wk;

    public void addText(Worker wk) {
        this.wk = wk;
    }

    @Override
    public void click() {
        System.out.println(saveAs());
    }


    protected String saveAs() {
        View v = new View();
        String format  = v.choise();
        if (format.equals("1"))
            return XML();
        else if (format.equals("2"))
            return HTML();
        else if (format.equals("3"))
            return MarkDown();
        else
            return null;
    }


    private String XML() {
        return String.format(
                "<xml>\n\t<Worker>\n\t\t<age>%d</age>\n\t\t<salary>%d</salary>\n\t\t<name>%s</name>\n\t</Worker>\n</xml>",
                wk.age, wk.salary, wk.name);

    }

    private String HTML() {
        return String.format(
                "<html>\n\t<Worker>\n\t\t<age>%d</age>\n\t\t<salary>%d</salary>\n\t\t<name>%s</name>\n\t</Worker>\n</html>",
                wk.age, wk.salary, wk.name);

    }

    private String MarkDown() {
        return String.format(
                "# Worker\n* Возраст: %d\n* Зарплата: %d\n* Имя: %s\n",
                wk.age, wk.salary, wk.name);

    }
}
