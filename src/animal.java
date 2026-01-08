public class animal {
    private String name;
    private int age;
    private String sound;

    public animal(String name, int age, String sound) {
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public static void commonInfo() {
        System.out.println("All animals are kind.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound: " + sound);
    }

    public String getSound() {
        return name + " says: " + sound;
    }

    public String getAge() {
        return name + " is " + age + " years old.";
    }

    public String getName() {
        return "My name is " + name;
    }

    public static class Cow extends animal {
        public Cow(String name, int age, String sound) {
            super(name, age, sound);
        }
    }
}