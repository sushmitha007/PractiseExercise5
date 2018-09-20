import java.util.*;
import java.util.concurrent.Callable;

public class Student {
    public static void main(String[] args) {
        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(1, 26, "Alice"));
        studs.add(new Student1(3, 19, "Sam"));
        studs.add(new Student1(5, 23, "Sid"));
        studs.add(new Student1(4, 26, "Ram"));
        studs.add(new Student1(7, 20,"Sam"));
        studs.add(new Student1(6, 22,"Bheem"));
Comparator<Student1> com=new StudentComp();
Collections.sort(studs,com);
        for (Student1 s: studs)
            System.out.println(s);
    }

}

class  Student1 {
    int id;
    int age;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student1(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


