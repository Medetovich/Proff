package hw5;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AnimeRandomService {
    @GET("/{random}")
    Call<animeChan> getAnimeRandom (@Path("random")String name);
}
