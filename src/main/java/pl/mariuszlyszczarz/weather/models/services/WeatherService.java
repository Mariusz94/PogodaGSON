package pl.mariuszlyszczarz.weather.models.services;

import com.google.gson.Gson;
import pl.mariuszlyszczarz.weather.models.Utils;
import pl.mariuszlyszczarz.weather.models.WeatherModel;
import pl.mariuszlyszczarz.weather.views.MainMenu;

public class WeatherService {
    private static WeatherService ourInstance = new WeatherService();

    public static WeatherService getInstance() {
        return ourInstance;
    }

    private WeatherService() {
    }

    public WeatherModel getWeather(String city){
        String websiteResponse = Utils.redWebsiteContent("http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=309de344ece3620d91da5bf4945d9265");

        Gson gson = new Gson();

        WeatherModel weather = gson.fromJson(websiteResponse,WeatherModel.class);

        return weather;
    }


}
