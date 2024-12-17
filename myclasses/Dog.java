package myclasses; //MAKE THE PACKAGE LOL
public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

  //Construtor

  public Dog()
  {
    this("shiba", "Johnny", "green", 100000); //If you use "this", it calls a constructor method that currently exists with the current inputs given, you are calling the dog constructor that takes a string, string, string, double
  }

  public Dog(String theBreed, String theName, String theColor, double theWeight)
  {
    breed = theBreed;
    name = theName;
    color = theColor;
    setWeight(theWeight); // You can call in a function to construct an object with fields
  }
  // Make setters
  public void setBreed(String iBreed)
  {
    this.breed = breed; //set the object's breed to the input breed, the "this" makes it reference itself
  }

  public void setWeight (double theWeight)
  {
    if (theWeight < 0)
    System.out.println("Please enter a valid weight.");
    else
    {
     weight = theWeight;     
    }
  }

  public void setName (String theName)
  {
    name = theName; //You can also do name = theName
  }

  public void setColor (String theColor)
  {
    color = theColor;
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }

  public double getWeight()
  {
    return weight;
  }

  public String getName()
  {
    return name;
  }
  public String getColor()
  {
    return color;
  }
}
