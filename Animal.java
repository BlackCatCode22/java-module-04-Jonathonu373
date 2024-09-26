import java.util.Date;

public class Animal {



    // Static int to keep track of the number of animals created
    static int numOfAnimals = 0;

    // Attributes (fields)
    private String sex; // Sex will be 'male' or 'female'
    private int age = 0; // Age in years
    private int weight = 0; // Weight in pounds
    private String animalID; // Unique ID for each animal
    private String animalName; // Name of the animal
    // origin zoo
    private String animalOrigin;
    // animal color
    private String getAnimalColor;
    // arrival Date
    private Date animalArrivalDate;


    // Constructor
    public Animal() {
        numOfAnimals++;
    // Create a constructor that accepts a name
    public Animal(String aName) {
        }
        this.animalName = aName;
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAnimalID() {
        return animalID;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Date getAnimalBirthdate() {return AnimalBirthdate;}
    public void setAnimalbirthdate(Date animalbirthdate) {}

    public String getGetAnimalColor() {return animalColor;}
    public void setGetAnimalColor(String animalColor) {this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setAnimalOrigin(String animalOrigin) {this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivalDate() {return animalArrivalDate;}
    public void setAnimalArrivalDate(Date animalArrivalDate) {this.animalArrivalDate = animalArrivalDate;}








}