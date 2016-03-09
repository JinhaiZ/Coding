class strStr {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String source, String target) {
        //write your code here
        if (source == null || target == null || (source.length() - target.length() <0))  {
            return -1;
        }
        for (int m = 0; m <= source.length() - target.length(); m++ ) {
            if ((source != null) && (target.length() == 0)) {
                return m;
            }

            for (int i = 0; i < target.length(); i++) {
                if ( (source.charAt(m + i) == target.charAt(i)) && (i == target.length() - 1)) {
                    return m;
                }
                if ( (source.charAt(m + i) == target.charAt(i)) && (i <= target.length() - 1)) {
                    
                    continue;
                }
                else{
                    //System.out.println(m);
                    break;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args){
        strStr s = new  strStr();
        System.out.println(s.strStr(null,""));
    }
}