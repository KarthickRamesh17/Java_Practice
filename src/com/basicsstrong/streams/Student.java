package com.basicsstrong.streams;

import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int salary;
    private int age;
    private String gender;
    private String city;
    private String dept;
    private int rank;
    private List<String> phone;

    public Student(int id, String name, int salary, int age, String gender, String city, String dept, int rank, List<String> phone) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.city = city;
        this.dept = dept;
        this.rank = rank;
        this.phone = phone;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id && age == student.age && rank == student.rank && Objects.equals(name, student.name) && Objects.equals(gender, student.gender) && Objects.equals(city, student.city) && Objects.equals(dept, student.dept) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, city, dept, rank, phone);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", dept='" + dept + '\'' +
                ", rank=" + rank +
                ", phone=" + phone +
                '}';
    }
}

