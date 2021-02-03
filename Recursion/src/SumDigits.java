public class SumDigits {
    public static void main(String[] args) {
        int result1 = sumDigits(730);
        int result2= sumDigits(49);

        System.out.println(result1 == 10 ? "Correct": "Wrong");
        System.out.println(result2 == 13 ? "Correct": "Wrong");
    }

    public static int sumDigits(int n) {
        // base case
        if(n == 0) return 0;

        int val = n % 10;
        n= n / 10;

        //recursive call
        return val + sumDigits(n);
    }
}
