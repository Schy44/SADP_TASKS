//Interface Segregation
interface Worker {
    void work();
}

interface Eater {
    void eat();
}

class BasicWorker implements Worker {
    @Override
    public void work() {
        System.out.println("BasicWorker is working");
    }
}

class LunchBreakEater implements Eater {
    @Override
    public void eat() {
        System.out.println("LunchBreakEater is eating");
    }
}

class WorkerAndEater implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("WorkerAndEater is working");
    }

    @Override
    public void eat() {
        System.out.println("WorkerAndEater is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Worker basicWorker = new BasicWorker();
        Eater lunchBreakEater = new LunchBreakEater();
        WorkerAndEater workerAndEater = new WorkerAndEater();

        basicWorker.work();
        lunchBreakEater.eat();
        workerAndEater.work();
        workerAndEater.eat();
    }
}
