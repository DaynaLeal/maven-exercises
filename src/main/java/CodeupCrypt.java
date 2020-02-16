public class CodeupCrypt {
    public static String hash = "";

    // Takes in a String and hashes the password, returns the finished hash.
    public static String hashPassword(String password) {
        hash = "";
        for (char character : password.toCharArray()) { //note the string was converted to a charArray and then iterated through with an enhanced for loop
            switch (character){
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e': //note no breaks so that the case falls through
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }
        }
        return hash;
    }

    // Returns true/false if the password is equals to the hash
    public static boolean checkPassword(String password, String hash) {
        return hash.equals(hashPassword(password));
    }
}
