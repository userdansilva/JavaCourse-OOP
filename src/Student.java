//public class Student {
//    private String id;
//    private String name;
//    private String classList;
//
//    public Student(String id, String name, String classList) {
//        this.id = id;
//        this.name = name;
//        this.classList = classList;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", classList='" + classList + '\'' +
//                '}';
//    }
//}

public record Student(String id, String name, String classList) {}