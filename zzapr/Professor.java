package zappr.week06;

public class Professor extends Person {
    private String subject;
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    private Car car;
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public Professor (String name, String surname, int age, String subject, Car car) {
        super(name, surname, age);
        this.subject = subject;
        this.car = car;
    }

    public void doLesson() {
        System.out.println("Lesson: " + this.getSubject());
    }
    
}
