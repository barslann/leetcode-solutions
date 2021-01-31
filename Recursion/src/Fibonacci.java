public class Fibonacci {
    public static void main(String[] args) {
        int rec = 0;
        int lop= 0;
        for (int i = 0; i < 10; i++) {
             rec = fibonacciRecursion(i);
             lop = fibonacciLoop(i);
            System.out.println("recursion result " + rec + "---------" + String.format("loop result: %d", lop));
        }




    }
    //0 1 1 2 3 5
    public static int fibonacciRecursion(int n) {
        //base call
        if(n == 0) return 0;
        if(n == 1) return 1;

        //recursive call
        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);

    }

    //0 1 1 2 3 5 8
    public static int fibonacciLoop(int n) {
        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        return t1;
    }

}



/*

  0 1 1 2 3

  sayi 0  -> 0
  sayi 1  -> 1

  Loop Solution
    if(n == 0) return 0;
    if(n == 1) return 1;
    int sum = 1;
    for(int i = 2 ; i <= n; i++){
      sum = sum + n-2;
    }
    return sum;

    //1.adim sum = 0
    //2.adim sum = 1
    //3.adim sum = 3
    //4.adim sum = 6

*/