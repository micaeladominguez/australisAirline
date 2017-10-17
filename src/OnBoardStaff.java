public class OnBoardStaff {

    private boolean isAvailable;
    private final int id;
    private final String name;

    OnBoardStaff(int id, String name) {
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
