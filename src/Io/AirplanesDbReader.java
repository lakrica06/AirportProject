package Io;

import entity.Airplanes;
import util.AirplanesUtil;
import util.DbConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AirplanesDbReader {

        private static final String SELECT_ALL = "SELECT * FROM airplanes";

        public List<Airplanes> readAll(){
            List<Airplanes> res = new ArrayList<>();
            Connection connection = DbConnectionUtil.getConnection();
            try(PreparedStatement statement = connection.prepareStatement(SELECT_ALL)){
                ResultSet result = statement.executeQuery();
                while (result.next()){
                    Airplanes airplanes = AirplanesUtil.toObject(result);
                    res.add(airplanes);

                }
            } catch (SQLException e){
                e.printStackTrace();
            }
            return res;
        }

    }
