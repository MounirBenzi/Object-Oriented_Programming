public class Fork extends Tree {
    Tree l;
    Tree r;

    Fork(Tree l, Tree r){
        this.l = l;
        this.r = r;
    }

    @Override
    void accept(Visitor v){
        v.visit(this);
    }
}
