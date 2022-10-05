public class StringCompare {
    public static void main(String[] args) {}
    public static boolean compareStr(String Str1, String Str2) {

        if (Str1.length() > Str2.length()) {
            return true;
        }

        else if (Str2.length() == Str2.length()) {
            System.out.println("Equal strings length");
        }
        return false;
    }
}