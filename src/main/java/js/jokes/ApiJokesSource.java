package js.jokes;

import com.google.gson.Gson;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;
import java.util.List;

public class ApiJokesSource implements JokeSource{

    @Override
    public List<NorrisJoke> getJokes(int numberOfJokes) {

        List<NorrisJoke> jokesToPrint = new ArrayList<>();

        for(int i = 0; i < numberOfJokes; i++){

            try {

                JsonNode response = Unirest.get("https://api.chucknorris.io/jokes/random").asJson().getBody();
                Gson gson = new Gson();
                NorrisJoke joke = gson.fromJson(response.toString(), NorrisJoke.class);
                jokesToPrint.add(joke);


            }catch(UnirestException ex){
                ex.toString();
            }
        }

        return jokesToPrint;
    }

}
