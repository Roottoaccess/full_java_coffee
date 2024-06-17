import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the array: ");

        int lmt = sc.nextInt();

        int arr[] = new int[lmt];
        System.out.println();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < lmt; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Array is ......");
        for(int i: arr){
            System.out.print(i+" ");
        }

        Engine(lmt, arr);
    }

    public static void Engine(int lmt, int arr[]){
        int max = arr[0];

        for(int i = 1; i < lmt - 1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println();
        System.out.println("The maximum valur from the array is: "+max);
    }
}
