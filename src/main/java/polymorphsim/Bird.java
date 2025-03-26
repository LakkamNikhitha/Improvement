package polymorphsim;
class Bird {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane {
    void fly() {
        System.out.println("Airplane is flying.");
    }
}

class Main {
    public static void makeItFly(Object obj) {
        if (obj instanceof Bird) {
            ((Bird) obj).fly();
        } else if (obj instanceof Airplane) {
            ((Airplane) obj).fly();
        }
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        makeItFly(bird);
        makeItFly(airplane);
    }
}
