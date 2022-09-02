import java.util.LinkedList;

public class SecondPaperCollection {
    static Library library = new Library();
    static BookShop bookShop = new BookShop();

    public static void main(String[] args) {

        PrintedProduct bookOne = new Books("Harry Potter");
        PrintedProduct bookTwo = new Books("The Master and Margarita");
        PrintedProduct bookThree = new Books("War and peace");

        PrintedProduct journalOne = new Magazines("Fashion today");
        PrintedProduct journalTwo = new Magazines("A journey through the cosmic expanses");
        PrintedProduct journalThree = new Magazines("Crosswords");

        LinkedList <PrintedProduct> checkList = new LinkedList<>();

        checkList.add(bookOne);
        checkList.add(bookTwo);
        checkList.add(bookThree);
        checkList.add(journalOne);
        checkList.add(journalTwo);
        checkList.add(journalThree);

        LinkedList booksList = new LinkedList<>();
        LinkedList journalList = new LinkedList<>();

        for (PrintedProduct linkedList : checkList) {
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
