import Entities.Department;
import Entities.Faculty;
import Entities.Role;
import Entities.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Toni");
        user.setRole(Role.Lector);
        Faculty faculty = new Faculty("Inginerie", "Cioran, 4");
        Department department = new Department("Calculatoare si Inginerie Electrica",faculty);
        user.setDepartment(department);
        System.out.println(user);
    }
}