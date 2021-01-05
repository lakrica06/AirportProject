package Io;


import util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FullInfoDb {
    private static final String SELECT_ALL = "select f.flight_number, f.data_flight, f.time_flight, a.plane_number, a.mark, a.model, a.capacity, p.last_name, left(p.first_name, 1), p.pilot_number, p.rank \n" +
            "From flight f inner join airplanes a on f.airplanes_id = a.id join pilots p on f.pilots_id = p.id;";

    public String read_all() {

        Connection connection = DbConnectionUtil.getConnection();
        String a;
        List<String> b = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {

            ResultSet result = statement.executeQuery();
            while (result.next()) {
                String flight_number = result.getString("f.flight_number");
                String data_flight = result.getString("f.data_flight");
                String time_flight = result.getString("f.time_flight");
                String mark = result.getString("a.mark");
                String model = result.getString("a.model");
                int capacity = result.getInt("a.capacity");
                String last_name = result.getString("p.last_name");
                String first_name = result.getString("left(p.first_name, 1)");
                String pilot_number = result.getString("pilot_number");
                String rank = result.getString("rank");

                a = (flight_number + " - " + data_flight + " - " + time_flight + " - " + mark + " "
                        + model + " - " + capacity + " - " + last_name + " " + first_name + ". " + pilot_number + " (" + rank + ")" + "\n");
                b.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return b.toString();
    }
}
