import java.util.*;
public class compareStrings{
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        if (A.matches("[A-Z]*") && B.matches("[A-Z]*") && (A.length() >= B.length())) {
            //The characters in string A and B are all Upper Case letters
            ArrayList<Character> check = new ArrayList<Character>();
            for (int i = 0; i < A.length(); i++) {
                check.add(A.charAt(i));
            }
            for (int i = 0; i < B.length(); i++) {
                if (check.indexOf(B.charAt(i)) != -1) {
                    check.remove(check.indexOf(B.charAt(i)));
                }
                else {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        compareStrings s = new  compareStrings();
        System.out.println(s.compareStrings("", ""));
    }
};