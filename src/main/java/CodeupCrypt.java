public class CodeupCrypt {
    public static double version;
    public static String hashPassword(String password) {
        String hash = "";
        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            switch (letter) {
                case 'a', 'A' -> hash += 4;
                case 'e', 'E' -> hash += 3;
                case 'i', 'I' -> hash += 1;
                case 'o', 'O' -> hash += 0;
                case 'u', 'U' -> hash += 9;
                default -> hash += letter;
            }
        }
        return hash;
    }
    public static boolean checkPassword(String password, String hash) {
        return hashPassword(password).equals(hash);
    }
}
