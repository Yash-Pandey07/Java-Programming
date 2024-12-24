package Week3;

public class Car implements Vehicle{
    private int gear;
    private int speed;

    public void changeGear(int gear){
        this.gear = gear;
    }
    public void speedUp(int change){
        this.speed += change;
    }
    public void slowDown(int change){
        this.speed -= change;
    }

    public void display(){
        System.out.println("speed :"+ this.speed + " gear "+ this.gear);
    }
}
