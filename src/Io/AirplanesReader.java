package Io;

import entity.Airplanes;
import util.AirplanesUtil;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirplanesReader {
    private final String filepath;

    public AirplanesReader(String filepath) {
        this.filepath = filepath;
    }
    public List<Airplanes> readAirplanes(){
        List<Airplanes> result = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = reader.readLine()) != null){
            Airplanes airplanes =  AirplanesUtil.toObject(line);
            result.add(airplanes);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
