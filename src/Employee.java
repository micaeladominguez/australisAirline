public class Employee {

    private boolean isAvailable;
    private final int id;
    private final String name;

    Employee(int id, String name) {
        this.isAvailable = true;
        this.id = id;
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
