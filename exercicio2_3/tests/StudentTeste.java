import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StudentTeste {

    @Test
    public void test(){
        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1992);
        Student student = new Student(1, "Pedro", age);
        Assert.assertEquals(1992, student.getAge().getYear());
        age.setYear(1993);
        Assert.assertEquals(1992, student.getAge().getYear());

    }

}
