package zappr.week06;

public class Student extends Person {
    private int matr;

    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    private int cod_course;

    public int getCod_course() {
        return cod_course;
    }
    public void setCod_course(int cod_course) {
        this.cod_course = cod_course;
    }
    public String university;

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public Student(String name, String surname, int age, int matr, int cod_course, String university) {
        super(name, surname, age);
        this.matr = matr;
        this.cod_course = cod_course;
        this.university = university;
    }

    public void doExam() {
        System.out.println("Exam done in the course " + this.getCod_course());
    }

    public void stampUniversity() {
        System.out.println("Student cod: " + this.getMatr() + ", Cod course: " + this.getCod_course() + ", Name university: " + this.getUniversity());
    }

}
