import java.util.ArrayDeque;
import java.util.Deque;

public class CrawlerLogFolder1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        String[] logs2 = {"d1/","d2/","../","d21/","./"};


        int result1 = minOperations(logs);
        int result2 = minOperations(logs2);

        System.out.println(result1 == 3 ? "Correct" : "Wrong");
        System.out.println(result2 == 2 ? "Correct" : "Wrong");

    }

    public static int minOperations(String[] logs) {
        // Solution1 without Stack

//         int counter = 0;

//         for(String log: logs){
//             if(log.equals("../")) {
//                 if(counter != 0) counter--;
//             }
//             else if(log.equals("./")) continue;
//             else counter++;
//         }

//         return  counter;

        //Solution2 with Stack or ArrayDeque

        // Stack<String> stack = new Stack<>();
        Deque<String> stack = new ArrayDeque<>();
        for(String log: logs){
            if(log.equals("../")) {
                if(!stack.isEmpty()) stack.removeFirst();
            }
            else if(log.equals("./")) continue;
            else stack.addFirst(log);
        }

        return stack.size();
    }
}
