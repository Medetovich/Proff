package hw5.animalsFacts;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class AnimalQuoteTester {
    public static void main(String[] args) throws IOException {
//https://cat-fact.herokuapp.com/facts/random?animal_type=dog&amount=2
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://cat-fact.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // ретрофит ужен чтобы создать класс имплементящий аннотированный интерфейс

        AnimalsService service = retrofit.create(AnimalsService.class);
   /*
    Call<List<Fact>> call = service.getFacts("dog", 3);

        Response<List<Fact>> response = call.execute();
        if(response.isSuccessful()){
            List<Fact> facts = response.body();
            for(Fact f:facts){
                System.out.println(f.getText());
            }
        }

    }*/

        Call<Fact> call1 = service.getFact();
        Response<Fact> response1 = call1.execute();
        if(response1.isSuccessful()){
            response1.body();
        }
    }

}
