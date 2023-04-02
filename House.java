/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  /**
   * constructor
   * @param name- name of the house
   * @param address- address of the house
   * @param nFloors- amount of floors of the house
   * @param hasDiningRoom- boolean of whether it has dining room
   */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    // System.out.println("You have built a house: 🏠");
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

    /** Accessor for hasDiningRoom 
     * @return boolean of whether there is a dining hall
    */
    public boolean hasDiningRoom() {
      return this.hasDiningRoom;
    }
  
    /** Accessor for number of residents 
     * @return the amount of resident in the house
    */
    public int nResidents() {
      return this.residents.size();
    }
    /**
     * a method that adds resident in to the house 
     * @param name- name of the resident
     */
    public void moveIn(String name) {
      // check if this.residents contains name
      if (this.residents.contains(name)) {
        //   if so: throw and exception
        throw new RuntimeException(name + " is already a resident of " + this.getName());
      }
      // if we're good to go, add to roster
      this.residents.add(name);
      System.out.println(name + " has just moved into " + this.getName() + "! Go say hello :-)");
    }
    /**
     * a method that gives the description of the house 
     */
    public String toString() {
      String description = super.toString();
      description += " There are currently " + this.nResidents() + " people living in this house.";
      description += " This house ";
      if (this.hasDiningRoom) {
        description += "has";
      } else {
        description += "does not have";
      }
      description += " an active dining room.";
      return description;
    }
  
    // public static void main(String[] args) {
    //   House morrow = new House("Morrow", "The Quad", 4, false);
    //   System.out.println(morrow);
    //   morrow.moveIn("Jordan");
    //   morrow.moveIn("Jordan");
    //   System.out.println(morrow);
    //   House king = new House("King", "The Quad", 3, true);
    //   System.out.println(king);
    // }
  
  }
