import java.util.ArrayList;

public class VisitingBuilding {
    public static void main(String[] args) {

        ArrayList <Person> people = new ArrayList<>();

        people.add(new Person("Petr Semenovich "));
        people.add(new Person("Semen Petrovich "));

        ArrayList <Building> buildings = new ArrayList<>();

        buildings.add(new Library());
        buildings.add(new Library());
        buildings.add(new Library());
        buildings.add(new Library());
        buildings.add(new Library());

        buildings.add(new BookShop());
        buildings.add(new BookShop());
        buildings.add(new BookShop());
        buildings.add(new BookShop());
        buildings.add(new BookShop());

        ArrayList <PrintedProduct> checkList = new ArrayList<>();

        checkList.add(new Books("Book: 1"));
        checkList.add(new Books("Book: 2"));
        checkList.add(new Books("Book: 3"));
        checkList.add(new Magazines("Journal: 1"));
        checkList.add(new Magazines("Journal: 2"));
        checkList.add(new Magazines("Journal: 3"));

        for (Building building : buildings) {
                for (Person person : people) {
                    building.visit(person, checkList);
                }
            }
        }
    }
