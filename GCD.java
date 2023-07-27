public class GCD {
        public static int calculateGCD(int a, int b) {
            if (b == 0) {
                return a;
            } else {
                return calculateGCD(b, a % b);
            }
        }

        public static void main(String[] args) {
            int num1 = 24;
            int num2 = 36;
            int gcd = calculateGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        }
}
