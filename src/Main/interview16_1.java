package Main;
// array & print an array then reverse
public class interview16_1 {
    public static void main(String args[]) {
        int[] NewArray = {1, 2, 3, 4, 5};
//    int[] NewArray1 = new NewArray[];

        int[] result = printMethod(NewArray);
        int size = result.length;
//        for (int j = 0; j < size; j++) {
//            System.out.println(result[j]);
//        }

        Integer s = 5;
        System.out.println(s.getClass().getSimpleName());
    }
    public static int[] printMethod(int[] NewArray){
        for(int i=0;i<NewArray.length/2;i++){
            int a = NewArray[i];
            NewArray[i] = NewArray[NewArray.length-1-i];
            NewArray[NewArray.length-1-i] = a;
        }
        return NewArray;
    }


//    String AA ="Gagan";
//    AA = "Sagar";
}
