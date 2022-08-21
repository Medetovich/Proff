package lesson5.json;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GeoCoderService {
    @GET("/{ip}")
    Call<GeoCode> getGeoCode(@Path("ip")String ip);// GET https://.../ip

}
