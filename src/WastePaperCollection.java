import java.util.ArrayList;

public class WastePaperCollection {

    static Library library = new Library();
    static BookShop bookShop = new BookShop();

    public static void main(String[] args) {

        Books bookOne = new Books("Harry Potter");
        Books bookTwo = new Books("The Master and Margarita");
        Books bookThree = new Books("War and peace");

        Magazines journalOne = new Magazines("Fashion today");
        Magazines journalTwo = new Magazines("A journey through the cosmic expanses");
        Magazines journalThree = new Magazines("Crosswords");

        ArrayList<Object> checkList = new ArrayList<>();

        checkList.add(bookOne);
        checkList.add(bookTwo);
        checkList.add(bookThree);
        checkList.add(journalOne);
        checkList.add(journalTwo);
        checkList.add(journalThree);

        ArrayList <Object> booksList = new ArrayList<>();
        ArrayList <Object> journalList = new ArrayList<>();

        for (Object arrayList : checkList) {
            if (arrayList instanceof Books) {
                booksList.add(arrayList);
            } else {
                journalList.add(arrayList);
            }
        }

        library.showInfo(booksList);
        bookShop.showInfo(journalList);
    }
}
