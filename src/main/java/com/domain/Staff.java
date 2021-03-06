package com.domain;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//Наш POJO класс для представления объекта
public class Staff {
    private String name;
    private int age;
    private String[] position;
    private List<String> skills;
    private Map<String, BigDecimal> salary;

    public Staff (){};

    public Staff(String name, int age, String[] position, List<String> skills, Map<String, BigDecimal> salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.skills = skills;
        this.salary = salary;
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

    public String[] getPosition() {
        return position;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff info" +"\n"+"------------------"+"\n"+
                "name: " + name + "\n" +
                "age: " + age + "\n"+
                "position: " + Arrays.toString(position) +"\n"+
                "skills: " + skills +"\n"+
                "salary: " + salary+"\n"+"------------------"+"\n";
    }
}
