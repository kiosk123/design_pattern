package main;

public abstract class Calculator {

    private Calculator nextCaculator;

    public void setNextCalculator(Calculator nextCaculator) {
        this.nextCaculator = nextCaculator;
    }

    public boolean process(Request request) {
        if (operator(request)) {
            return true;
        } else {
            return nextCaculator.operator(request);
        }

        // if (preCaculator != null)
        // if(preCaculator.process(request))
        // return true;
        //
        // return operator(request);
    }

    abstract protected boolean operator(Request request);
}
