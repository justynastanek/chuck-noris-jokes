package js.jokes;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApiJokesSource myJokes = new ApiJokesSource();

        List<NorrisJoke> myList = myJokes.getJokes(10);

        for(NorrisJoke i: myList){

            System.out.println(i.getValue());
        }
    }
}
