package entity;

public class Flight {
    private int id;
    private int airplanes_id;
    private int pilots_id;
    private String data_flight;
    private String time_flight;
    private String flight_number;

    public Flight(int id, int airplanes_id, int pilot_id, String data_flight, String time_flight, String flight_number) {
        this.id = id;
        this.airplanes_id = airplanes_id;
        this.pilots_id = pilot_id;
        this.data_flight = data_flight;
        this.time_flight = time_flight;
        this.flight_number = flight_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAirplanes_id() {
        return airplanes_id;
    }

    public void setAirplanes_id(int airplanes_id) {
        this.airplanes_id = airplanes_id;
    }

    public int getPilot_id() {
        return pilots_id;
    }

    public void setPilot_id(int pilot_id) {
        this.pilots_id = pilot_id;
    }

    public String getData_flight() {
        return data_flight;
    }

    public void setData_flight(String data_flight) {
        this.data_flight = data_flight;
    }

    public String getTime_flight() {
        return time_flight;
    }

    public void setTime_flight(String time_flight) {
        this.time_flight = time_flight;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", airplanes_id=" + airplanes_id +
                ", pilot_id=" + pilots_id +
                ", data_flight='" + data_flight + '\'' +
                ", time_flight='" + time_flight + '\'' +
                ", flight_number='" + flight_number + '\'' +
                '}';
    }
}
