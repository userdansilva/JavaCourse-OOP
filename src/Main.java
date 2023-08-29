import java.util.List;

public class Main {
    public static void main(String[] args) {
        for( int i = 1; i<= 5; i++) {
            String name;

            switch (i) {
               case 1 -> name = "Daniel";
               case 2 -> name = "Pedro";
               case 3 -> name = "Augusto";
               case 4 -> name = "Ana";
               case 5 -> name = "Julia";
               default -> name = "Unsupported";
            }

            Student student = new Student(i, name, "13/10/1997", List.of("Reactjs", "Vuejs"));
            System.out.println(student.name());
            System.out.println(student.toString());
        }
    }
}
