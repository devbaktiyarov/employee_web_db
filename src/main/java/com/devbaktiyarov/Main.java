package com.devbaktiyarov;

import com.devbaktiyarov.employee_web_db.entity.Student;

public class Main {
    public static void main(String[] args) {
        // Employee e = new Employee();
        // e.setId(4L);
        // System.out.println(e.getId());

        // e.setName("Bilim");
        // System.out.println(e.getName());

        // Employee e2 = new Employee(1L, "Arsen");
        // System.out.println(e2.getName());
        // System.out.println(e2);
        // System.out.println(e2.hashCode());
    
        Student rak1 = new Student();
        rak1.setName("Muradil");
        rak1.setGroup(1);

        
        Student rak2 = new Student();
        rak2.setName("Chika");
        rak2.setGroup(1);



        Student rak3 = new Student("Aktilek", 1);
        System.out.println(rak3);

    }
}
