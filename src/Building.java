import java.util.ArrayList;
import java.util.Random;

abstract class Building implements Visitable {

    private int floors;

    @Override
    public void visit(Person human, ArrayList <PrintedProduct> arrayList) {
        System.out.println(human.getName() + "visited the building.");
        human.getPrintedProductSet().add(getRandom(arrayList));
        System.out.println(human.getPrintedProductSet());
        System.out.println();
    }

    public PrintedProduct getRandom(ArrayList <PrintedProduct> arrayList) {
        Random random = new Random();
        PrintedProduct printedProduct = arrayList.get(random.nextInt(arrayList.size()));
        return printedProduct;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
