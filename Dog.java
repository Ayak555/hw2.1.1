final class Dog extends Pet {

    private String name;
    private String breed;
    private String commands;
    private ColorType colorType;
    private Shelter shelter;

    public Dog() {
    }


    public Dog(String name, String breed, ColorType colorType, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.colorType = colorType;
        this.shelter = shelter;
    }


    public Dog(String name, String breed, ColorType colorType, Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.colorType = colorType;
        this.shelter = shelter;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }


    public static void makeVoice(String voice) {
        System.out.println("Гав-гав");
    }

    public static void makeVoice(int number) {
        System.out.println("2");
    }

    public static void makeVoice(String voice, int number) {
        System.out.println("Гав-гав-гав " + 3);
    }


    public final String getInfo() {
        return super.getInfo() + " Dog's name: " + getName() +
                " Breed: " + getBreed() + " Commands: " + getCommands();
    }

}
