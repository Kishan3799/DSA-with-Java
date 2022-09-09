import java.util.Arrays;

// Longest SubString Without Repeating Characters
public class LSWRC {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println("Length of "+lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int[] charCount = new int[256];
        Arrays.fill(charCount, -1);

        int maxLenght = 0 ,  start = -1;
        for (int i= 0; i<s.length(); i++) {
            if (charCount[s.charAt(i)] > start) {
                start = charCount[s.charAt(i)];
            }
            charCount[s.charAt(i)] = i;
            maxLenght = Integer.max(maxLenght, i-start);
        }

        return maxLenght;
    }
}
