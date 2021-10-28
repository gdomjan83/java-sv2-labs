package enumtype.university;

public enum University {
    BME("Budapest Műszaki Egyetem"), PE("Pannon Egyetem"), SZTE("Szegedi Tudományegyetem"),
    MATE("Magyar Agrár- és Élettudományi Egyetem"), DE("Debreceni Egyetem");

    public final String name;

    University(String name) {
        this.name = name;
    }
}
