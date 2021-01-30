public class Factorial {
    public static void main(String[] args) {
        System.out.println("Recursion solution " +computeFactorialWithRecursion(5));
        System.out.println("Loop solution " + computeFactorialWithoutRecursion(5));

    }

    // Factorial
    // 5! = 5 * 4!
    // 4! = 4 * 3!

    // 1! = 1
    private static int computeFactorialWithoutRecursion(int x) {
        int result = 1;
        for(int i = 5 ; i > 0; i--){
            result = result * i;
        }
        return result;
    }

    private static int computeFactorialWithRecursion(int x) {
        //base
        if(x == 1) return 1;

        //recursive
        return x * computeFactorialWithRecursion(x-1);
        //3 * 2;
        //4 * 6
        //5 * 24

    }
}


