package org.generation.classes;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    public String name;

    public String id;

    public int age;

    public final List<Course> courseList = new ArrayList<>();

    public Student( String name, String id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
        
        
    }
    // Métodos para obtener detalles del estudiante
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public List<Course> getCourseList() {
        return new ArrayList<>(courseList); // Devolver una copia para evitar modificaciones externas
    }

    // Método para inscribir a un estudiante en un curso
    public void enrollInCourse(Course course) {
        courseList.add(course);
    }

    // Método para mostrar los cursos en los que está inscrito el estudiante
    public void showCourses() {
        System.out.println(name + " está inscrito en los siguientes cursos:");
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    // Método toString para representar al estudiante como una cadena
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
