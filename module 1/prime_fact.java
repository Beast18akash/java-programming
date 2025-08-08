public class prime_fact {

    public static void main(String[] args) {
        int n = 60; // Example number to factor
        for(int div = 2; div * div <=n;div ++ ){
            while(n %div == 0){
                n = n/div;
                System.err.println(div);
            }
        }
           if (n != 1){
            System.err.println(n);
           }
            }
        }
