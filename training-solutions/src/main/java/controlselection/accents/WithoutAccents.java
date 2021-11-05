package controlselection.accents;

public class WithoutAccents {

    public char getShortVowel(char letter) {
        char result = Character.toLowerCase(letter);
        switch (result) {
            case 'á':
                return 'a';
            case 'é':
                return 'e';
            case 'í':
                return 'i';
            case 'ó':
                return 'o';
            case 'ő':
                return 'ö';
            case 'ú':
                return 'u';
            case 'ű':
                return 'ü';
            default:
                return result;
        }
    }
}
