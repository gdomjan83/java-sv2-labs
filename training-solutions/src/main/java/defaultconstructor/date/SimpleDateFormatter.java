package defaultconstructor.date;

public class SimpleDateFormatter {
    private CountryCode defaultCode;

    public SimpleDateFormatter() {
        defaultCode = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCode, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        String year = String.valueOf(simpleDate.getYear());
        String month = String.valueOf(simpleDate.getMonth());
        String day = String.valueOf(simpleDate.getDay());

        switch (countryCode) {
            case HU:
                return year + "-" + month + "-" + day;
            case EN:
                return day + "-" + month + "-" + year;
            case US:
                return month + "-" + day + "-" + year;
            default:


        }
        return year + "-" + month + "-" + day;
    }
}
