public class VisitingBuilding {
    public static void main(String[] args) {
        Person visitorOne = new Person("Petr Semenovich ");
        Person visitorTwo = new Person("Semen Petrovich ");
        Library library = new Library();
        BookShop bookShop = new BookShop();

        visitorOne.visit(visitorOne.toString(), library);
        visitorOne.visit(visitorOne.toString(), bookShop);
        System.out.println();
        visitorOne.visit(visitorTwo.toString(), library);
        visitorOne.visit(visitorTwo.toString(), bookShop);


    }
}
