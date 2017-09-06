// Is Unique
// Implement and algorithm to determine if a string has all unique
// characters. What if you cannot use additional data structures?

// Notes:
// -ASCII is 128 characters. Char is 256?

public class ch_1_1 {
    static private boolean isUniqueDS(String s) {
        if(s.length() > 128) return false;
        
        int[] alphaArr = new int[128];

         // fill in the alpha array
        for(int i = 0; i < s.length(); i++) {
            if(alphaArr[s.charAt(i)] == 1) {
                return false;
            } else {
                alphaArr[s.charAt(i)]++;
            }
        }

        return true;
    }

    static private boolean isUnique(String s) {
        return true;
    }

    public static void main(String args[]) {
        String a = "Aa";                     // true
        String b = "abcdefga";               // false
        String c = "aabcdefg";               // false
        String d = "..";                     // false
        String e = "";                       // true
        String f = "a";                      // true
        String g = "!@#$%^&*()1234567890";   // true

        System.out.println(isUniqueDS(a));
        System.out.println(isUniqueDS(b));
        System.out.println(isUniqueDS(c));
        System.out.println(isUniqueDS(d));
        System.out.println(isUniqueDS(e));
        System.out.println(isUniqueDS(f));
        System.out.println(isUniqueDS(g));
    }
}