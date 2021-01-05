package util;

import entity.Pilots;
import entity.Rank;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PilotsUtil {
    public static Pilots toObject(String line){
        String[] args = line.split(";");

        int id = Integer.parseInt(args[0]);
        String first_name = args[1];
        String last_name = args [2];
        String rank = args[3];
        String pilot_number = args[4];

        return  new Pilots(id, first_name, last_name, Rank.valueOf(rank), pilot_number);
    }

    public static Pilots toObject(ResultSet resultSet) throws SQLException{

            int id = resultSet.getInt("id");
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            String rank = resultSet.getString("rank");
            String pilot_number = resultSet.getString("pilot_number");
        return new Pilots(id, first_name, last_name, Rank.valueOf(rank), pilot_number);
    }
}
