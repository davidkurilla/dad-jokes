package edu.greenriver.sdev.dadjokes.db;

import edu.greenriver.sdev.dadjokes.model.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {

}
