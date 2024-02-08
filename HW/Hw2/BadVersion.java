public class BadVersion {
    public static boolean isBadVersion(int version) {
        return version >= 4;
    }

    public static String badVersionCheck(int n) {
        for (int i = 1; i <= n; i++) {
            if (isBadVersion(i)) {
                return String.valueOf(i);
            }
        }
        return "N/A";
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Version '" + badVersionCheck(n) + "' is the first bad version");
    }
}
