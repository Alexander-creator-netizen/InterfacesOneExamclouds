public class Books extends PrintedProduct {

    private String bookName;

    public Books(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return getBookName();
    }

    public String getBookName() {
        return bookName;
    }
}
