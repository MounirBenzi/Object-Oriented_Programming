public class VisitorWorld {
    public static void main(String[] args){
        Tree l1 = new Leaf(1);
        Tree l2 = new Leaf(2);
        Tree l3 = new Leaf(3);
        Tree n12 = new Fork(l1, l2);
        Tree tree = new Fork(n12, l3);
        sumVistor sumV = new sumVistor();
        tree.accept(sumV);
        System.out.println("Total = " + sumV.tot);
    }
}
