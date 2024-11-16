package strings;

public class ConvertLowerCase {
    public static void toLowerCaseConverter(String str) {
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            System.out.print(ch);
        }
    }

    public static void main(String[] args) {
        String str = "HEllo World";
        toLowerCaseConverter(str);
    }
}
