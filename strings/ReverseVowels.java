package strings;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "welcometodevtodsa";
        reverseVowels(str);
        reverseVowelsOptimised(str);
    }

    public static void reverseVowels(String str) {
        char[] s = str.toCharArray();

        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            while (s[i] != 'a' && s[i] != 'e' && s[i] != 'o' && s[i] != 'i' && s[i] != 'u') {
                i++;
            }
            while (s[j] != 'a' && s[j] != 'e' && s[j] != 'o' && s[j] != 'i' && s[j] != 'u') {
                j--;
            }
            if (i >= j) {
                break;
            }
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;

            i++;
            j--;
        }
        for (char ch : s) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void reverseVowelsOptimised(String str) {
        char[] strArr = str.toCharArray();
        int left = 0;
        int right = strArr.length - 1;

        while (left < right) {
            while (left < right && !isVowel(strArr[left])) {
                left++;
            }
            while (left < right && !isVowel(strArr[right])) {
                right--;
            }
            if (left < right) {
                char temp = strArr[left];
                strArr[left++] = strArr[right];
                strArr[right--] = temp;
            }
        }
        for (char ch : strArr) {
            System.out.print(ch);
        }
    }

    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}