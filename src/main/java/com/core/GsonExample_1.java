package com.core;

import com.domain.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
//Задание: Добавьте еще одного сотрудника и прочтите данные из файла.
//Данный класс необходим для создания маршалинга, сздания объекта и записи его
// в файл.
public class GsonExample_1 {
    public static void main(String[] args) {

        // pretty print
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        //Gson gson = new Gson();
        //Staff staff = createStaffObject();
        List<Staff> staff = createListOfStafs();

        // Java objects to String
        String json = gson.toJson(staff);
        System.out.println(json);
        try (FileWriter writer = new FileWriter("student.json")) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*private static Staff createStaffObject() {

        Staff staff = new Staff();

        staff.setName("oleg");
        staff.setAge(35);
        staff.setPosition(new String[]{"Founder", "SEO", "coder"});
        Map<String, BigDecimal> salary = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff.setSalary(salary);
        staff.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

        return staff;

    }
*/

    public static List<Staff> createListOfStafs() {



        Staff staff1 = new Staff();

        staff1.setName("misha");
        staff1.setAge(35);
        staff1.setPosition(new String[]{"Founder", "SEO", "coder"});
        Map<String, BigDecimal> salary1 = new HashMap() {{
            put("2010", new BigDecimal(10000));
            put("2012", new BigDecimal(12000));
            put("2018", new BigDecimal(14000));
        }};
        staff1.setSalary(salary1);
        staff1.setSkills(Arrays.asList("java", "python", "node", "kotlin"));

        Staff staff2 = new Staff();

        staff2.setName("ritta");
        staff2.setAge(33);
        staff2.setPosition(new String[]{"coder", "SEO"});
        Map<String, BigDecimal> salary2 = new HashMap() {{
            put("2011", new BigDecimal(15000));
            put("2015", new BigDecimal(14000));
            put("2020", new BigDecimal(18000));
        }};
        staff2.setSalary(salary2);
        staff2.setSkills(Arrays.asList("java", "python", "html+css"));

        List<Staff> list = new ArrayList<>();
        list.add(staff1);
        list.add(staff2);


        return list;

    }

}
