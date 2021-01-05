import Io.*;
import entity.Airplanes;
import entity.Flight;
import entity.Pilots;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    /*
        System.out.println("Идёт запись в таблицу pilots");
        PilotsReader pilotsReader = new PilotsReader(PathConstants.Pilots_Path);
        List<Pilots> pilots = pilotsReader.readPilot();
        PilotsDbWriter pilotsDbWriter = new PilotsDbWriter(pilots);
        pilotsDbWriter.saveAll();



        for (Pilots pilots1 : (new PilotsDbReader()).readAll()) {
            System.out.println(pilots1.toString());
        }
        System.out.println("Запись в таблицу pilots завершена");


        System.out.println("Идёт запись в таблицу airplanes");
        AirplanesReader airplanesReader = new AirplanesReader(PathConstants.Airplanes_Path);
        List<Airplanes> airplanes = airplanesReader.readAirplanes();
        AirplanesDbWriter airplanesDbWriter = new AirplanesDbWriter(airplanes);
        airplanesDbWriter.saveAll();

        for (Airplanes airplanes1 : (new AirplanesDbReader()).readAll()) {
            System.out.println(airplanes1.toString());
        }
        System.out.println("Запись в таблицу airplanes завершена");


        System.out.println("Идёт запись в таблицу flight");
        FlightReader flightReader = new FlightReader(PathConstants.Flight_Path);
        List<Flight> flights = flightReader.readFlight();
        FlightDbWriter flightDbWriter = new FlightDbWriter(flights);
        flightDbWriter.saveAll();

        for (Flight flights1 : (new FlightDbReader()).readAll()) {
            System.out.println(flights1.toString());
        }
        System.out.println("Запись в таблицу flight завершена");

        */
    FullInfoDb fullInfoDb = new FullInfoDb();
        System.out.println(fullInfoDb.read_all());


        try(FileWriter fileWriter = new FileWriter("result.csv")){
            fileWriter.write(fullInfoDb.read_all());
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}



