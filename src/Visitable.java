public interface Visitable {

    default void visit(String human, Object build) {
        System.out.println(human + infoBuilding(build));
    }

    String infoBuilding (Object object);
}
