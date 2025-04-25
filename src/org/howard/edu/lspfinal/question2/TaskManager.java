package org.howard.edu.lspfinal.question2;
import java.util.*;

public class TaskManager {
    Map<String, String> tasks;
    Exception DuplicateTaskException;
    Exception TaskNotFoundException;

    public TaskManager () {
        tasks = new HashMap<>();
    }

    
    /** 
     * @param task
     * @throws Exception
     */
    // Adds a task. Throws an exception if duplicate.
    public void addTask (String task, int tasknumber, String status) throws Exception {
        // https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#entrySet--
        try {
            if (tasks.containsKey(task)) {
                throw new DuplicateTaskException("Duplicate Task");
            }
            else {
            tasks.put(task, status);
            }



        } catch (DuplicateTaskException e) {
            System.err.println(e);
        }
    }
    
    /** 
     * @param task
     * @throws Exception
     */
    // Retrieves a task. Throws an exception if not found.
    public String getTaskByName (String task) throws Exception {
        // https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#entrySet--
        try {
            if (tasks.containsKey(task)) {
                System.out.println(task + " : " + tasks.get(task)); 
                return task;
            }
            else {
            throw new TaskNotFoundException("Task not found");
            }
        } catch (TaskNotFoundException e) {
            System.err.println(task + " does not exist.");
            return "Does not exist";
        }
    }
    
    /** 
     * @param task
     * @param status
     * @throws Exception
     */
    // Updates status. Throws an exception if task not found.
    public void updateStatus (String task, String status) throws Exception {
        // https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#entrySet--
        try { 
            if (tasks.containsKey(task)) {
                if (status.equals("IN_PROGRESS") || (status.equals("DONE")) || (status.equals("TO_DO")))
                tasks.replace(task, status);
            }
            else {
            throw new TaskNotFoundException("Task not found");
            }

        } catch (TaskNotFoundException e) {
            System.err.println(task + " does not exist.");

        }
    }
    
    // Prints tasks by status.
    public void printTasksGroupedByStatus () {
        System.out.println("\nTO_DO:");
        for (String task : tasks.keySet() ) {
            if (tasks.get(task).equals("TO_DO")) {
                System.out.println(task);
            }
            
        }
        System.out.println("\nIN_PROGRESS:");
        for (String task : tasks.keySet() ) {
            if (tasks.get(task).equals("IN_PROGRESS")) {
                System.out.println(task);
            }
            
        }
        System.out.println("\nDONE:");
        for (String task : tasks.keySet() ) {
            if (tasks.get(task).equals("DONE")) {
                System.out.println(task);
            }
            
        }
    }

}
