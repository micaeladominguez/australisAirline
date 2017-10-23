public class Employee {

    private boolean isAvailable;
    private final int id;
    private final String name;
    private String flightcode;

    Employee(int id, String name) {
        this.isAvailable = true;
        this.id = id;
        this.name = name;
        flightcode = "You are not assigned to any flight currently";
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
        flightcode="You are assigned to the flight: " +code;
    }

    public void setAvailable(){
        isAvailable = true;
    }

    public void setNoAvailable(){
        isAvailable = false;
        flightcode = "You are not assigned to any flight currently";
    }

    public void removeFlightcode(){
        flightcode = "You are not assigned to any flight currently";
    }

    public String getFlightcode() {
        return flightcode;
    }
}
