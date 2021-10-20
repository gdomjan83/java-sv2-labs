package stringtype.registration;

public class UserValidator {
    public boolean isValidUsername(String userName) {
        int len = userName.length();
        return len > 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        int len = password1.length();
        boolean passEquals = password1.equals(password2);
        return ((len >= 8) && passEquals);
    }

    public boolean isValidEmail(String email) {
        int indexOfAt = email.indexOf("@");
        int indexOfPeriod = email.indexOf(".");
        int len = email.length();
        return ((indexOfAt > 0) && (indexOfPeriod > indexOfAt + 1) && (indexOfPeriod < len - 1));
    }
}
