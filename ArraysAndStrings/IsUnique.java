// String has all unique characters
// Assume ASCII characters only, i.e. 128 characters
public class IsUnique{

  static String s1 = "Helo WorLd";

  public static void main(String[] args) {

    IsUnique isu = new IsUnique();
    boolean unique = isu.isUnique(s1);
    System.out.println("Is Unique: " + unique);
  }

  public boolean isUnique(String s) {
      // Convert to character array
      char[] c = s.toCharArray();

      // Initialize an array of length 128 assuming ASCII characters only
      int[] arr = new int[128];

      for (int i = 0; i < c.length; i++) {
          // If value is 1, then character already present
          if (arr[(int)c[i]] == 1) {
              return false;
          }
          // Increment the ASCII code for the character position
          arr[(int)c[i]] = 1;
      }
      return true;
  }
}
