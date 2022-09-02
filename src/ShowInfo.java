import java.util.List;

public interface ShowInfo {

    default void showInfo(List <PrintedProduct> arrayList) {

        System.out.println(getText());

        for (PrintedProduct arrayListOne : arrayList) {
            System.out.println(arrayListOne.toString());
        }
    }

    String getText();
}
