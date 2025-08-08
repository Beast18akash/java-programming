public class pythagorian_triplet {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
       int num3 = 4;
    
       int max = num1;
       if (num2 >= max){
         max = num2;
         if (num3 >= max){
            max = num3;

         }
        if (max == num1){
           boolean flag = ((num1*num1) == (num2*num2) +(num3*num3));
           System.out.println(flag); 
        }
        if (max == num2){
            boolean flag =((num2*num2) == (num1*num1)+ (num3*num3));
            System.out.println(flag);
        }
        if (max==num3){
            boolean flag =((num3*num3) == (num1*num1) + (num2*num2));
            System.out.println(flag);
        }
        }
    }}
