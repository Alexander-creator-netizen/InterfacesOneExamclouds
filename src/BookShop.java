public class BookShop extends Building implements ShowInfo {

    @Override
    public String getText() {
        return "Journal list: ";
    }

    @Override
    public void visit(Person human) {
        System.out.println(human.getName() + "visited a bookstore.");
    }
}
