public class PowerN {
    public static void main(String[] args) {
        int result1 = powerN(3,3);
        int result2 = powerN(10,3);


        System.out.println(result1 == 27 ? "Correct": "Wrong");
        System.out.println(result2 == 1000 ? "Correct": "Wrong");
    }

    public static int powerN(int base, int n) {
        if(n == 1) return base;

        return base * powerN(base,n-1);
    }


}
