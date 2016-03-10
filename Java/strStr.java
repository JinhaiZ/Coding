class strStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //kmp implementation
        if (source == null || target == null || (source.length() - target.length() <0))  {
            return -1;
        }
        int i = 0;
        int j = 0;
        while (i < source.length()  && j < target.length() ) {
            if (source.charAt(i) == target.charAt(j) ) {
                i ++;
                j ++;
            }
            else {
                i = i - j +1;
                j = 0;
                //System.out.println("i= "+i);
            }
        }
        if (j == target.length()) 
            return i - j; 
        else
            return -1;
    }
    public static void main(String[] args){
        strStr s = new  strStr();
        System.out.println(s.strStr("lintcode","lintcode"));
    }
}