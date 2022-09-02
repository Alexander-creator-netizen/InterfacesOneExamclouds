import java.util.ArrayList;
import java.util.Random;

abstract class Building implements Visitable {

    private int floors;

    @Override
    public void visit(Person human, ArrayList arrayList) {
        System.out.println(human.getName() + "visited the building.");
        human.getPrintedProductSet().addAll(getRandom(arrayList));
        System.out.println(human.getPrintedProductSet());
        System.out.println();
    }

    public ArrayList getRandom(ArrayList arrayList) {
        Random random = new Random();
        ArrayList printedProduct = new ArrayList();
        printedProduct.add(arrayList.get(random.nextInt(arrayList.size())));
        return printedProduct;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
