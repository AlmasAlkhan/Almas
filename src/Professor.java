
import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private String department;
    private List<String> courses;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Professor{name='" + name + "', department='" + department + "', courses=" + courses + "}";
    }
}
