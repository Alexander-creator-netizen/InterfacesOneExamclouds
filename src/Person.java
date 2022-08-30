public class Person implements Visitable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String infoBuilding(Object object) {
        if (object instanceof Library) {
            return "visited the library.";
        } else if (object instanceof BookShop) {
            return "visited a bookstore.";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
