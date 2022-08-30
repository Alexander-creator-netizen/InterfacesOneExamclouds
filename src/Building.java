abstract class Building implements Visitable {

    private int floors;

    @Override
    public void visit(Person human) {

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
