package Week2.Week2;

public class alphabetCount {
    public static void main(String[] args) {
        //// String "aabbccddaabb" find repetitive elements with their values (count)
        //// a-2 b-2 c-2 d-2 a-2 b-2  //array list  // collections //  hashset

        //// a-4 b-4 c-2 d-2
        String input1 = "aabbccddaabb";
//                         01234567891011
        int count = 1;
        System.out.println("Length  = " + input1.length());
        for (int i = 1; i < input1.length(); i++) {
            if (input1.charAt(i) == input1.charAt(i - 1)) {
                count++;
                if (input1.length() - 1 == i) {
                    System.out.print(input1.charAt(i) + "-" + count);
                }
            } else if (input1.charAt(i) != input1.charAt(i - 1)) {
                System.out.print(input1.charAt(i - 1) + "-" + count);
                System.out.print(",");
                count = 1;
            }
        }
    }
}
