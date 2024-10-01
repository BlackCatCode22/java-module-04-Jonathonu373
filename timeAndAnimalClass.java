//J.U 10.1.24
// TodaysDate.java
import java.util.Date;
import java.text.SimpleDateFormat;


public class timeAndAnimalClass {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to dates and Animal Class!");

        // Create a Date object to represent the current ate
        Date today = new Date();

        // Define the desired date format
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatterYear = new SimpleDateFormat("yyyy");

        // Format the date and store it in a string
        String strTodaysDate = formatter.format(today);
        String strTodaysYear = formatterYear.format(today);

        // Output the result
        System.out.println("Today's date in the format yyyy-MM-dd: " + strTodaysDate);

        // Calculate birthdates for the following hyenas
        // 1) 4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia
        // 2) 12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia

        // Write Java code to calculate birthdates for the animal's and then create a method that returns a string
        // for the animal's birthdate

        // input: "4 year old female hyena, born in spring"
        // Processing: find the age and birth season
        // and then use decision control structures to calculate the date.

        // parse the string
        String strStarting = "12 year old male hyena, born in fall, brown color, 150 pounds, from Friguia Park, Tunisia";
        // spit the string on ", "
        System.out.println();
        String[] arrayOfStrPartsOnComma = strStarting.split(", ");
        // output the array elements
        // this is a for each loop - very hand when examining array elements.
        int elementNum = 0;
        for (String thePart : arrayOfStrPartsOnComma) {
            System.out.println("Element" + elementNum +  "of arrayOfStrPartsOnComma is: " + thePart);
            elementNum++;
        }
        System.out.println();

        for (String thePart : arrayOfStrPartsOnComma) {
            System.out.println("element of the string is: " + thePart);
        }

        String[] arrayOfStringPartsOnSpace02 = arrayOfStrPartsOnComma[0].split(" ");
        elementNum = 0;
        for (String thePart : arrayOfStringPartsOnSpace02) {
            System.out.println("Element " + elementNum +  "the string is: " + thePart);
            elementNum++;
        }

        System.out.println();


        String[] arrayOfStringPartsOnSpace = arrayOfStrPartsOnComma[1].split(" ");
        elementNum = 0;
        for (String thePart : arrayOfStringPartsOnSpace02) {
            System.out.println("Element" + elementNum +  "of the string is: " + thePart);
            elementNum++;
        }

        System.out.println();


        String ageInYears = arrayOfStringPartsOnSpace[0];
        String animalBirthSeason = arrayOfStringPartsOnSpace02[2];
        System.out.println("The age in years of the animal is: " + ageInYears);
        System.out.println("The season of birth of the animal is: " + animalBirthSeason);


        String animalBirthdate = "";
        int todaysYear = Integer.parseInt(strTodaysYear);
        int animalBirthYear = todaysYear - Integer.parseInt(ageInYears);


        if (animalBirthSeason.contains("spring")) {
            animalBirthdate = animalBirthYear + "03-21";

        if (animalBirthSeason.contains("fall")) {
            animalBirthdate = animalBirthYear + "09-21";
        }
        if (animalBirthSeason.contains("winter")) {
            animalBirthdate = animalBirthYear + "12-21";
        }
        if (animalBirthSeason.contains("summer")) {
            animalBirthdate = animalBirthYear + "06-21";


            System.out.println("\n animalBirthdate = " + animalBirthdate);
        }





    }
}