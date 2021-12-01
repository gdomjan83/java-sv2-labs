package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {
    public void getMarried(Woman woman, Man man) {
        RegisterDate event = createRegisterDate("házasságkötés ideje");
        woman.addDate(event);
        man.addDate(event);
        woman.setName(getWomanMarriedName(woman, man));
    }

    private RegisterDate createRegisterDate(String event) {
        return new RegisterDate(event, LocalDate.now());
    }

    private String getWomanMarriedName(Woman woman, Man man) {
        String manFirstName = man.getName().substring(0, man.getName().indexOf(" "));
        return manFirstName + "-" + woman.getName();
    }
}
