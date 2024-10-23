/**
 * Problem Statement: Check whether two strings are anagram or not
 * return true if they are otherwise false.
 * 
 * ANAGRAM: When one string can be made by using characters of other string
 * eg. CARE and RACE
 */

public class CheckAnagram {
    public static boolean checkAnagram(String str1, String str2) {

        int[] count = new int[256];
        for (int i=0; i<str1.length() -1; i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        if (str1.length() != str2.length())
        return false;

        for(int j=0; j<256; j++) {
            if(count[j] != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkAnagramNaiveApproach(String str1, String str2) {

        int[] count1 = new int[256];
        int[] count2 = new int[256];
        for (int i=0; i<str1.length() && i < str2.length(); i++) {
            count1[str1.charAt(i)]++;
            count2[str2.charAt(i)]--;
        }

        if (str1.length() != str2.length())
        return false;

        for(int j=0; j<256; j++) {
            if(count1[j] != count2[j]) {
                return false;
            }
        }

        return true;
    }
}
