package model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document
@Data
public class Libro {
    @Id
    String isbn;
    String titolo;
    @Indexed
    String  autore;
    Integer anno;
    String link;

    List<String> generi;

    public Libro(String isbn, String titolo, String autore, Integer anno, String link) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.link = link;
    }

    public Libro(String isbn, String titolo, String autore, Integer anno, String link, List<String> generi) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.link = link;
        this.generi = generi;
    }
}
