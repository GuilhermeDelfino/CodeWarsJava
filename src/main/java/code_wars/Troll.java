package code_wars;

public class Troll {
    public static final String REGEX_VOWELS = "[aeiouAEIOU]+";
    public static String disemvowel(String str) {
        return str.replaceAll(REGEX_VOWELS, "");
    }
}
