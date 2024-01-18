package edu.greenriver.sdev.dadjokes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
    @GeneratedValue
    private int id;
    private String jokeText;
}
