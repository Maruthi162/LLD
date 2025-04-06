package SOLID.SingleResponsibilityPrinciple.ImplementingSRP;

public class Task {
    private String taskName;
    private String taskDescription;
    private boolean isCompleted;

    //constructor
    public Task(String taskName, String taskDescription){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.isCompleted = false;
    }

    //getters and setters
    public String getTaskName(){
        return this.taskName;
    }
    public void setTaskName(String name){
        this.taskName = name;
    }

    public String getTaskDescription(){
        return taskDescription;
    }
    public void setTaskDescription(String description){
        this.taskDescription = description;
    }

    public String markAsCompleted(){
        this.isCompleted = true;
        return "Marked as Completed";
    }
    public boolean isCompleted(){
        return this.isCompleted;
    }
}
