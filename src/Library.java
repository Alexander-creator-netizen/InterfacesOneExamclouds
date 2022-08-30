import java.util.List;

public class Library implements ShowInfo {

    @Override
    public void showInfo(List arrayList) {
        System.out.println("Books list:");
        for (Object arrayList1 : arrayList) {
            System.out.println(arrayList1.toString());
        }
        System.out.println();
    }
}
