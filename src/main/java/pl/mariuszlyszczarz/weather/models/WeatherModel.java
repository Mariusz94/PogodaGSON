package pl.mariuszlyszczarz.weather.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.util.List;

public class WeatherModel {
    private Directions coord;
    private List<Stations> weather;
    private BaseInfo main;
    private WindInfo wind;
    private CloudsInfo clouds;
    private int dt;
    private SysInfo sys;
    private String name;

    public Directions getCoord() {
        return coord;
    }

    public void setCoord(Directions coord) {
        this.coord = coord;
    }

    public List<Stations> getWeather() {
        return weather;
    }

    public void setWeather(List<Stations> weather) {
        this.weather = weather;
    }

    public BaseInfo getMain() {
        return main;
    }

    public void setMain(BaseInfo main) {
        this.main = main;
    }

    public WindInfo getWind() {
        return wind;
    }

    public void setWind(WindInfo wind) {
        this.wind = wind;
    }

    public CloudsInfo getClouds() {
        return clouds;
    }

    public void setClouds(CloudsInfo clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public SysInfo getSys() {
        return sys;
    }

    public void setSys(SysInfo sys) {
        this.sys = sys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WeatherModel{" +
                "\n coord=" + coord +
                "\n weather=" + weather +
                "\n main=" + main +
                "\n wind=" + wind +
                "\n clouds=" + clouds +
                "\n dt=" + LocalDateTime.of(1970,1,1,0,0,0,0).plusSeconds(dt) +
                "\n sys=" + sys +
                "\n name='" + name + '\'' +
                '}';
    }
    public class Directions{
        private double lon;
        private double lat;

        public double getLon() {
            return lon;
        }

        public void setLon(double lon) {
            this.lon = lon;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        @Override
        public String toString() {
            return "lon=" + lon +
                    ", lat=" + lat;
        }
    }

    public class Stations{
        private int id;
        private String main;
        private String description;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMain() {
            return main;
        }

        public void setMain(String main) {
            this.main = main;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return  "id=" + id +
                    ", main='" + main + '\'' +
                    ", description='" + description + '\'';
        }
    }

    public class BaseInfo{
        private double temp;
        private double pressure;
        private double humidity;
        @SerializedName("temp_min") private double tempMin;
        @SerializedName("temp_max") private double tempMax;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public double getHumidity() {
            return humidity;
        }

        public void setHumidity(double humidity) {
            this.humidity = humidity;
        }

        public double getTempMin() {
            return tempMin;
        }

        public void setTempMin(double tempMin) {
            this.tempMin = tempMin;
        }

        public double getTempMax() {
            return tempMax;
        }

        public void setTempMax(double tempMax) {
            this.tempMax = tempMax;
        }

        @Override
        public String toString() {
            return  "temp=" + (temp-273) +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", tempMin=" + (tempMin-273) +
                    ", tempMax=" + (tempMax-273);
        }
    }

    public class WindInfo{
        private double speed;

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        @Override
        public String toString() {
            return "speed=" + speed;
        }
    }

    public class CloudsInfo{
        private double all;

        public double getAll() {
            return all;
        }

        public void setAll(double all) {
            this.all = all;
        }

        @Override
        public String toString() {
            return "all=" + all;
        }
    }

    public class SysInfo{
        private String country;
        private int sunrise;
        private int sunset;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getSunrise() {
            return sunrise;
        }

        public void setSunrise(int sunrise) {
            this.sunrise = sunrise;
        }

        public int getSunset() {
            return sunset;
        }

        public void setSunset(int sunset) {
            this.sunset = sunset;
        }

        @Override
        public String toString() {
            return  "country='" + country + '\'' +
                    ", sunrise=" + LocalDateTime.of(1970,1,1,0,0,0,0).plusSeconds(sunrise) +
                    ", sunset=" + LocalDateTime.of(1970,1,1,0,0,0,0).plusSeconds(sunset);
        }
    }

}

//LocalDateTime.of(1970,1,1,0,0,0,0).plusSeconds(dt)