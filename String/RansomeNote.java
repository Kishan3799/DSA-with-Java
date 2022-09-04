/**
 * RansomeNote
 */
public class RansomeNote {

    public static boolean canCnstruct(String ransomeNote, String magazine){
        if(ransomeNote.length() > magazine.length()){
            return false;
        }
        int[] charCount = new int[26];
        for (char c : magazine.toCharArray()) {
            ++charCount[c-'a'];
        }
        for (char c : ransomeNote.toCharArray()) {
            if(--charCount[c-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static boolean canCnstruct2(String ransomNote, String magazine){
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, charCount[c - 'a']);
            if (index < 0) return false;
            else charCount[c - 'a'] = index + 1;
        }   
        return true;
    }


    public static void main(String[] args) {
        String s1 = "aa"; 
        String s2 = "aab";
        System.out.println(canCnstruct2(s1, s2));
    }
}