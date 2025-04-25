package org.howard.edu.lspfinal.question2;

public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Task Not Found Exception: " + super.getMessage(); // Desperate measure. from Gemini
    }

}
