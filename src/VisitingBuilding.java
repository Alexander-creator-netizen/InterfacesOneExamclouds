public class VisitingBuilding {
    public static void main(String[] args) {
        Person visitorOne = new Person("Petr Semenovich ");
        Person visitorTwo = new Person("Semen Petrovich ");
        Library library = new Library();
        BookShop bookShop = new BookShop();

        library.visit(visitorOne);
        bookShop.visit(visitorOne);
        System.out.println();
        library.visit(visitorTwo);
        bookShop.visit(visitorTwo);

    }
}
