import java.util.ArrayList;

public class BookShop implements ShowInfo {

    @Override
    public void showInfo(ArrayList arrayList) {
        System.out.println("Journals list:");
        for (Object arrayList1 : arrayList) {
            System.out.println(arrayList1.toString());
        }
    }
}
