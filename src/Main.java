public class Main {
    public static void main(String[] args) {
        SalariedEmployee daniel = new SalariedEmployee("Daniel", "13/10/1997",
                "01/01/2019", 65_000);
        System.out.println(daniel);
        System.out.println(daniel.collectPay());

        daniel.retire();

        System.out.println(daniel.collectPay());
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old";
    }
}

class PrimarySchoolStudent extends Student {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return super.toString() + ", and his parent is " + parentName;
    }
}
