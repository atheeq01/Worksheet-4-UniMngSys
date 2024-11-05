public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department softwareEngineering = new Department("Software Engineering");

        Degree computerScience = new Degree("Computer Science", 120);

        Course oopCourse = new Course("Object-Oriented Programming", "Full-time", 69);

        Lecturer lecturer = new Lecturer("Mr S. Kesavan", "Senior Lecturer", softwareEngineering);

        Student student = new Student("Elon Musk", "S_12254", "Second Year", computerScience);

        softwareEngineering.offerCourse(oopCourse);
        softwareEngineering.addLecturer(lecturer);
        computerScience.offerCourse(oopCourse);

        lecturer.addCourse(oopCourse);
        student.enrollCourse(oopCourse);

        lecturer.displayInfo();
        student.displayInfo();
        softwareEngineering.displayInfo();
        computerScience.displayInfo();
        oopCourse.displayInfo();
    }
}
