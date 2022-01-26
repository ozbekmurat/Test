package Second;

interface running {
    public void run();
}

interface sleeping {
    public void sleep();
}

public abstract class Animal implements running, sleeping {
    public int eyeCount;

    public abstract void sound();

    public static void eat() {
        System.out.println("eaten!");
    }

    public void run() {
        System.out.println("Run");
    }
}

class Lion extends Animal {

    public Lion() {
        eyeCount = 2;
    }

    public void sound() {
        // TODO Auto-generated method stub
        System.out.println("Roaarr!");
    }

    public void sleep() {
        System.out.println("Lion Slept!");
    }

}

class Spider extends Animal {

    public Spider() {
        eyeCount = 12;
    }

    public void sound() {
        // TODO Auto-generated method stub
        System.out.println("No Sound!");
    }

    public void sleep() {
        System.out.println("Spider Slept!");
    }

}








