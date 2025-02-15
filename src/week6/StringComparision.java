package week6;

public class StringComparision {
    public static void main(String[] args) {
//        String name = "ABC";
//        String name1 = "ABC";
//        String name2 = "abc";
//
//        StringBuffer country =  new StringBuffer("INDIA");
//        StringBuffer country1 = new StringBuffer("INDIA");
//
//        System.out.println(name.equals(name1));
//        System.out.println(name.equals(name2));
//
//        System.out.println(name.equalsIgnoreCase(name2));
//
//        System.out.println(country.equals(country1));
//
//        System.out.println(name == name1);
//        System.out.println(country == country1);
//
//        String finalString = name + name1 + name2;
//        System.out.println(finalString);
//
//        String secString = name.concat(name1).concat(name2);
//        System.out.println(secString);

        //String immutable
        String name4 = "Java";
        name4.concat(" String");
        System.out.println(name4);

        StringBuffer name5 = new StringBuffer("Java");
//        name5.append("Buffer");
//        System.out.println(name5);

        name5.insert(4,"Features");
        System.out.println(name5);

        name5.replace(0,4,"jAVA");
        System.out.println(name5);

        name5.delete(4,12);
        System.out.println(name5);

        name5.reverse();
        System.out.println(name5);
    }
}
