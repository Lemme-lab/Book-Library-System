package Package;

public class Buch {

    private String titel;
    private String author;
    private int publicationYear;
    private int numberOfReader;
    private boolean borrowed;

    public Buch(String tit, String aut, int puby){
        titel = tit;
        author = aut;
        publicationYear = puby;
        numberOfReader = 0;
        borrowed = false;
    }



    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public int getNumberOfReader() {
        return numberOfReader;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public void setNumberOfReader(int numberOfReader) {
        this.numberOfReader = numberOfReader;
    }

    @Override
    public String toString() {
        return "Buch: " +
                 titel + '\'' +
                ", " + author + '\'' +
                ", " + publicationYear +
                ", borrowed: " + borrowed +
                '}';
    }
}
