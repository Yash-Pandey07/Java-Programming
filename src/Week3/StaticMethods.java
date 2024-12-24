package Week3;

public class StaticMethods {

    public static void main(String[] args) {

//        Student a = new Student("A");
//        Student b = new Student("B");
//        Student c = new Student("c");

//        System.out.println(b.toString());
//        System.out.println(c.toString());
//        System.out.println(b.compareTo(a));

        if (args.length > 0) {
            System.out.println("First argument: " + args[0]);
        } else {
            System.out.println("No arguments provided.");
        }


    }
}


/*
Public Class
You can have multiple classes in a single file,
but only one of them can be public. The other classes will have package-private access by default,
meaning they are accessible only within the same package.

Static Methods

*/