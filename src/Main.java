public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            Student student = new Student("234200" + i,
                    switch (i) {
                        case 1 -> "Daniel";
                        case 2 -> "Pedro";
                        case 3 -> "Julia";
                        case 4 -> "Augusto";
                        case 5 -> "Alfredo";
                        default -> "undefined";
                    },
                    "Java Masterclass"
                    );
            System.out.println(student);
        }
    }
}
