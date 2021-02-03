public class BunnyEars2 {
    public static void main(String[] args) {
        int result1 = bunnyEars2(1);
        int result2= bunnyEars2(2);

        System.out.println(result1 == 2 ? "Correct": "Wrong");
        System.out.println(result2 == 5 ? "Correct": "Wrong");

    }

    public static int bunnyEars2(int bunnies) {
        //base case
        if(bunnies == 0) return 0;

        //recursive call
        if(bunnies % 2 == 0) return 3 + bunnyEars2(bunnies-1);
        else return 2 + bunnyEars2(bunnies-1);
    }
}


/*

  int sum = 0;
  for(int i = 1; i <=bunnies ; i++){
    if(i % 2 == 1) sum += 2;
    else sum+=3;
  }

  return sum;


  Recursion solution
   -Base case
      - en basit durum - hic bir tavsan yoksa ?


   -Recursive call
      - return n * factorial(n-1);
      -return n + bunnyEars(n-1);



*/

