public class Lesson {
    private String name;
    private  int credit;
    public int getCredit() {
        return credit;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    Lesson(String name,int credit){
        this.name=name;
        this.credit=credit;
    }
}
