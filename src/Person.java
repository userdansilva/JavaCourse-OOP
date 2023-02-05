public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public void setAge(int age) {
        this.age = 0;

        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (age > 12) && (age < 20);
    }

    public String getFullName() {
        String fullName = firstName + " " + lastName;

        if (firstName.isEmpty()) {
            return lastName;
        }

        if (lastName.isEmpty()) {
            return firstName;
        }

        return fullName;
    }

}
