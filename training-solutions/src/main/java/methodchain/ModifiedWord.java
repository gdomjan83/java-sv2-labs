package methodchain;

public class ModifiedWord {
    public String modifyWord(String word) {
        return word.substring(0, 1).toUpperCase() + "x" + word.substring(2, 3).toUpperCase() + "y";
    }
}
