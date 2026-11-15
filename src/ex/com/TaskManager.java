package ex.com;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.StructuredTaskScope.Subtask;

public class TaskManager {
    private final List<Subtask> tasks = new ArrayList<>();

    public void add(String title) { tasks.add(new Subtask(title)); }

    public void complete(int index) { ((Object) tasks.get(index)).setCompleted(true); }

    public List<Task> getPending() {
        List<Task> pending = new ArrayList<>();
        for (Subtask t : tasks) if (!t.isCompleted()) pending.add(t);
        return pending;
    }

    public List<Subtask> getAll() { return tasks; }

    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.add("Apprendre Java Collections");
        tm.add("Faire les courses");
        tm.complete(0);

        System.out.println("Toutes les tâches :");
        tm.getAll().forEach(System.out::println);
        System.out.println("Tâches restantes :");
        tm.getPending().forEach(System.out::println);
    }
}