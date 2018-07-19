package pl.mariuszlyszczarz.weather.controllers;

import pl.mariuszlyszczarz.weather.models.services.WeatherService;
import pl.mariuszlyszczarz.weather.views.MainMenu;

public class MainController {
    private WeatherService weatherService = WeatherService.getInstance();
    String city;
    public void run(){
        //todo test
        MainMenu mainMenu = new MainMenu();
        mainMenu.printMenu();
        while(true) {
            city = mainMenu.getCityFromUser();
            if (city.equals("end")) break;
            mainMenu.sendMessageToConsole(mainMenu.infoWeather(weatherService.getWeather(city)));
            mainMenu.cleanConsole(1);
            mainMenu.navigation();
            mainMenu.cleanConsole(1);
        }
        mainMenu.printGoodbye();
    }
}
