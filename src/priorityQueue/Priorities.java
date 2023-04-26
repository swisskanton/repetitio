package priorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    List<Student> getStudents(List<String> events) {

        List<Student> students = new ArrayList<>();
        PriorityQueue<Student> queue = new PriorityQueue<>(Comparator.comparingDouble(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparingInt(Student::getID));
        events.forEach(event -> {
            if (event.charAt(0) == 'E') {
                String[] data = event.split(" ");
                int id = Integer.parseInt(data[3]);
                String name = data[1];
                double cgpa = Double.parseDouble(data[2]);
                Student student = new Student(id, name, cgpa);
                queue.add(student);
            } else
                queue.poll();
        });
        while(!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;
    }
}
