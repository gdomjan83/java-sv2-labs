package interfacedependencyinversion.amount;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        String lastDigit = getLastDigit(amount);
        switch (lastDigit) {
            case "1", "2":
                return amount - Integer.parseInt(lastDigit);
            case "8", "9":
                return amount + (10 - Integer.parseInt(lastDigit));
            case "3", "4":
                return amount + (5 - Integer.parseInt(lastDigit));
            case "6", "7":
                return amount - (Integer.parseInt(lastDigit) - 5);
            default:
                return amount;
        }
    }

    private String getLastDigit(int amount) {
        String amountString = String.valueOf(amount);
        return amountString.substring(amountString.length() - 1);
    }
}
