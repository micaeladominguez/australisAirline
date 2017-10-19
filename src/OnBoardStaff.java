public class OnBoardStaff {

    private boolean isAvailable;
    private final int id;
    private final String name;
    private String flightcode;

    OnBoardStaff(int id, String name) {
        this.isAvailable = true;
        this.id = id;
        this.name = name;
        flightcode = "You are not assigned to any flight  currently";
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
    public void setFlightcode(String code){
        flightcode="estas asignado al vuelo" +code;
    }

    public String getFlightcode() {
        return flightcode;
    }
}
