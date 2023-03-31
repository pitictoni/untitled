package Entities;

public class Faculty {
    String name;
    String address;

    public Faculty(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
