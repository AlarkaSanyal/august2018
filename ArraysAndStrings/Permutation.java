// Two strings permutation of each other
// Assume strings made up of ASCII characters only

// Solution using a char array
public class Permutation{

    static String str1 = "apple";
    static String str2 = "paple";

    public static void main(String[] args) {
        Permutation pp = new Permutation();
        boolean permu = pp.isPermu(str1, str2);
        System.out.println("Is Permutation: " + permu);
    }

    public boolean isPermu (String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int[] arr = new int[128];

        for(int i = 0; i < c1.length; i++) {
            arr[(int)c1[i]]++;
        }
        for(int i = 0; i < c2.length; i++) {
            if(arr[(int)c2[i]] == 0) {
                return false;
            }
            arr[(int)c2[i]]--;
        }
        return true;
    }
}
