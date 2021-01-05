package Io;

import entity.Flight;

import util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightDbWriter {
    private List<Flight> flight;
    private static final String ADD = "INSERT INTO flight (id, airplanes_id, pilots_id, data_flight, time_flight, flight_number) VALUES(?, ?, ?, ?, ?, ?)";

    public FlightDbWriter(List<Flight> flight) {
        this.flight = flight;
    }

    public void saveAll(){
        for(Flight flight: flight){
            save(flight);
        }
    }
    private void save(Flight flight){
        Connection connection = DbConnectionUtil.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setInt(1, flight.getId());
            statement.setInt(2, flight.getAirplanes_id());
            statement.setInt(3, flight.getPilot_id());
            statement.setString(4, flight.getData_flight());
            statement.setString(5, flight.getTime_flight());
            statement.setString(6, flight.getFlight_number());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}


