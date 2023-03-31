package Entities;

public class User {
    String name;
    Role role;
    Department department;

    public User() {
        System.out.println("Am creat un user");
    }

    public String getName() {
        return name+"!";
    }

    public void setName(String name) {
        this.name = name;

    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                ", department=" + department +
                '}';
    }
}
