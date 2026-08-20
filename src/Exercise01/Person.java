package Exercise01;

public class Person {
    private String name;
    private boolean awake;
    private boolean eating;
    private boolean driving;

    public Person(String name) {
        this.name = name;
        this.awake = false;
        this.eating = false;
        this.driving = false;
    }

    public void wakeUp() {
        if (awake) {
            System.out.println(name + " está acordado(a)");
        } else {
            awake = true;
            System.out.println(name + " acordou");
        }
    }

    public void eat() {
        if (driving) {
            System.out.println(name + " não pode comer enquanto dirige!");
        } else if (!awake) {
            System.out.println(name + " não está acordado(a)!");
        } else if (eating) {
            System.out.println(name + " já está comendo");
        } else {
            eating = true;
            System.out.println(name + " começou a comer");
        }
    }

    public void stopEating() {
        if (!eating) {
            System.out.println(name + " não está comendo no momento");
        } else {
            eating = false;
            System.out.println(name + " parou de comer.");
        }
    }

    public void drive() {
        if (!awake) {
            System.out.println(name + " não está acordado(a)!");
        } else if (eating) {
            System.out.println(name + " não deve dirigir enquanto come.");
        } else if (driving) {
            System.out.println(name + " já está dirigindo!");
        } else {
            driving = true;
            System.out.println(name + " começou a dirigir.");
        }
    }

    public void stopDriving() {
        if (!driving) {
            System.out.println(name + " não está dirigindo.");
        } else {
            driving = false;
            System.out.println(name + " parou de dirigir.");
        }
    }

    public void sleep() {
        if (driving) {
            System.out.println(name + " não pode dormir enquanto dirige.");
        } else if (eating) {
            System.out.println(name + " não pode dormir enquanto come.");
        } else if (!awake) {
            System.out.println(name + " já está dormindo.");
        } else {
            awake = false;
            eating = false;
            driving = false;
            System.out.println(name + " foi dormir.");
        }
    }
}
