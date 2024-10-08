public class Student {
    private String StudentName ;
    private String City;
    private int Age;


    public Student(String studentName, String city, int age) {
        this.StudentName = studentName;
        this.City = city;
        this.Age = age;
    }

    @Override
    public String toString() {
        return"{" +
                "StudentName='" + StudentName + '\'' +
                ", City='" + City + '\'' +
                ", Age=" + Age +
                '}';
    }
}
