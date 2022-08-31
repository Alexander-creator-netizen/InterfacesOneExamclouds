import java.util.LinkedList;

public class SecondPaperCollection {
    static Library library = new Library();
    static BookShop bookShop = new BookShop();

    public static void main(String[] args) {

        Books bookOne = new Books("Harry Potter");
        Books bookTwo = new Books("The Master and Margarita");
        Books bookThree = new Books("War and peace");

        Magazines journalOne = new Magazines("Fashion today");
        Magazines journalTwo = new Magazines("A journey through the cosmic expanses");
        Magazines journalThree = new Magazines("Crosswords");

        LinkedList<Object> checkList = new LinkedList<>();

        checkList.add(bookOne);
        checkList.add(bookTwo);
        checkList.add(bookThree);
        checkList.add(journalOne);
        checkList.add(journalTwo);
        checkList.add(journalThree);

        LinkedList<Object> booksList = new LinkedList<>();
        LinkedList<Object> journalList = new LinkedList<>();

        for (Object linkedList : checkList) {
            if (linkedList instanceof Books) {
                booksList.add(linkedList);
            } else {
                journalList.add(linkedList);
            }
        }

        library.showInfo(booksList);
        System.out.println();
        bookShop.showInfo(journalList);
    }
}
