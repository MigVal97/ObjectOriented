package org.generation.exception;

public class CourseNotFoundException extends Exception
{

    public CourseNotFoundException()
    {
        super("course not found!");
    }
    // Constructor con mensaje personalizado
    public CourseNotFoundException(String message) {
        super(message);
    }
}

