import java.util.HashMap;

public class Find_first_unique_ch {
    public static void main(String[] args) {
        String s1 = "loveleetcode";
        System.out.println("Unique charackter is " + firstUniqueChar2(s1));
        System.out.println("Unique charackter is " + firstUniqueChar(s1));
    }

    private static int firstUniqueChar(String s1) {
        int n = s1.length();
        int[] charCount = new int[26];
        for(int i = 0; i<n; i++){
            charCount[s1.charAt(i) - 'a']++;
        }
        for(int i = 0; i<n; i++){
            if(charCount[s1.charAt(i)- 'a'] == 1){
                return i;
            }
        }

        return -1;
    } 

    private static int firstUniqueChar2(String s1) {
        int n = s1.length();
        HashMap<Character , Integer> count = new HashMap<>();
          // build hash map : character and how often it appears
        for(int i = 0; i<n; i++){
            count.put(s1.charAt(i), count.getOrDefault(s1.charAt(i), 0)+1);
        }
        //find index
        for(int i = 0; i<n; i++){
            if(count.get(s1.charAt(i))==1){
                return i;
            }
        
        }

        return -1;
    }


}
