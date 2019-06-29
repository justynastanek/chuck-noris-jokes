package js.jokes;

import java.util.List;

public interface JokeSource {

    List<NorrisJoke> getJokes(int numberOfJokes);

}
