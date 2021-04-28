public class LongestSubstringWithoutRepeatingCharacters {

    //solution 1
    //Check all the substring one by one to see if it has no duplicate character.

    /*
    * Algorithm
    *Suppose we have a function boolean allUnique(String substring) which will return true if the characters in the substring are all unique, otherwise false.
    * We can iterate through all the possible substrings of the given string s and call the function allUnique.
    * If it turns out to be true, then we update our answer of the maximum length of substring without duplicate characters.
    *Time complexity : O(n3)
    * Space complexity: O(min(m,n))
     */
//    public int lengthOfLongestSubstring(String s) {
//        int n = s.length();
//
//        int res = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (checkRepetition(s, i, j)) {
//                    res = Math.max(res, j - i + 1);
//                }
//            }
//        }
//
//        return res;
//    }
//
//    private boolean checkRepetition(String s, int start, int end) {
//        int[] chars = new int[128];
//
//        for (int i = start; i <= end; i++) {
//            char c = s.charAt(i);
//            chars[c]++;
//            if (chars[c] > 1) {
//                return false;
//            }
//        }
//
//        return true;
//    }


    // Solution2 Approach 2: Sliding Window
    /*
    * The naive approach is very straightforward. But it is too slow. So how can we optimize it?
    * In the naive approaches, we repeatedly check a substring to see if it has duplicate character. But it is unnecessary. If a substring sij
    *from index i to j−1 is already checked to have no duplicate characters. We only need to check if
    *s[j] is already in the substring sij.
    *
    * To check if a character is already in the substring, we can scan the substring
    * which leads to an O(n2) algorithm. But we can do better.
    *
    * By using HashSet as a sliding window, checking if a character in the current can be done in O(1)
    *
    *
    *
    * A sliding window is an abstract concept commonly used in array/string problems.
    * A window is a range of elements in the array/string which usually defined by the start and end indices, i.e.  [ i , j ) [i,j) (left-closed, right-open).
    * A sliding window is a window "slides" its two boundaries to the certain direction. For example, if we slide  [ i , j ) [i,j) to the right by  1 1 element,
    * then it becomes  [ i + 1 , j + 1 ) [i+1,j+1) (left-closed, right-open).
    *
    * Back to our problem. We use HashSet to store the characters in current window  [ i , j ) [i,j) ( j = i j=i initially).
    * Then we slide the index  j j to the right. If it is not in the HashSet, we slide  j j further.
    * Doing so until s[j] is already in the HashSet.
    * At this point, we found the maximum size of substrings without duplicate characters start with index  i i.
    * If we do this for all  i i, we get our answer.
    * */

}
