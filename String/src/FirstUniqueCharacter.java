import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        // expected result - 0

        System.out.println(firstUniqChar(s));
    }

    // solution 1 with hashmap  - runtime 26ms
    public static int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

         for(char chr: s.toCharArray()){
             if(map.containsKey(chr)){
                 map.put(chr, map.get(chr)+1);
             }else{
                 map.put(chr,1);
             }
         }

         for(int i = 0; i < s.length(); ++i){
             if(map.get(s.charAt(i)) == 1){
                 return i;
             }
         }

         return -1;
    }

    //solution 2 with array - it is faster than solution 1
    // runtime - 1ms
    public static int firstUniqChar2(String s){
         int[] count = new int[26];
         int n = s.length();
         // build char count bucket : <charIndex, count>
         for (int i = 0; i < n; i++) {
             int index = s.charAt(i) - 'a';
             count[index]++;
         }

         // find the index
         for (int i = 0; i < n; i++) {
             int index = s.charAt(i) - 'a';
             if (count[index] == 1) {
                 return i;
             }

         }
         return -1;
    }
}


/*
    387. First Unique Character in a String
    Easy


    Given a string s, return the first non-repeating character in it and
    return its index. If it does not exist, return -1.


    Leetcode solution explanation

    The best possible solution here could be of a linear time because to ensure that the character is unique you have to check the whole string anyway.

    The idea is to go through the string and save in a hash map the number of times each character appears in the string.
    That would take O(N) time, where N is a number of characters in the string.

    And then we go through the string the second time, this time we use the hash map as a reference to check if a character is unique or not.
    If the character is unique, one could just return its index. The complexity of the second iteration is O(N) as well.

 */