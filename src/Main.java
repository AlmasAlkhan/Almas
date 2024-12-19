
public class Main {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Astana IT");

        // Create courses
        Course course1 = new Course("Object-Oriented Programming", "OOP!)!", 4);
        Course course2 = new Course("Mathematics", "MATH101", 5);

        // Create professors
        Professor professor1 = new Professor("Orazova Arailym", "Object-Oriented Programming");
        professor1.addCourse(course1.getTitle());
        Professor professor2 = new Professor("Temirkhan Madi", "Mathematics");
        professor2.addCourse(course2.getTitle());

        // Display data
        System.out.println(university);
        System.out.println(professor1);
        System.out.println(professor2);
        System.out.println(course1);
        System.out.println(course2);
    }
}
