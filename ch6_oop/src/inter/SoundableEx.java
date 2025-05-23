package inter;

interface Soundable {
    String sound();
}

class Cat implements Soundable {
    @Override
    public String sound() {
        return "냥";
    }

}

class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍";
    }

}

class SoundableEx {
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }

    static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}
