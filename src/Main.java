public class Main {
    public static void main(String[] args) {
        Dog.barkStatic("Master");

        Dog docker = new Dog("Docker");
        docker.bark();

        Dog jenkins = new Dog("Jenkins");
        jenkins.bark();
    }
}
