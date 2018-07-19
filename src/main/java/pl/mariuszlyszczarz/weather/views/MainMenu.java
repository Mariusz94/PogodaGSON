package pl.mariuszlyszczarz.weather.views;

import pl.mariuszlyszczarz.weather.models.WeatherModel;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MainMenu {
    private Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
    }

    public void printMenu(){
        System.out.println("==================================================");
        System.out.println("====================Witaj w Pogodynce=============");
    }

    public void printGoodbye(){
        System.out.println("=====================Goodbye======================");
    }
    public void navigation(){
        System.out.println("Jeśli chcesz poznać pogode dla innego miasta wpisz kolejną nazwe\n" +
                "jeśli chcesz zakończyć działanie progrmu wpisz end");
    }

    public String getCityFromUser(){
        System.out.println("Podaj miasto: ");
        return scanner.nextLine();
    }

    public void cleanConsole(int lines){
        for (int i = 0; i < lines; i++) {
            System.out.println();
        }
    }

    public String infoWeather(WeatherModel weatherModel){
        StringBuilder info = new StringBuilder();
        info.append("Pogoda pobrana dnia : ").append(LocalDateTime.of(1970,1,1,0,0,0,0).plusSeconds(weatherModel.getDt()));
        info.append(" dla : ").append(weatherModel.getName()).append("\n");
        info.append("Aktualna temperatura to : ").append(weatherModel.getMain().getTemp() - 273.15).append(" 'C").append("\n");
        info.append("Ciśnienie wynosi : ").append(weatherModel.getMain().getPressure()).append(" hPa").append("\n");
        info.append("Wilgotnosć na poziomie : ").append(weatherModel.getMain().getHumidity()).append(" %").append("\n");
        info.append("Zachmurzenie : ").append(weatherModel.getClouds().getAll()).append(" %").append("\n");
        info.append("Prędkośc wiatru : ").append(weatherModel.getWind().getSpeed()).append(" km/h");
        return info.toString();
    }

    public void sendMessageToConsole(String message){
        System.out.println(message);
    }
}

