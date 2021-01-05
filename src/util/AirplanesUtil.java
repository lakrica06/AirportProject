package util;

import entity.Airplanes;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AirplanesUtil {

public static Airplanes toObject(String line){
    String[] args = line.split(";");
    int id = Integer.parseInt(args[0]);
    String mark = args[1];
    String model = args[2];
    int capacity = Integer.parseInt(args[3]);
    String plane_number = args[4];
    return new Airplanes(id, mark, model, capacity, plane_number);
}
    public static Airplanes toObject(ResultSet resultSet) throws SQLException {
    int id = resultSet.getInt("id");
    String mark = resultSet.getString("mark");
    String model = resultSet.getString("model");
    int capacity = resultSet.getInt("capacity");
    String plane_number = resultSet.getString("plane_number");
    return new Airplanes(id, mark, model, capacity, plane_number);
    }
}
