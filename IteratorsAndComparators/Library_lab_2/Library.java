package JavaAdvanced.IteratorsAndComparators.Library;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private class LibIterator implements Iterator<Book> {

        private int counter;

        public LibIterator(int counter) {
            this.counter = 0;
        }

        public LibIterator() {
        }

        @Override
        public boolean hasNext() {
            return this.counter < books.length - 1;
        }
        @Override
        public Book next() {
            return books[this.counter++];
        }
    }
}
