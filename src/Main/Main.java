package Main;

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
//    Array();
//    set();
//    ArrayList();
//    Map();
//    Pratice();
    Objects1();

    }

    private static void Objects1() {
        class Student{
            int id;
            String name;
        }

        Student s1=new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }

    private static void Basic() {
        //System.out.println(a);
        int a = 10;

        //Input from user
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int number = sc.nextInt();

        System.out.println(number);

        //Conditions and Booleans
        int x=3, y=7 ,z=9;
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

        int[] numArray = {5,7,8,9,10 ,15};
        for(int i : numArray){
            //System.out.println(i);
        }
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
        t.add(2,3);     //append
        t.set(4,6);
        Integer t4 = t.get(4);
        System.out.println(t);
        System.out.println(t4);
        System.out.println(t.size());
        System.out.println(t.subList(0,5));
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
        m.put("Yash" , 7);
        m.put("Yash" , 7);
        m.put("Yash2" , 7);
        //System.out.println(m);
        System.out.println(m.get("Yash"));

        //TreeMap
        TreeMap tm = new TreeMap();     // data stored need to be in a order
        tm.put("z" , 73);
        tm.put("x" , 14);
        tm.put("y" , 53);
        tm.put("a" , 23);
        tm.put("v" , 73);
        tm.put("b" , 74);
        System.out.println(tm);
    }
    public static void Pratice() {
        //pratice to store and print each char in a string
        Map<Character, Integer> m = new HashMap();
        String str = "the quick brown fox jumps over the lazy dog";

//        for(int i=0;i<str.length();i++){
//            m.put(str.charAt(i),i);
//        }
//        System.out.println("String length is "+ (m.size()+1));
        for(char x : str.toCharArray()){
            if(m.containsKey(x)){
                int oldCount = m.get(x);
                m.put(x,oldCount+1);
            }
            else {
                m.put(x,1);
            }
        }
        m.remove(' ');
        System.out.println(m);
    }
}