package week5.Interview26;

public class CountNoOf0Between1 {
    public static void main(String[] args) {
        String input = "10000000000010010001000001";
        System.out.println(CountNumberofZero(input));
    }
    public static int CountNumberofZero(String input){
        int count =0;
        int max =0;
        boolean isONE = false;
        for(char c : input.toCharArray()){
            if(c == '0' && isONE == true){
                count++;
            } else if (c =='1') {
                isONE = true;
                max = Math.max(count , max);
                count =0;
            }
        }
        return max;
    }
}
