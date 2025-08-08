class Gcd_Lcm {
    public static void main(String[] args) {
        int n1= 15;
        int n2= 12;

         int on1 = n1;
            int on2 = n2;
            while (n1%n2 != 0) {
                int r = n1%n2;
                n1 = n2;
                n2 = r;
            }
            int gcd = n2;
            int lcm = (on1 * on2) / gcd;

            System.out.println("GCD of " + on1 + " and " + on2 + " is: " + gcd);
            System.out.println("LCM of " + on1 + " and " + on2 + " is: " + lcm);
    }}