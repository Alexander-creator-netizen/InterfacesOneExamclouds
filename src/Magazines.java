public class Magazines extends PrintedProduct {

    private String nameJournal;

    public Magazines(String nameJournal) {
        this.nameJournal = nameJournal;
    }

    @Override
    public String toString() {
        return getNameJournal();
    }

    public String getNameJournal() {
        return nameJournal;
    }
}
