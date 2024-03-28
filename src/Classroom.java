import java.util.List;

public class Classroom {
    private String gradeName;
    private List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
    Classroom(String gradeName,List<Student> studentList){
        this.gradeName=gradeName;
        this.studentList=studentList;
    }
}
