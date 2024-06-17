class addition{
    void add(int x,int y){
        int result = x + y;

        System.out.println(result);
    }
    /* Method Over */
    void add(){
        int x = 25; int y = 125;
        int result = x + y;
        System.out.println(result);
    }
}


public class method_overloading {
    public static void main(String[] args) {
        addition obj = new addition();

        obj.add(15,35);
    }
}
