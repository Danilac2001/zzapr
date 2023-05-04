package zappr.week06;

public class week06 {
    public static void main(String[] args) {
        //Person pippo = new Person("Pippo", "Disney", 52);
        //pippo.stampIdentity();

        Student daniele = new Student("Daniele", "La Corte", 22, 12356, 1, "Palermo");
        daniele.doExam();
        daniele.stampUniversity();
        daniele.stampIdentity();


        Car professorCar = new Car("Ferrari", "F50", 1200, 1000000000);
        Professor micheal = new Professor("Andrea", "Peruviano", 24, "Italian", professorCar);
        micheal.doLesson();
        micheal.stampIdentity();
    }
}
