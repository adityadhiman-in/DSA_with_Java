package strings;

public class RemoveVowels {
    public static void removeVowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            char character = str.toLowerCase().charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                continue;
            } else {
                System.out.println(character);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Kwab";
        removeVowels(str);
    }
}