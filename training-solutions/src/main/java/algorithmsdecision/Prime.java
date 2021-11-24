package algorithmsdecision;

public class Prime {
    public boolean isPrime(int num) {
        int dividers = 0;
        int abs = Math.abs(num);

        for (int i = 1; i <= abs; i++) {
            if (abs % i == 0) {
                dividers++;
            }
        }
        if (dividers == 2) {
            return true;
        }
        return false;
    }
}
