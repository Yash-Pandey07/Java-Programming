package Main;

import Main.Animal.Animal;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.reflect.Method;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//        System.out.println("\n");
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//    Basic();
//        Loops();
//    Array();
//    set();
//    ArrayList();
//    Map();
//    Practice();
//    Objects1();                 //Initialization through Reference Variable
//    Objects2();                 //Initialization through Method
//    Objects3();                 //Initialization through a Constructor
//    Employee();                 //Object and Class Example: Employee
//    Rectangle1();               //Object and Class Example: Rectangle
//    Account();                  //Real World Example: Account
//        ClassAnimal();
//        PrivateClass();
//        PrivateClass2();
        GarbageCollector();


    }

    public void finalize(){System.out.println("object is garbage collected");}

    private static void GarbageCollector() {
        GarbageEx g1 = new GarbageEx();
        GarbageEx g2 = new GarbageEx();
        g1 = null;
        g2 = null;
        System.gc();
    }

    private static void PrivateClass2() {
        try {
            Class<?> c = Class.forName("Main.PrivateClass2");
            Object o = c.getDeclaredConstructor().newInstance();
            Method m = c.getDeclaredMethod("display");
            m.setAccessible(true);
            m.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void Loops() {

        Random randomNumber = new Random(1);
        //If-Else Statements
        int number = randomNumber.nextInt();
        System.out.println("Number is : " + number);
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        //For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        //Switch Statement
        int day = randomNumber.nextInt(7);
        System.out.println("Day number is : " + day);
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Fun day ,  SUNDAY !");

        }
    }

    private static void PrivateClass() {
        PrivateClass outer = new PrivateClass();
        outer.callInnerPrivateMethod();
    }

    private static void ClassAnimal() {
        Animal animal1 = new Animal("Bhaww", 5);
        animal1.speak();


    }

    private static void Account() {
        class Account {
            int acc_no;
            String name;
            float amount;

            //Method to initialize object
            void insert(int a, String n, float amt) {
                acc_no = a;
                name = n;
                amount = amt;
            }

            //deposit method
            void deposit(float amt) {
                amount = amount + amt;
                System.out.println(amt + " deposited");
            }

            //withdraw method
            void withdraw(float amt) {
                if (amount < amt) {
                    System.out.println("Insufficient Balance");
                } else {
                    amount = amount - amt;
                    System.out.println(amt + " withdrawn");
                }
            }

            //method to check the balance of the account
            void checkBalance() {
                System.out.println("Balance is: " + amount);
            }

            //method to display the values of an object
            void display() {
                System.out.println("acc no : " + acc_no + ", name : " + name + ", amount : " + amount);
            }
        }

        Account a1 = new Account();
        a1.insert(832345, "Ankit", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }

    private static void Rectangle1() {
        class Rectangle {
            int length;
            int width;

            void insert(int l, int w) {
                length = l;
                width = w;
            }

            void calculateArea() {
                System.out.println(length * width);
            }
        }
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.insert(11, 5);
        r2.insert(3, 15);
        r1.calculateArea();
        r2.calculateArea();
    }

    private static void Employee() {
        //Object and Class Example: Employee
        class Employee {
            int id;
            String name;
            float salary;

            void insert(int i, String n, float s) {
                id = i;
                name = n;
                salary = s;
            }

            void display() {
                System.out.println(id + " " + name + " " + salary);
            }
        }
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.insert(101, "Ajeet", 45900);
        e2.insert(102, "Raul", 256700);
        e3.insert(103, "Nakul", 664500);
        e1.salary = 45000;
        e1.display();
        e2.display();
        e3.display();

    }

    private static void Objects3() {
        class Student {
            int id;
            String name;

            // Constructor with parameters
            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            // Method to display student information
            public void displayInformation() {
                System.out.println("Student ID: " + id);
                System.out.println("Student Name: " + name);
            }
        }
        // Creating objects of Student class with constructor
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Smith");
        // Displaying information of the objects
        student1.displayInformation();
        student2.displayInformation();
    }

    private static void Objects2() {
        class Student {
            int rollno;
            String name;

            void insertRecord(int r, String n) {
                rollno = r;
                name = n;
            }

            void displayInformation() {
                System.out.println(rollno + " " + name);
            }
        }

        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(111, "Karan");
        s2.insertRecord(222, "Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }

    private static void Objects1() {
        class Student {
            int id;
            String name;
        }
//Initialization through Reference Variable
//        Student s1=new Student();
//        s1.id = 101;
//        s1.name = "Sam";
//        System.out.println("Id : "+s1.id);
//        System.out.println("name : "+s1.name);
        //Creating objects
        Student s1 = new Student();
        Student s2 = new Student();
        //Initializing objects
        s1.id = 101;
        s1.name = "Sonoo";
        s2.id = 102;
        s2.name = "Amit";
        //Printing data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }

    private static void Basic() {
        //System.out.println(a);
        int a = 10;

        //Input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.next();
        System.out.println(str);
        System.out.println("Enter a Number ");
        int number = sc.nextInt();

        System.out.println(number);

        //Conditions and Booleans
        int x = 3, y = 7, z = 9;

        //data types
        int age = 25;
        char grade = 'A';
        float salary = 5000.50f;
        boolean isJavaFun = true;

    }

    private static void Array() {
        //Array
        Scanner sc = new Scanner(System.in);
        //int n =  sc.nextInt();
//        int[] numArray = new int[];

//        for(int i = 0; i <n ; i++ ){
//            numArray[i] = sc.nextInt();
//        }

//        for(int i = 0;i <n ; i++ ){
//            System.out.println(numArray[i]);
//        }

        int[] numArray = {5, 7, 8, 9, 10, 15};
//        for(int i : numArray){
//            System.out.println(i);
//        }
    }

    public static void set() {
        //SET
        Set<Integer> s = new HashSet<Integer>();
        s.add(3);
        s.add(5);
        s.add(5);
        s.add(8);
        s.add(9);
        int tSize = s.size();
        System.out.println(s + " size : " + tSize);
        s.remove(9);
        tSize = s.size();
        System.out.println(s + " size : " + tSize);

    }

    public static void ArrayList() {
        //ArrayList
        ArrayList<Integer> t = new ArrayList<Integer>();        //define
        t.add(1);           //add
        t.add(2);
        t.add(4);
        t.add(5);
        t.add(6);           //add
        t.add(7);
        t.add(8);
        t.add(9);
        t.add(2, 3);     //append
        t.set(4, 6);
        Integer t4 = t.get(4);
        System.out.println(t);
        System.out.println(t4);
        System.out.println(t.size());
        System.out.println(t.subList(0, 5));
        // Creating an iterator
        Iterator value = t.iterator();

        // Displaying the values after iterating through the iterator
//        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

    }

    public static void Map() {
        //Map
        Map m = new HashMap();      // no order of data stored and key & map can be stored in any order
        m.put("Yash", 7);
        m.put("Yash", 7);
        m.put("Yash2", 7);
        //System.out.println(m);
        System.out.println(m.get("Yash"));

        //TreeMap
        TreeMap tm = new TreeMap();     // data stored need to be in a order
        tm.put("z", 73);
        tm.put("x", 14);
        tm.put("y", 53);
        tm.put("a", 23);
        tm.put("v", 73);
        tm.put("b", 74);
        System.out.println(tm);
    }

    public static void Practice() {
        //pratice to store and print each char in a string
        Map<Character, Integer> m = new HashMap();
        String str = "the quick brown fox jumps over the lazy dog";

//        for(int i=0;i<str.length();i++){
//            m.put(str.charAt(i),i);
//        }
//        System.out.println("String length is "+ (m.size()+1));
        for (char x : str.toCharArray()) {
            if (m.containsKey(x)) {
                int oldCount = m.get(x);
                m.put(x, oldCount + 1);
            } else {
                m.put(x, 1);
            }
        }
        m.remove(' ');
        System.out.println(m);
    }
}