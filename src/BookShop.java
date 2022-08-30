import java.util.List;

public class BookShop implements ShowInfo {

    @Override
    public void showInfo(List arrayList) {
        System.out.println("Journals list:");
        for (Object arrayList1 : arrayList) {
            System.out.println(arrayList1.toString());
        }
    }
}
