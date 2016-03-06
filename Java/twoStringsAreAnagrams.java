import java.util.*;
public class twoStringsAreAnagrams{
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        ArrayList<Character> check = new ArrayList<Character>();
        if (s.length() != t.length()){
            return false;
        }
        else {
            for( int i = 0; i < s.length(); i ++){
                check.add(s.charAt(i));
                }
                for( int i = 0; i < s.length(); i ++){
                    if(check.indexOf(t.charAt(i)) != -1 ) {
                    check.remove(check.indexOf(t.charAt(i)));
                }
                }
                if(check.isEmpty() ) {
                    return true;
                }
                else {
                    return false;
                }
            }
        }

    public static void main(String[] args){
        twoStringsAreAnagrams s = new  twoStringsAreAnagrams();
        System.out.println(s.anagram("abdc","abcd"));
    }
};