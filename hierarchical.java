import java.util.Scanner;
class input{
    int year;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any year you want: ");

        year = sc.nextInt();
    }
}

class algorithm extends input{
    public void logic(){
        if(year % 4 == 0){
            System.out.println("Leap Year....");
        } else if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("Leap Year....");
            }
            else{
                System.out.println("Not a leap year....");
            }
        } else{
            System.out.println("Not a leap year....");
        }
    }
}
public class hierarchical {
    public static void main(String[] args) {
        algorithm obj = new algorithm();
        obj.getData();
        obj.logic();
    }
}
