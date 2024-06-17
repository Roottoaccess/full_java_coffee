class Command{
    Command(){ // This is a constructor
        System.out.println("This is the command line interface !");
    }

    public void cmd(){ // Normal public void method
        System.out.println("chmod is the command to provide the privilage or the permission to the file operation in operating system !");
    }
}
public class constructor {
    public static void main(String[] args) {
        Command obj = new Command();
        obj.cmd();
    }
}