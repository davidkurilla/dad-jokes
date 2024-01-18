package edu.greenriver.sdev.dadjokes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DadJoke {

    // FIELDS
    @Id
    private int id;
    private String jokeText;
}
