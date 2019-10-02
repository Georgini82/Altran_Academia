public final class Student {
    private final int id;
    private final String name;
    private final Age age;

    public Student(int id, String name, Age age) {
        this.id = id;
        this.name = name;
        // this.age = age;
        // de modo a não permitir a alteração da classe age
        // deve-se instanciar um clone do objeto inicial
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public int getId (){
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge(){
        return age;
    }
}

