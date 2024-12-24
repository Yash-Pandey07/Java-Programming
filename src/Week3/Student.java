package Week3;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name ;

    public Student(String name){
        this.name = name;
    }
    public boolean isEqual(Student other){
        //if(Objects.equals(this.name, other.name)){
        if(this.name == other.name){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Student o) {

        return this.name.compareTo(o.name);
    }
}
