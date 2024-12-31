package constructor;

class Example2{
    private int x,y;

    Example2(){
        this.x =1;
        this.y =2;
        System.out.println("Default ");
    }
    Example2(int x , int y){
        this.x = x;
        this.y = y;
        System.out.println("Custom ");
    }
    void f1(int x , int y){
        this.x = x;
        this.y = y;
    }

    void display(){
        int x = 100 , y= 200 ;
        System.out.println(x +" : "+y);
        System.out.println("This x -> "+this.x +" this y -> "+this.y);
    }
}
public class ThisK {
    public static void main(String[] args) {
        Example2 eg1 = new Example2();
        eg1.display();

        Example2 eg2 = new Example2(3,5);
        eg2.display();
    }
}
