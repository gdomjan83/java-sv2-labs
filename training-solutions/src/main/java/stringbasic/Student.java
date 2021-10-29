package stringbasic;

public class Student {
    private Person person;
    private String neptuneCode;
    private String omID;
    private String accessCard;

    public Student(Person person, String neptuneCode, String omID) {
        this.person = person;
        this.neptuneCode = neptuneCode;
        this.omID = omID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptuneCode() {
        return neptuneCode;
    }

    public void setNeptuneCode(String neptuneCode) {
        this.neptuneCode = neptuneCode;
    }

    public String getOmID() {
        return omID;
    }

    public void setOmID(String omID) {
        this.omID = omID;
    }

    public String getAccessCard() {
        return accessCard;
    }

    public void setAccessCard(String accessCard) {
        this.accessCard = accessCard;
    }
}
