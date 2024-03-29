package edu.greenriver.sdev.dadjokes.service;

import edu.greenriver.sdev.dadjokes.db.DadJokeRepository;
import edu.greenriver.sdev.dadjokes.model.DadJoke;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DadJokeService {

    private DadJokeRepository repository;

    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> getAll() {
        return repository.findAll();
    }

    public void add(DadJoke joke) {
        repository.save(joke);
    }

    public DadJoke update(int id, String jokeText) {
        DadJoke joke = repository.findById(id).orElseThrow();
        joke.setJokeText(jokeText);
        return repository.save(joke);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public DadJoke getByID(int id) {
        return repository.getReferenceById(id);
    }

    public DadJoke randomJoke() {
        Random rng = new Random();
        List<DadJoke> jokes = repository.findAll();
        int randID = rng.nextInt(1, jokes.size() + 1);
        return repository.getReferenceById(randID);
    }
}
