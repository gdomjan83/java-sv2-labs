package controlselection.month;

public class DayInMonth {

    public int daysInMonth(int year, String month) {
        boolean leapDay = false;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            leapDay = true;
        }
        switch (month.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                return 31;
            case "február":
                return leapDay ? 29 : 28;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;
            default:
                return 0;
        }
    }
}
