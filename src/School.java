import java.util.List;

public class School {
    private String name;
    private String adress;
    private List<Student> studentList;
    private List<Teacher>teacherList;
    private List<Classroom>classroomList;
    private List<Lesson>lessonList;
    private Manager manager;
    // teacherList getter

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    // teacherList setter
    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    // classroomList getter
    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    // classroomList setter
    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    // lessonList getter
    public List<Lesson> getLessonList() {
        return lessonList;
    }

    // lessonList setter
    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
}
    public Manager getManager() {
        return manager;
    }

    // manager setter
    public void setManager(Manager manager) {
        this.manager =manager;
}
public School(String name,String adress,Manager manager,List<Teacher>teacherList,List<Student> studentList,List<Classroom>classroomList, List<Lesson>lessonList){
        this.name=name;
        this.adress=adress;
        this.classroomList=classroomList;
        this.manager=manager;
        this.studentList=studentList;
        this.lessonList=lessonList;
        this.teacherList=teacherList;
}
}
