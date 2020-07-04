public class sumVistor extends Visitor{

    int tot;

    @Override
    void visit(Fork fork) {
        fork.r.accept(this);
        fork.l.accept(this);
    }

    @Override
    void visit(Leaf leaf) {
        tot += leaf.val;
    }
}
