import java.util.ArrayList;
import java.util.LinkedList;

public class BookShop implements ShowInfo {

    @Override
    public void showInfo(LinkedList arrayList) {
        System.out.println("Journals list:");
        for (Object arrayList1 : arrayList) {
            System.out.println(arrayList1.toString());
        }
    }
}
