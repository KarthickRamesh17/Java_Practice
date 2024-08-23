package com.basicsstrong.streams;


import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentQ {
    private static final Logger log = Logger.getLogger(StudentQ.class.getName());

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                new Student(1, "Mukesh", 156800, 36, "male", "Bangalore", "IT", 92, Arrays.asList("8798798", "7865765")),
                new Student(2, "Jack", 236000, 36, "male", "Sydney", "Computers", 19, Arrays.asList("3543556", "34534646")),
                new Student(3, "Umesh", 56000, 46, "male", "Mumbai", "Digital Marketing", 30, Arrays.asList("4534645", "23432545")),
                new Student(4, "Usha", 72400, 32, "female", "Delhi", "Computers", 39, Arrays.asList("8798798", "7865765")),
                new Student(5, "Uma", 93000, 22, "female", "Belgavi", "IT", 33, Arrays.asList("8798798", "7865765")),
                new Student(6, "Rainbow", 80000, 30, "female", "Bangalore", "Digital Marketing", 82, Arrays.asList("99890443", "873563")),
                new Student(7, "Isha", 122600, 26, "female", "Bangalore", "Science", 92, Arrays.asList("34345654", "3443436")),
                new Student(8, "Sparrow", 231300, 24, "female", "New York", "Science", 9, Arrays.asList("9878978", "865656")),
                new Student(9, "Dinesh", 227530, 56, "male", "Sydney", "Computers", 42, Arrays.asList("8976786", "09877654"))
        ).toList();

        //Maximum  mark of the student in each subject
        OptionalInt maxRank = studentList.stream()
                .mapToInt(Student::getRank)
                .max();
        System.out.println(maxRank.toString());

        // Find the rank of students having rank between 50-100
        List<Student> studentByRank = studentList.stream()
                .filter(student -> student.getRank() > 50 && student.getRank() < 100)
                .toList();
        System.out.println("Students with rank between 50 and 100: " + studentByRank);

        // Find students staying in Bangalore and sort them based on their names
        List<Student> studentsByCity = studentList.stream()
                .filter(student -> student.getCity().equals("Bangalore"))
                .sorted(Comparator.comparing(Student::getName, Comparator.reverseOrder()))
                .toList();
        System.out.println("Students in Bangalore sorted by name: " + studentsByCity);

        // Find all department names {1st method}
        List<String> deptNames = studentList.stream()
                .map(Student::getDept)
                .distinct()
                .toList();
        System.out.println("Distinct department names: " + deptNames);

        // Find all department names {2nd method}
        Set<String> depts = studentList.stream()
                .map(Student::getDept)
                .collect(Collectors.toSet());
        System.out.println("Distinct department names (Set): " + depts);

        // Find average salary of each department
        Map<String, Double> deptMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.averagingInt(Student::getSalary)));
        deptMap.forEach((dept, salary) -> System.out.println("Dept: " + dept + " | Average salary: " + salary));

        // Find all the contact numbers
        List<String> phoneNumbers = studentList.stream()
                .flatMap(student -> student.getPhone().stream())
                .distinct()
                .toList();
        System.out.println("Distinct phone numbers: " + phoneNumbers);

        // Find all students whose name starts with 'U'
        List<Student> studentsWithU = studentList.stream()
                .filter(student -> student.getName().startsWith("U"))
                .toList();
        System.out.println("Students whose name starts with 'U': " + studentsWithU);

        // Find all students having gender female and dept science
        List<Student> femaleStudents = studentList.stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getDept().equals("Science"))
                .toList();
        System.out.println("Female students in Science department: " + femaleStudents);

        // Group students by department name
        Map<String, List<Student>> studentGroup = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));
        studentGroup.entrySet().forEach(System.out::println);

        // Group students by department name (just return count of students)
        Map<String, Long> countStudentByDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        countStudentByDept.forEach((dept, count) -> System.out.println("Department: " + dept + " | Count: " + count));

        // Group students by department name
        Set<Map.Entry<String, Long>> entries = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting())).entrySet();
        System.out.println("Department with student count");
        System.out.println("-------------------------------");
        System.out.println(entries);

        // Find the average age of male and female students
        Map<String, Double> averageAgeByGender = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average age by gender: " + averageAgeByGender);

        // Find the highest rank in each department
        Map<String, Optional<Student>> maxRankByDept = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.maxBy(Comparator.comparing(Student::getRank))));
        System.out.println("Highest rank in each department: " + maxRankByDept);

        // Find the student having 2nd rank
        List<Student> secondRank = studentList.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1)
                .limit(1)
                .toList();
        System.out.println(secondRank);
    }
}


