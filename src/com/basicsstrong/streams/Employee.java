package com.basicsstrong.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

        private int id;
        private String name;
        private int age;
        private long salary;
        private String gender;
        private String deptName;
        private String city;
        private int yearOfJoining;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public Employee(int id, String name, int age, long salary, String gender,
                    String deptName, String city, int yearOfJoining) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.gender = gender;
            this.deptName = deptName;
            this.city = city;
            this.yearOfJoining = yearOfJoining;
        }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    // Getters and setters omitted for brevity
        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", gender='" + gender + '\'' +
                    ", deptName='" + deptName + '\'' +
                    ", city='" + city + '\'' +
                    ", yearOfJoining='" + yearOfJoining + '\'' +
                    '}';
        }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(2, "abc", 28, 30000, "F", "HR", "Blore", 2020));
        empList.add(new Employee(1, "xyz", 29, 22000, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 25000, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 19000, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 80000, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 96000, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 34000, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 65010, "M", "IT", "Trivandrum", 2015));
        empList.add(new Employee(9, "stv", 25, 68000, "M", "IT", "Blore", 2010));

        //Third Highest Salary
        List<Employee> thirdSalary = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .limit(1)
                .toList();
        System.out.println(thirdSalary);


        //average age of all the employees
        Double averageAge = empList.stream().collect(Collectors.averagingDouble(Employee::getAge));
        System.out.println(averageAge);


        //Sort the employees based on city and then name
        List<Employee> empCity = empList.stream().
                                    sorted(Comparator.comparing(Employee::getCity).thenComparing(Employee::getName)).toList();
        System.out.println(empCity);
        //Employee in It department get name

        List<String> empDept = empList.stream()
                .filter(e -> e.getDeptName().equals("IT"))
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(empDept);

        //Highest salary in the list
        List<Employee> highestSal = empList.stream().distinct()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
                .limit(1).toList();
        System.out.println(highestSal);

        String empHigh  = empList.stream().distinct().max(Comparator.comparing(Employee::getSalary)).toString();
        System.out.println(empHigh);

        //Increment the hr salary by 10k
         empList.stream()
                .filter(employee -> employee.getDeptName().equals("HR"))
                .peek(employee -> employee.setSalary(employee.getSalary() + 10000))
                .forEach(System.out::println);



        //employee data sort first by salary and  then location
        List<Employee> em = empList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getCity)).collect(Collectors.toList());
        System.out.println(em);

        //Average of the employee salary
        Double avg = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);

        //count of male and female employee
        Map<String, Long> count = empList.stream()
                .collect( Collectors.groupingBy(Employee::getGender,Collectors.counting()) );
        System.out.println("hai"+ count);

        //unique departments
        List<String> department = empList.stream()
                .map(Employee::getDeptName).distinct()
                .toList();
        System.out.println("Unique Department:"+ department);



        //First 5 employees of the  have highest salary
        List<Employee>  first5 = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).distinct().collect(Collectors.toList());
        System.out.println(first5);

        //get the distinct employee based on department name
        List<String> dis = empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
        System.out.println(dis);


        List<Employee> ageGreaterThan30 = empList.stream()
                .filter(employee -> employee.getAge() > 30 )
                .collect(Collectors.toList());
        System.out.println(ageGreaterThan30);

        List<Employee> sortBasedonEmployeeName = empList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList());
        System.out.println(sortBasedonEmployeeName);

        List<Employee> incre = empList.stream().filter(e -> Objects.equals(e.getDeptName(), "HR")).collect(Collectors.toList());
        System.out.println(incre);

        List<Employee> hrEmployees = empList.stream()
                .filter(e -> Objects.equals(e.getDeptName(), "HR"))
                .peek(e -> e.setSalary(e.getSalary() + 10000)) // Increment salary by 10000
                .collect(Collectors.toList());
        System.out.println(hrEmployees);




       //get the employeee list start with name a
        List<Employee> ansList = empList.stream().filter(x -> x.name.startsWith("a")).collect(Collectors.toList());
        //Sorting the employee list by id
        List<Employee> sortIdList = empList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).collect(Collectors.toList());
        System.out.println(sortIdList);
        System.out.println(ansList);

        List<Employee> sort = empList.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());


        //grouping elements by city
        Map<String, List<Employee>> groupCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(groupCity);
        Map<Integer, List<Employee>> groupyear = empList.stream().collect(Collectors.groupingBy(Employee::getYearOfJoining));
        System.out.println(groupyear);

        //Grouping employees by Agee
        Map<Integer, List<Employee>> groupingByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(groupingByAge);

        Map<String, Long> countOfMaleAndFemaleEmployees = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(countOfMaleAndFemaleEmployees);

        //Maximum age
        OptionalInt maxAge = empList.stream().mapToInt(Employee::getAge).max();
        System.out.println(maxAge);

        //Maximum salary
        OptionalLong maxSalary = empList.stream().mapToLong(Employee::getSalary).max();
        System.out.println("MaximumSalary " + maxSalary);


        //Printing average age of Male and Female employees
        //<String, Double> averageAge = empList.stream().collect(Collectors.groupingBy(Employee::getGender),Collectors.averagingDouble(Employee::getAge)));
        Map<String, Double> averageAgeEmployee = empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getAge)));
        System.out.println(averageAgeEmployee);

        //print the number employees in each dept
        Map<String, Long> noOfEmp = empList.stream().collect(Collectors.groupingBy((Employee::getDeptName), Collectors.counting()));
        System.out.println(noOfEmp);

        //Oldest employee
        List<Employee> sortID = empList.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());

        System.out.println(sortID);

        //average age of employee
        Double aver = empList.stream().collect(Collectors.averagingDouble(Employee::getAge));
        System.out.println(aver);

        //sort depending upon salary

        List<Employee> topThreeSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary))
                .limit(3).collect(Collectors.toList());
        System.out.println(topThreeSalary);

        //
        List<Employee> lessthanTHird = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(3).collect(Collectors.toList());

        //group by department
        Map<String, Long> ansl = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
        System.out.println(ansl);

        //Sort the Employee salary in Desc order
        List<Employee> sortedSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(3)
                .collect(Collectors.toList());
        System.out.println(sortedSalary);

        //highest salary

        //get salary of each department


        Map<String, List<Employee>> salary = empList.stream().collect( Collectors.groupingBy(Employee::getDeptName ) );

        System.out.println(salary);
        List < Employee > highest = empList.stream().max(Comparator.comparing(Employee::getSalary)).stream().toList();
        Optional<Long> sal = empList.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println(sal);




    }


}
