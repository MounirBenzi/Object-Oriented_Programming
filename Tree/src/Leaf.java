public class Leaf extends  Tree {
    int val;

    Leaf(int val){
        this.val = val;
    }

    @Override
    void accept(Visitor v){
        v.visit(this);
    }
}
