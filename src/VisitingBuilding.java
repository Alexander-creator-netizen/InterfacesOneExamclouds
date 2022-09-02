import java.util.ArrayList;


public class VisitingBuilding {
    public static void main(String[] args) {
        Person visitorOne = new Person("Petr Semenovich ");
        Person visitorTwo = new Person("Semen Petrovich ");

        ArrayList <Person> people = new ArrayList<>();

        people.add(visitorOne);
        people.add(visitorTwo);

        Building libraryOne = new Library();
        Building libraryTwo = new Library();
        Building libraryThree = new Library();
        Building libraryFour = new Library();
        Building libraryFive = new Library();

        Building bookShopOne = new BookShop();
        Building bookShopTwo = new BookShop();
        Building bookShopThree = new BookShop();
        Building bookShopFour = new BookShop();
        Building bookShopFive = new BookShop();

        ArrayList <Building> buildings = new ArrayList<>();

        buildings.add(libraryOne);
        buildings.add(libraryTwo);
        buildings.add(libraryThree);
        buildings.add(libraryFour);
        buildings.add(libraryFive);
        buildings.add(bookShopOne);
        buildings.add(bookShopTwo);
        buildings.add(bookShopThree);
        buildings.add(bookShopFour);
        buildings.add(bookShopFive);

        PrintedProduct bookOne = new Books("Book: Harry Potter");
        PrintedProduct bookTwo = new Books("Book: The Master and Margarita");
        PrintedProduct bookThree = new Books("Book: War and peace");

        PrintedProduct journalOne = new Magazines("Journal: Fashion today");
        PrintedProduct journalTwo = new Magazines("Journal: A journey through the cosmic expanses");
        PrintedProduct journalThree = new Magazines("Journal: Crosswords");

        ArrayList <PrintedProduct> checkList = new ArrayList<>();

        checkList.add(bookOne);
        checkList.add(bookTwo);
        checkList.add(bookThree);
        checkList.add(journalOne);
        checkList.add(journalTwo);
        checkList.add(journalThree);

        for (Building building : buildings) {
                for (Person person : people) {
                    building.visit(person, checkList);
                }
            }
        }
    }
