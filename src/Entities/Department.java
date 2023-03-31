package Entities;

public class Department {
    String name;
    Faculty faculty;

    public Department(String name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
