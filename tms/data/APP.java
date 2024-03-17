package edu.miu.mpp401.project.tms.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class APP {

    List<Task> tasks;

    public APP(){
        tasks=new ArrayList<>();
    }

    public List<Task> getTasks(){
        return  tasks;
    }

    public void addTask(int id, String title, String description, LocalDate dueDate, Priority priority){

        tasks.add(new Task(id, title, description, dueDate, priority));
    }

    public void RemoveTask(Task task){
        tasks.remove(task);
    }

    public void EditTitle(Task task,String newtitle){
        task.setTitle(newtitle);
    }


    public void EditDescription(Task task,String newdescription){
        task.setDescription(newdescription);
    }


    public void EditDueDate(Task task,LocalDate newdate){
        task.setDueDate(newdate);
    }

    public void EditPeriority(Task task,Priority priority){
        task.setPriority(priority);
    }

    public String viewTask(Task task){
        return task.toString();
    }
    @Override
    public String toString(){
        tasks.stream()
                .
    }







}
