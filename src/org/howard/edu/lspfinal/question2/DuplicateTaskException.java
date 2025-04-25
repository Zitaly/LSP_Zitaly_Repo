package org.howard.edu.lspfinal.question2;

public class DuplicateTaskException extends Exception {
    public DuplicateTaskException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Duplicate Task Exception: " + super.getMessage(); // Desperate measure. from Gemini
    }

}
