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
    breed = "shiba";
    name = "Johnny";
    color = "green";
    weight = 100000;
  }

  public Dog(String theBreed, String theName, String theColor, double theWeight)
  {
    breed = theBreed;
    name = theName;
    color = theColor;
    if (weight < 0)
    {
      weight = 0;
    }
    else{
      weight = theWeight;
    }
  }
  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
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
    name = theName;
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
