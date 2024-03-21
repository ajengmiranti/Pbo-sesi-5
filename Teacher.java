import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    private List<String> courses = new ArrayList<>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        return true;
    }

    public boolean removeCourse(String course) {
        if (!courses.contains(course)) {
            return false;
        }
        courses.remove(course);
        return true;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
