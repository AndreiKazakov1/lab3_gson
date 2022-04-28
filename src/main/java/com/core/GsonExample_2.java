package com.core;


import com.domain.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static com.core.GsonExample_1.createListOfStafs;


//Данный класс позволит прочитать файл json.
public class GsonExample_2 {
    public static void main(String[] args) {

        Gson gson = new GsonBuilder().create();


        try (Reader reader = new FileReader("student.json")) {

           // Convert JSON File to Java Object
            //Staff staff = gson.fromJson(reader, Staff.class);

            Type collType = new TypeToken<List<Staff>>(){}.getType();
          List<Staff> staff = gson.fromJson(reader, collType);

                // print staff
                System.out.println(staff);
            System.out.println("********************************");
            System.out.println("вывод напрямую из коллекции");

            List<Staff> staff1 = createListOfStafs();
            for (Staff s: staff1){
                System.out.println(s);
            }

            /*ArrayList list  = gson.fromJson(reader, ArrayList.class);

            System.out.println(list);
            for ( Object s :
                   list) {
                System.out.println(s);
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
