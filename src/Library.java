public class Library extends Building implements ShowInfo {

    @Override
    public String getText() {
        return "Book list: ";
    }

    @Override
    public void visit(Person human) {
        System.out.println(human.getName() + "visited the library.");
    }
}

