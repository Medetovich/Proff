package hw5;

import lesson5.json.RetrofitTester;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class RetrofitAnimeTester {
    public static void main(String[] args) throws IOException {
        Retrofit ret = new Retrofit.Builder()
                .baseUrl("https://animechan.vercel.app/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        AnimeRandomService randomService = ret.create(AnimeRandomService.class);
        Call<animeChan> call = randomService.getAnimeRandom("random");

        Response<animeChan> response = call.execute();
        if(response.isSuccessful()){
            animeChan animeChan = response.body();
            System.out.println(animeChan.getAnime() +" " + animeChan.getCharacter() + " " + animeChan.getQuote());
        }
        System.exit(0);

    }
}
