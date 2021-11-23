package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map) {
        int currentLongest = 0;
        int counter = 0;
        for (int i = 0; i < map.length(); i++) {
            if ('0' == map.charAt(i)) {
                counter++;
            }
            if ('1' == map.charAt(i) || i == (map.length() - 1)) {
                if (counter > currentLongest) {
                    currentLongest = counter;
                }
                counter = 0;
            }
        }
        return currentLongest;
    }
}
