import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(createManager().getSalary());
        printSchool();
    }

    private static void printSchool() {
        School school = new School("Example School", "123 Main St", createManager(), createTeacherList(), createStudentList(), createClassroomList(), createLessonList());
        System.out.println("okul adı: " + school.getName());
        System.out.println("adress: " + school.getAdress());
        System.out.println("Manager: " + school.getManager().firstName + " " + school.getManager().lastName + " tckNo:" + school.getManager().tck_No + " salary:" + school.getManager().getSalary());
        for (int i = 0; i < createTeacherList().size(); i++) {
            System.out.println("Teachers:\n " + "firstName: " + school.getTeacherList().get(i).firstName + "lastName: " + school.getTeacherList().get(i).lastName + "tckNo: " + school.getTeacherList().get(i).tck_No + "Salary: " + school.getTeacherList().get(i).getSalary());
        }
        for (int i = 0; i < createClassroomList().size(); i++) {
            System.out.println("Classrom: \n" + "Grade Name: " + school.getClassroomList().get(i).getGradeName());
        }
        for (int i = 0; i < createStudentList().size(); i++) {
            System.out.println("Students: \n" + "firstName: " + school.getStudentList().get(i).firstName + "lastName: " + school.getStudentList().get(i).lastName + "tckNo: " + school.getStudentList().get(i).tck_No + "not: " + school.getStudentList().get(i).not);
        }
        for (int i = 0; i < createLessonList().size(); i++) {
            System.out.println("Lessons: \n" + "Name: " + school.getLessonList().get(i).getName() + "Credit: " + school.getLessonList().get(i).getCredit());
        }
    }

    private static List<School> createSchoolList() {
        List<School> schoolList = new ArrayList<>();
        return schoolList;
    }

    private static Manager createManager() {
        Manager manager = new Manager("Yönetici", "Müdür", "123", "40000");

        return manager;
    }

    private static Teacher createTeacher(String firstName, String lastName, String tck_No, String salary) {
        Teacher teacher = new Teacher();
        teacher.firstName = firstName;
        teacher.lastName = lastName;
        teacher.tck_No = tck_No;
        teacher.setSalary(salary);
        return teacher;
    }

    private static List<Teacher> createTeacherList() {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(createTeacher("Ahmet", "Atay", "123456", "25000"));
        teacherList.add(createTeacher("Ayşe", "Yılmaz", "789012", "28000"));
        teacherList.add(createTeacher("Mehmet", "Kaya", "345678", "26000"));
        teacherList.add(createTeacher("Fatma", "Demir", "901234", "27000"));
        teacherList.add(createTeacher("Mustafa", "Çelik", "567890", "29000"));
        teacherList.add(createTeacher("Zeynep", "Arslan", "012345", "30000"));

        return teacherList;
    }

    private static Student createStudent(String firstName, String lastName, String tck_No, int not) {
        Student student = new Student();
        student.firstName = firstName;
        student.tck_No = tck_No;
        student.lastName = lastName;
        student.not = not;
        return student;
    }

    private static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(createStudent("Ali", "Yılmaz", "12345", 60));
        studentList.add(createStudent("Ayşe", "Kaya", "67890", 70));
        studentList.add(createStudent("Fatma", "Demir", "54321", 90));
        studentList.add(createStudent("Mehmet", "Çelik", "09876", 85));
        studentList.add(createStudent("Zeynep", "Arslan", "13579", 45));

        return studentList;

    }

    private static List<Lesson> createLessonList() {
        List<Lesson> lessonList = new ArrayList<>();
        lessonList.add(new Lesson("Math", 6));
        lessonList.add(new Lesson("Physical", 4));
        lessonList.add(new Lesson("Biologie", 3));
        lessonList.add(new Lesson("Chemical", 4));
        lessonList.add(new Lesson("Geometri", 5));
        return lessonList;

    }

    private static List<Classroom> createClassroomList() {
        List<Classroom> classroomList = new ArrayList<>();
        classroomList.add(new Classroom("A101", createStudentList()));
        classroomList.add(new Classroom("B205", createStudentList()));
        classroomList.add(new Classroom("C301", createStudentList()));
        return classroomList;
    }
}
// lessond da name nin constructor ını ve get set ini oluşturduğumuz için printSchool() metodunda school nesnesiyle yazdırırken school.getLessonList().get(i).getName() bu şekilde ulaşırız.