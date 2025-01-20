package com.devbaktiyarov.employee_web_db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter
// @ToString
// @EqualsAndHashCode

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    
    private String name; 
    private int group;

    
// @NoArgsConstructor
    // public Student() {
    // }


    
// @AllArgsConstructor
    // public Student(String name, int group) {
    //     this.name = name;
    //     this.group = group;
    // }






    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getGroup() {
    //     return group;
    // }
    // public void setGroup(int group) {
    //     this.group = group;
    // }
    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     result = prime * result + group;
    //     return result;
    // }
    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Student other = (Student) obj;
    //     if (name == null) {
    //         if (other.name != null)
    //             return false;
    //     } else if (!name.equals(other.name))
    //         return false;
    //     if (group != other.group)
    //         return false;
    //     return true;
    // }

    // @Override
    // public String toString() {
    //     return "Student [name=" + name + ", group=" + group + "]";
    // }

    


    

}
