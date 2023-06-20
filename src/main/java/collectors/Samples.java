package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class Samples {

    static class Student {
        String name;
        int id;

        String subject;

        double percentage;

        public Student(String name, int id, String subject, double percentage) {
            this.name = name;
            this.id = id;
            this.subject = subject;
            this.percentage = percentage;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String getSubject() {
            return subject;
        }

        public double getPercentage() {
            return percentage;
        }

        @Override
        public String toString() {
            return name + "-" + id + "-" + subject + "-" + percentage;
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Paul", 11, "Economics", 78.9));
        studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
        studentList.add(new Student("Harish", 13, "History", 83.7));
        studentList.add(new Student("Xiano", 14, "Literature", 71.5));
        studentList.add(new Student("Soumya", 15, "Economics", 77.5));
        studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
        studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
        studentList.add(new Student("Mitshu", 18, "History", 73.5));
        studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
        studentList.add(new Student("Harry", 20, "History", 71.9));

        /*
        List<Student> top3students = studentList.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage).reversed())
                .limit(3)
                .toList();

        System.out.println(top3students);
         */

        /*
        Set<String> studentsSub = studentList.stream()
                .map(Student::getSubject)
                .collect(Collectors.toSet());

        System.out.println(studentsSub);
         */
        /*
        Map<String, Double> subStudents = studentList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getPercentage));

        System.out.println(subStudents);
         */

        /*
        List<Student> allStudents = studentList.stream()
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));

        System.out.println(allStudents);
         */
        /*
        String joinedNames = studentList.stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));

        System.out.println(joinedNames);
         */
        /*
        Long studentNum = studentList.stream()
                .collect(Collectors.counting());
        System.out.println(studentNum);
         */
        /*
        Optional<Double> highPercent = studentList.stream()
                .map(Student::getPercentage)
                .max(Comparator.naturalOrder());

        System.out.println(highPercent);
         */
        /*
        Double avgPercent = studentList.stream()
                .collect(Collectors.averagingDouble(Student::getPercentage));
        System.out.println(avgPercent);
        */

        /*
        DoubleSummaryStatistics sumPercent = studentList.stream()
                .collect(Collectors.summarizingDouble(Student::getPercentage));

        System.out.println(sumPercent.getCount());
        System.out.println(sumPercent.getSum());
        System.out.println(sumPercent.getAverage());
        System.out.println(sumPercent.getMin());
        System.out.println(sumPercent.getMax());
        System.out.println(sumPercent.toString());
         */
        /*
        Map<String, List<Student>> studentsGroupBySub = studentList.stream()
                .collect(Collectors.groupingBy(Student::getSubject));

        System.out.println(studentsGroupBySub);
         */

        Map<Boolean, List<Student>> studentsAbove = studentList.stream()
                .collect(Collectors.partitioningBy(student -> student.getPercentage() > 80));

        System.out.println(studentsAbove);
    }
}
