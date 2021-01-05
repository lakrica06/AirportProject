package Io;


import entity.Pilots;
import util.DbConnectionUtil;
import util.PilotsUtil;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PilotsDbReader {
    private static final String SELECT_ALL = "SELECT * FROM pilots";

    public List<Pilots> readAll(){
        List<Pilots> res = new ArrayList<>();
        Connection connection = DbConnectionUtil.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SELECT_ALL)){
            ResultSet result = statement.executeQuery();
            while (result.next()){
                Pilots pilots = PilotsUtil.toObject(result);
                res.add(pilots);

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }

}
