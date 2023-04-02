import javax.management.RuntimeErrorException;

/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces =+ nCoffeeOunces;
        this.nSugarPackets =+ nSugarPackets;
        this.nCreams =+ nCreams;
        this.nCups =+ nCups;
    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (this.nCoffeeOunces < 1){
            this.restock(size, nSugarPackets, nCreams, nCups);
        }if (this.nSugarPackets < 1){
            this.restock(size, nSugarPackets, nCreams, nCups);
        }if (this.nCreams < 1){
            this.restock(size, nSugarPackets, nCreams, nCups);
        }else{
            this.nCoffeeOunces =- size;
            this.nSugarPackets =- nSugarPackets;
            this.nCreams =- nCreams;
            this.nCups =- 1;
        }
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Boing Cafe", "ur mom", 4, 20, 20, 20, 20);
        myCafe.sellCoffee(20, 20, 20);
    }
    
}
