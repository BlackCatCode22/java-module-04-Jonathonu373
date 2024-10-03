package dennis.zoo.com;

import java.util.Date;

public class Animal {
    // Create a static int that keeps track of the number of animals created.
    static int numOfAnimals = 0;

    // Create a constructor for our new Animal object
    public Animal() {
        numOfAnimals++;
    }

    // Create a constructor that will set all fields as arguments.
    public Animal (String sex, int age, int weight, String animalName,
                 String animalID, String animalBirthdate, String animalColor, String animalOrigin) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
    }



    // Create all attributes (fields) for our midterm program
    // Sex will be 'male' or 'female'
    String sex;
    // age will be in years
    private int age;
    // weight will be in pounds
    private int weight;
    // name will be a string;
    String animalName;
    // animalID
    private String animalID;
    // animalBirthdate is going to be a string in class
    private String animalBirthdate;
    // animalColor is a string
    private String animalColor;
    // origin will be a string like: "from Frigula Park, Tunisia"
    private String animalOrigin;




    // Create getters and setters
    public String getAnimalName() {
        return animalName;
        }
    public String getAnimalOrigin() {
            return animalOrigin;
        }

    public String getAnimalBirthdate() {
        return animalBirthdate;
    }

    public String getAnimalColor(){
        return animalColor;
    }






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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
