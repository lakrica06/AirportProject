package util;


import entity.Flight;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightUtil {
    public static Flight toObject(String line) {
        String[] args = line.split(";");

        int id = Integer.parseInt(args[0]);
        int airplanes_id = Integer.parseInt(args[1]);
        int pilots_id = Integer.parseInt(args[2]);
        String data_flight = args[3];
        String time_flight = args[4];
        String flight_number = args[5];
        return new Flight(id, airplanes_id, pilots_id, data_flight, time_flight, flight_number);
    }
    public static Flight toObject(ResultSet resultSet) throws SQLException{
        int id = resultSet.getInt("id");
        int airplanes_id = resultSet.getInt("airplanes_id");
        int pilots_id = resultSet.getInt("pilots_id");
        String data_flight = resultSet.getString("data_flight");
        String time_flight = resultSet.getString("time_flight");
        String flight_number = resultSet.getString("flight_number");
        return new Flight(id, airplanes_id, pilots_id, data_flight, time_flight, flight_number);
   }

}