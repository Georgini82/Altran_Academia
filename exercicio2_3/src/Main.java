public class Main {
    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);

        Student student = new Student(1, "Alex", age);

        System.out.println("Estudante antes de modificação: " + student.getAge().getYear());
        // age.setYear(1993);
        student.getAge().setYear(1993);
        System.out.println("Estudante depois de modificação: " + student.getAge().getYear());

    }
}
