package Io;

import entity.Flight;
import util.FlightUtil;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightReader {
    private final String filepath;

    public FlightReader(String filepath) {
        this.filepath = filepath;
    }

    public List<Flight> readFlight(){
        List<Flight> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;

            while((line = reader.readLine()) != null){

                Flight flight = FlightUtil.toObject(line);
                result.add(flight);
            }
        } catch (IOException e){
            System.out.println("Ошибка чтения");
        }
        return result;
    }
}
