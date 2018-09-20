import java.util.Comparator;

public class StudentComp implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        if (o2.getAge() == o1.getAge()) {
            if (o1.getName().equals(o2.getName())) {
                return o2.getId() - o1.getId();
            }
            return o2.getName().compareTo(o1.getName());
        }

        return o2.getAge() - o1.getAge();
    }
}

