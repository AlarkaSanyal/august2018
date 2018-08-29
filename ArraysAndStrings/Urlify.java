// URLify all spaces with '%20'

public class Urlify {

    static String str = " Hello new world! ";

    public static void main(String[] args) {
        Urlify url = new Urlify();
        String output = url.convert(str);
        System.out.println("\"" + str + "\" is now: " + output);
    }

    public String convert(String s) {
        char[] c = s.toCharArray();

        // Count total number of spaces
        int counter = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                counter++;
            }
        }

        // Initialize new char array with [(length of 'c') + (2 X counter)]
        int newLength = c.length + 2*counter;
        char[] newString = new char[newLength];

        // Start from the end
        for (int i = c.length - 1, j = newString.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (c[i] == ' ') {
                newString[j] = '0';
                newString[j-1] = '2';
                newString[j-2] = '%';
                j--;
                j--;
            } else {
                newString[j] = c[i];
            }
        }

        return new String(newString);
    }
}
