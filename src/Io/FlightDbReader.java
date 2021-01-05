package Io;

import entity.Flight;
import util.DbConnectionUtil;
import util.FlightUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightDbReader {
    private static final String SELECT_ALL = "SELECT * FROM flight";

    public List<Flight> readAll(){
        List<Flight> res = new ArrayList<>();
        Connection connection = DbConnectionUtil.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SELECT_ALL)){
            ResultSet result = statement.executeQuery();
            while (result.next()){
                Flight flight = FlightUtil.toObject(result);
                res.add(flight);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }

}

