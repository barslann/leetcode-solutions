public class Count7 {
    public static void main(String[] args) {
        int result1 = count7(771237);
        int result2= count7(777777);

        System.out.println(result1 == 3 ? "Correct": "Wrong");
        System.out.println(result2 == 6 ? "Correct": "Wrong");
    }

    public static int count7(int n) {
        if(n == 0) return 0;

        int val = n % 10;
        int count = val == 7 ? 1 : 0;
        n = n / 10;

        return count + count7(n);
    }
}
