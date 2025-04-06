/* In the below example TaskManager class having more than one responsibilities 
 *  i.e 1) Representing the Task Class
 *      2) Sending Notifications
 * as per SRP class should have only one reason to change but here we need to change the class 
 * when we want to make any changes to class properties as well as 
 * when we want to madify the notification System
 * 
 * Hence it is voilating the SRP (Single Responsibility Principle)
 */



package SOLID.SingleResponsibilityPrinciple.ViolationOfSRP;
//create a class for handling tasks

public class TaskManager {

    private String taskName;
    private String taskDescription;
    private boolean isCompleted;
   

    //Responsibility -1: Representing the Task

    public TaskManager( String taskName, String taskDescription){
        
        this.taskName=taskName;
        this.taskDescription = taskDescription;
        this.isCompleted = false;
       
    }
    public String markAsCompleted(){
        this.isCompleted = true;
        return "Marked as Completed";
    }
    
    public String getTaskName(){
        return this.taskName;
    }
    public void setTaskName(String name){
        this.taskName = name;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }
    public void setTaskDescription(String description){
        this.taskDescription = description;
    }

    public boolean isCompleted(){
        return this.isCompleted;
    }

    //Responsibility -2: Sending Notification

    public void sendNotification(){

            //logic to send notifications about the task
    }

}
