//faceade pattern

class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class AC {
    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

class TV {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

// Facade
class HomeAutomationFacade {
    private Light light;
    private AC ac;
    private TV tv;

    public HomeAutomationFacade() {
        this.light = new Light();
        this.ac = new AC();
        this.tv = new TV();
    }

    public void arriveHome() {
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
    }

    public void leaveHome() {
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}

public class Main {
    public static void main(String[] args) {
        HomeAutomationFacade homeAutomation = new HomeAutomationFacade();

        System.out.println("Arriving home:");
        homeAutomation.arriveHome();

        System.out.println("\nLeaving home:");
        homeAutomation.leaveHome();
    }
}
