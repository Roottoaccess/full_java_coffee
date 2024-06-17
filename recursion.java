/* Printing all the even numbers till the limit */
import java.util.Scanner;
public class recursion extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int lmt = sc.nextInt();
        Engine(lmt, 1);
    }

    public static void Engine(int lmt,int i){
        try{
            if(i == lmt){
                if(i % 2 == 0){
                    System.out.print(i);
                }
                return;
            }
            if(i % 2 == 0){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        Engine(lmt, i + 1);
    }
}
