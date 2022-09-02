import java.util.ArrayList;

public class WastePaperCollection {

    static Library library = new Library();
    static BookShop bookShop = new BookShop();

    public static void main(String[] args) {

        PrintedProduct bookOne = new Books("Harry Potter");
        PrintedProduct bookTwo = new Books("The Master and Margarita");
        PrintedProduct bookThree = new Books("War and peace");

        PrintedProduct journalOne = new Magazines("Fashion today");
        PrintedProduct journalTwo = new Magazines("A journey through the cosmic expanses");
        PrintedProduct journalThree = new Magazines("Crosswords");

        ArrayList <PrintedProduct> checkList = new ArrayList<>();

        checkList.add(bookOne);
        checkList.add(bookTwo);
        checkList.add(bookThree);
        checkList.add(journalOne);
        checkList.add(journalTwo);
        checkList.add(journalThree);

        ArrayList booksList = new ArrayList();
        ArrayList journalList = new ArrayList();

        for (PrintedProduct printedProduct : checkList) {
            if (printedProduct instanceof Books) {
                booksList.add(printedProduct);
            } else {
                journalList.add(printedProduct);
            }

        }




        library.showInfo(booksList);
        System.out.println();
        bookShop.showInfo(journalList);
    }
}
