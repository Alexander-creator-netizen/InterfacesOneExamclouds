public class Magazines {

    String nameJournal;

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
