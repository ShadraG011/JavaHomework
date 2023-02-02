package Java.JavaHomework.Homework_12.JavaVersion;

class Controler {
    private Model model = new Model();
    private Viev view = new Viev();
    private WriteToFile write = new WriteToFile();

    protected void readContactList(){
        view.vievContacts(model.readName(), model.readNumber());
    }

    protected void writeContactList(){
        write.writeName(view.getName());
        write.writeNumber(view.getNumber());
    }
}