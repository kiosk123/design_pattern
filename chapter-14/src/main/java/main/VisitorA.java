package main;

public class VisitorA implements Visitor {
   
    private int ageSum;
    public VisitorA() {
        ageSum = 0;
    }
    public void visit(Visitable visitable) {
        if (visitable instanceof VisitableA) {
            ageSum += ((VisitableA)visitable).getAge();
        } else {
            //TODO
        }
    }
    public int getAgeSum() {
        return ageSum;
    }

}
