public class Triangle {
    public static void main(String[] args) {
        int result1 = triangle(5);
        int result2 = triangle(7);

        System.out.println(result1 == 15 ? "Correct" : "Wrong");
        System.out.println(result2 == 28 ? "Correct" : "Wrong");
    }

    public static int triangle(int rows) {
        //Base case
        if(rows == 0) return 0;

        //Recursive case
        return rows + triangle(rows-1);

    }
}
