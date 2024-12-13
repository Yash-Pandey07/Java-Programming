package Main.Animal;

public class Animal {
    private String name;
    private  int age;


    public Animal(String name , int age) {
        this.name = name;
        this.age = age;
        myPriavte();
    }
    public void speak(){
        System.out.println("I am "+ this.name + " and i am " + this.age + " years old !");
    }

    private void myPriavte(){
        System.out.println("Private !!!");
    }
}
