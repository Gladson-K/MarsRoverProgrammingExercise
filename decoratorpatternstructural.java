interface Computation {
    void perform();
}

class BasicComputation implements Computation {
    @Override
    public void perform() {
        System.out.println("Performing basic computation");
    }
}

class LogDecorator implements Computation {
    private Computation computation;

    public LogDecorator(Computation computation) {
        this.computation = computation;
    }

    @Override
    public void perform() {
        System.out.println("Log: Before function execution");
        computation.perform();
        System.out.println("Log: After function execution");
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Computation basicComputation = new BasicComputation();
        Computation decoratedComputation = new LogDecorator(basicComputation);
        decoratedComputation.perform();
    }
}
