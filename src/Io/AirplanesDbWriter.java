package Io;

import entity.Airplanes;
import util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AirplanesDbWriter {
    private List<Airplanes> airplanes;
    private static final String ADD = "INSERT INTO airplanes (id, mark, model, capacity, plane_number) VALUES(?, ?, ?, ?, ?)";

    public AirplanesDbWriter(List<Airplanes> airplanes) {
        this.airplanes = airplanes;
    }

    public void saveAll(){
        for(Airplanes airplanes : airplanes){
            save(airplanes);
        }
    }
    private void save(Airplanes airplanes){
        Connection connection = DbConnectionUtil.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(ADD)){
            statement.setInt(1, airplanes.getId());
            statement.setString(2, airplanes.getMark());
            statement.setString(3, airplanes.getModel());
            statement.setInt(4, airplanes.getCapacity());
            statement.setString(5, airplanes.getPlane_number());
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

