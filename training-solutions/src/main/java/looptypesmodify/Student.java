package looptypesmodify;

public class Student {
    private String name;
    private boolean active = true;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public boolean getActive() {
        return active;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setActive(boolean active) {
        this.active = active;
    }


}