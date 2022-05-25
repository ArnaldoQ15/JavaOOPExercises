package com.javaoopexercises.BookPublication.model;

import com.javaoopexercises.BookPublication.service.PublicationService;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Book implements PublicationService {

    private String title;
    private String author;
    private Integer pages;
    private Integer actualPage;
    private Boolean open;
    private Person reader;


    public String details() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                ", open=" + open +
                ", reader=" + reader.getName() +
                ", sex=" + reader.getSex().getDescription() +
                '}';
    }

    public Book(String title, String author, Integer pages, Person reader) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.open = false;
        this.reader = reader;
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void browse(int p) {
        if (p > this.pages) {
            this.actualPage = 0;

        } else {
            this.actualPage = p;
        }
    }

    @Override
    public void nextPage() {
        this.actualPage = this.actualPage + 1;
    }

    @Override
    public void backPage() {
        this.actualPage = this.actualPage - 1;
    }


    public static void main(String[] args) {

        Person[] p = new Person[2];
        Book[] b = new Book[3];

        p[0] = new Person("Arnaldo", 22, PersonSex.MALE);
        p[1] = new Person("Catarina", 23, PersonSex.FEMALE);

        b[0] = new Book("One Piece vol. 103", "Eiichiro Oda", 120, p[0]);
        b[1] = new Book("Death Note vol. 5", "Tsugumi Ohba", 160, p[0]);
        b[2] = new Book("Fullmetal Alchemist vol. 12", "Hiromu Arakawa", 60, p[1]);

        Random random = new Random();
        int bookChoosed = random.nextInt(3);

        System.out.println(b[bookChoosed].details());

    }

}
