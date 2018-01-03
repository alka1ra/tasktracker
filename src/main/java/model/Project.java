package model;

import java.util.List;

public class Project {

    private Long id;
    private String name;
    private User creator;

    private List<User> developers;
    private List<Task> tasks;

    public Project(Long id, User creator) {
        this.id = id;
        this.creator = creator;
    }

    public Project(Long id, String name, User creator, List<User> developers, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.developers = developers;
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public List<User> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<User> developers) {
        this.developers = developers;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
