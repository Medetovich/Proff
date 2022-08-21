package hw5.animalsFacts;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

/*
https://cat-fact.herokuapp.com/facts/random?animal_type=dog&amount=2
 */
public interface AnimalsService {
    @GET("facts/random")
    Call<List<Fact>> getFacts(
            @Query("animal_type") String animal,
            @Query("amount") int number);

    @GET("facts/random")
    Call<Fact> getFact();
}
