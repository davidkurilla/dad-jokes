package edu.greenriver.sdev.dadjokes.service;

import edu.greenriver.sdev.dadjokes.db.DadJokeRepository;
import edu.greenriver.sdev.dadjokes.model.DadJoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadJokeService {

    private DadJokeRepository repository;

    @Autowired
    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> getAll() {
        return repository.findAll();
    }

    public void add(DadJoke joke) {
        repository.save(joke);
    }

    public void update(int id, String jokeText) {
        DadJoke joke = repository.getById(id);
        repository.deleteById(id);
        joke.setJokeText(jokeText);
        repository.save(joke);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
