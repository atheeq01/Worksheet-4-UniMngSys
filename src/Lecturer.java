import java.util.ArrayList;

class Lecturer extends Person{
    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;

    public Lecturer(String name,String position,Department department){
        super(name);
        this.position=position;
        this.department=department;
        this.coursesTeaching= new ArrayList<Course>();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
    }
    public void displayDepartmentInfo(){
        if(department !=null){
            department.displayInfo();

        }
    }
    public void addCourse(Course course) {
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching() {
        for (Course course : coursesTeaching) {
            course.displayInfo();
        }
    }
}