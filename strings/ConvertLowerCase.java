package strings;

public class ConvertLowerCase {
    public static void main(String[] args) {
        String str = "HEllo World";
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            System.out.print(ch);
        }
    }
}
