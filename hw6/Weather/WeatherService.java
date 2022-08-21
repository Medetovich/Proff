package hw6.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

//https://api.open-meteo.com/v1/
// forecast?
// latitude=52.52&
// longitude=13.41&
// hourly=temperature_2m
public interface WeatherService {
    @GET("forecast")
    Call<Data> getWeather(
            @Query("latitude") Double latitude,
            @Query("longitude") Double longitude
    );
}
