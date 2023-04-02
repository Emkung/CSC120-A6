import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building{
  private Hashtable<String, Boolean> collection;

    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      // System.out.println("You have built a library: 📖");
    }
    public void addTitle(String title){
      if (this.collection.containsKey(title)){
        throw new RuntimeException("Library already has this book.");
      } else{
      this.collection.put(title, true);
      }

    }
    public String removeTitle(String title){
      if (this.collection.containsKey(title)){
        this.collection.remove(title);
        return title;
      }else{
        throw new RuntimeException("No identifiable book to remove.");
      }

    } 
    public void checkOut(String title){
      if (this.collection.containsKey(title)){
        this.collection.replace(title, false);
      }else{
        throw new RuntimeException("No identifiable book to remove.");
      }
    }
    public void returnBook(String title){
      if (this.collection.containsKey(title)){
        this.collection.replace(title, true);
      }else{
        throw new RuntimeException("No identifiable book to remove.");
      }

    }
    public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
    return this.collection.containsKey(title); 
    }
    public boolean isAvailable(String title){// returns true if the title is currently available, false otherwise
      return this.collection.containsValue(true);
    }
    public void printCollection(){// prints out the entire collection in an easy-to-read way (including checkout status)
      System.out.println(collection.toString());
    }
  
    public static void main(String[] args) {
      Library neilsonLibrary = new Library("Neilson Library", "your mom", 5);
      neilsonLibrary.addTitle("The Road");
      neilsonLibrary.printCollection();
      neilsonLibrary.removeTitle("The Road");
      neilsonLibrary.printCollection();
      neilsonLibrary.addTitle("Ur Mom");
      neilsonLibrary.addTitle("Slay");
      neilsonLibrary.addTitle("How to be a Girlboss 101");
      neilsonLibrary.addTitle("How to not be an Absolute Useless Memeber of Society");
      neilsonLibrary.checkOut("Ur Mom");
      neilsonLibrary.printCollection();
      System.out.print(neilsonLibrary.containsTitle("Ur Mom"));
      
    }
  
  }