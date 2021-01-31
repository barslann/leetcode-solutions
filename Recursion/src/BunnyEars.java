public class BunnyEars {
    public static void main(String[] args) {
        int res = bunnyEars(10);

        System.out.println(res == 20 ? "Correct" : "Wrong");
    }

    public static int bunnyEars(int bunnies) {

        // base
        if(bunnies == 0) return 0;

        //recursive call
        return 2 + bunnyEars(bunnies-1);

    }
}


/*
  Multiplication Solution
    return bunnies * 2

  Looop Solutionnnnn
    int result = 0;
    for(int i = 0; i< bunnies ; i++){
      result = result + 2;
    }

    return result;

    Recursion Solution

      - Base call
          bunnies == 0 -> 0
      - Recursive call
*/