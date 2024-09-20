package org.generation.classes;

public class Course
{
    public String name;

    public int credits;

    public String professorName;

    public Course( String name, int credits, String professorName )
    {
        this.name = name;
        this.credits = credits;
        this.professorName = professorName;
    }
    
    // Métodos para obtener detalles del curso
    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getProfessorName() {
        return professorName;
    }

    // Método para representar el curso como una cadena
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", credits=" + credits +
                ", professorName='" + professorName + '\'' +
                '}';
    }
}