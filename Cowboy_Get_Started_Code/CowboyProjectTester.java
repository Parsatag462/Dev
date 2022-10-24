import java.util.ArrayList;

public class CowboyProjectTester {


    public static void main(String[] args) {
        ArrayList<Human> human = new ArrayList<>();
        ArrayList<Building> building = new ArrayList<>();
        ArrayList<Animal> animal = new ArrayList<>();
        
        //add humans to ArrayList h
        CowBoy h1 = new CowBoy("Cody", 176.5);
        CowBoy h2 = new CowBoy("Dave", 145.7);
        human.add(h1);
        human.add(h2);

        OutLaw h3 = new OutLaw("Cole", 123.45);
        human.add(h3);
        OutLaw h4 = new OutLaw("Darren", 420.69);
        human.add(h4);
        OutLaw h5 = new OutLaw("Fred", 150.0);
        human.add(h5);

        Sheriff h6 = new Sheriff("Buddy", 165.3);
        human.add(h6);


        //print all Humans using a for loop
        for (int i=0; i<human.size();i++)
            System.out.println(human.get(i));

        
        //print all Humans using a for:each loop
        for (Human h: human)
            System.out.println(h);

        //add Buildings to ArrayList b

        Barn b1 = new Barn(70, 70, "red");
        House b2 = new House(100, 50, "Brown");
        Garage b3 = new Garage(200, 80, "grey");
        building.add(b1);
        building.add(b2);
        building.add(b3);

        //add humans to ArrayList h
        for (int i=0; i<building.size();i++)
            System.out.println(building.get(i));

        //print all Humans using a for loop
        for (Building h: building)
            System.out.println(h);
        
        //print all Humans using a for:each loop
        Cat a1 = new Cat("Whiskers", 20.6);
        BeefCow a2 = new BeefCow("Bacon", 78.6);
        DairyCow a3 = new DairyCow("Milky", 142.8);
        Horse a4 = new Horse("Wind", 178.0);

        animal.add(a1);
        animal.add(a2);
        animal.add(a3);
        animal.add(a4);

        for (int i=0; i<animal.size();i++)
            System.out.println(animal.get(i));

        //print all Humans using a for loop
        for (Animal h: animal)
            System.out.println(h);

        
    } 
}
