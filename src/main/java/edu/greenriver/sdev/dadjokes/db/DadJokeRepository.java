package edu.greenriver.sdev.dadjokes.db;

import edu.greenriver.sdev.dadjokes.model.DadJoke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {

}
