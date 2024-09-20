package org.generation.exception;

public class StudentNotFoundException extends Exception
{

    public StudentNotFoundException( )
    {
        super( "Student not found!" );
    }
    // Constructor con mensaje personalizado
    public StudentNotFoundException(String message) {
        super(message);
    }

    // Constructor que incluye información sobre el estudiante no encontrado
    public StudentNotFoundException(String id, String name) {
        super("Student not found: ID = " + id + ", Name = " + name);
    }
}
