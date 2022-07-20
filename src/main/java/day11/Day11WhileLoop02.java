package day11;

public class Day11WhileLoop02 {
    //Type code to check if a given integer is palindrome or not
    //Palindrome: 121 <==> 121,  123321 <==> 123321,  nalan <==> nalan
    public static void main(String[] args) {
        int i = 123321;
        String strI = String.valueOf(i);
        String reverse = "";

        int idx = strI.length()-1;
        while(idx>-1){
            reverse = reverse + strI.charAt(idx);
            idx--;
        }
        if(strI.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("NOT Palindrome");
        }
    }
}
