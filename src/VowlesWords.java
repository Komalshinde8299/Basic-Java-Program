public class VowlesWords {
    public static void main(String[] args) {
        char ch = 'o';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
                break;
        }
    }}


