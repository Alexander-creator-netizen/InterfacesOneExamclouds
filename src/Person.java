import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    private Set<PrintedProduct> printedProductSet = new HashSet<>();

    public Set<PrintedProduct> getPrintedProductSet() {
        return printedProductSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
