import java.util.HashMap;
import java.util.Map;

public class Airplane {

    private final String code;

    public Airplane(String code) {
        this.code = code;
        Map<String, Seat> seatMap = new HashMap<>();
    }

    public String getCode() {
        return code;
    }
}
