package introexceptionfirstexception;

import java.util.Arrays;
import java.util.List;

public class Message {
    public static void main(String[] args) {
        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233",
                "112", "32", "110", "97", "112", "111", "100", "33");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codedMessage.size(); i++) {
            char letter = (char) Integer.parseInt(codedMessage.get(i));
            sb.append(letter);
        }
        System.out.println(new String(sb)); //prints Legyen szép napod!

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225",
                "115", "32", "252", "122", "1O1", "110", "101", "116", "46"); //a 101-es karakterben 0 helyett O betű szerepel, Number Format Exception hibát okozva

        StringBuilder newSb = new StringBuilder();
        for (int i = 0; i < anotherCodedMessage.size(); i++) {
            char letter = (char) Integer.parseInt(anotherCodedMessage.get(i));
            newSb.append(letter);
        }
        System.out.println(new String(newSb));

    }
}
