class Data{
    private int value;
    public void setData(){
        value = 25;
    }

    public void getData(){
        System.out.println(value);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Data obj = new Data();
        obj.setData();
        obj.getData();
    }
}