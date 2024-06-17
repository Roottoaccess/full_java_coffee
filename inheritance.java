import java.util.Scanner;
/* Super class */
class A{
    int x;
    public void Display(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        x = sc.nextInt();
    }
}
/* Sub class */
class B extends A{
    public void logic(){
        if(x % 2 == 0){
            System.out.println("Entered an even number!");
        } else {
            System.out.println("Entered a odd number !");
        }
    }   
}
public class inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.Display();
        obj.logic();        
    }
}
