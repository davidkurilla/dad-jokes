package edu.greenriver.sdev.dadjokes.controller;

import edu.greenriver.sdev.dadjokes.model.DadJoke;
import edu.greenriver.sdev.dadjokes.service.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DadJokeController {

    private DadJokeService dadJokeService;

    public DadJokeController(DadJokeService dadJokeService) {
        this.dadJokeService = dadJokeService;
    }

    @GetMapping("/jokes")
    public List<DadJoke> getJokes() {
        return dadJokeService.getAll();
    }

    @PostMapping("/jokes")
    public void addJoke(@RequestBody DadJoke joke) {
        dadJokeService.add(joke);
    }

    @PutMapping("jokes/{id}")
    public DadJoke updateJoke(@PathVariable int id, @RequestBody DadJoke updatedJoke) {
        return dadJokeService.update(id, updatedJoke.getJokeText());
    }

    @DeleteMapping("jokes/{id}")
    public void deleteJoke(@PathVariable int id) {
        dadJokeService.delete(id);
    }
}
