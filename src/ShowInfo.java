import java.util.List;

public interface ShowInfo {

    default void showInfo(List arrayList) {

        System.out.println(getText());

        for (Object arrayListOne : arrayList) {
            System.out.println(arrayListOne.toString());
        }
    }

    String getText();
}
