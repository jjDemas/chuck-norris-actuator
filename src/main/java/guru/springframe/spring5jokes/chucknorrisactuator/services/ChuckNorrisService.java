package guru.springframe.spring5jokes.chucknorrisactuator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisService implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String GetJoke() {

        return chuckNorrisQuotes.getRandomQuote();
    }
}
