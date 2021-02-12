import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args){
        RepairSchedule r = new RepairSchedule(6);
        System.out.println(r.addRepair(3, 4));
        System.out.println(r.addRepair(0, 1));
        System.out.println(r.addRepair(0, 2));
        System.out.println(r.addRepair(2, 4));
        System.out.println(r.availableMechanics());
    }
}


class CarRepair
{
    private int mechanicNum;
    private int bayNum;

    public CarRepair(int m, int b)
    {
        mechanicNum = m;
        bayNum = b;
    }

    public int getMechanicNum()
    { return mechanicNum; }

    public int getBayNum()
    { return bayNum; }


    // There may be other instance variables, constructors, and

}

class RepairSchedule
{
    /** Each element represents a repair by an individual
     mechanic in a bay. */
    private ArrayList<CarRepair> schedule;

    /** Number of mechanics available in this schedule. */
    private int numberOfMechanics;

    /** Constructs a RepairSchedule object.
     * Precondition: n >= 0
     */
    public RepairSchedule(int n)
    {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }

    /** Returns an ArrayList containing the mechanic identifiers
     of all available mechanics,
     * as described in part (b).
     */
    public ArrayList<Integer> availableMechanics()
    {
        ArrayList<Integer> availableMechanics = new ArrayList<>();

        for (int i = 0; i <= numberOfMechanics; i++) {
            availableMechanics.add(i);
        }

        for (CarRepair carRepair : schedule) {
            int mechanicNum = carRepair.getMechanicNum();
            int indexOfMech = availableMechanics.indexOf(mechanicNum);
            if (availableMechanics.contains(mechanicNum)){
                availableMechanics.remove(indexOfMech);
            }
        }

        return availableMechanics;
    }

    /** Removes an element from schedule when a repair is
     complete. */
    public void carOut(int b)
    {
        /* implementation not shown */
    }

    public boolean addRepair(int m, int b){
        boolean inUse = false;

        for (CarRepair carRepair : schedule) {
            int mechNum = carRepair.getMechanicNum();
            int bayNum = carRepair.getBayNum();

            if (mechNum == m || bayNum == b){
                inUse = true;
            }
        }
        if (!inUse){
            CarRepair carRepair = new CarRepair(m,b);
            schedule.add(carRepair);
            return true;
        }
        return false;
    }
}