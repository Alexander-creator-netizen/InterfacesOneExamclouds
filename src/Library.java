import java.util.ArrayList;

public class Library implements ShowInfo {

    @Override
    public void showInfo(ArrayList arrayList) {
        System.out.println("Books list:");
        for (Object arrayList1 : arrayList) {
            System.out.println(arrayList1.toString());
        }
        System.out.println();
    }
}
