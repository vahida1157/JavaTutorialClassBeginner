package Example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Author hafez = new Author("Hafez Shirazy", "Hafez110@gmail.com", 'm');
        Author parvin = new Author("Parvin Etesami", "p.etesami@yahoo.com", 'f');

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(hafez);
        authors.add(parvin);

        Book divanHafez = new Book("divan hafez", authors, 80_000f);

        for (Author author : divanHafez.getAuthors()) {
            System.out.println(author.getEmail());
        }
    }
}
