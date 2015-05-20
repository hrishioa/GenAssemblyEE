package ee;

/*
 * Major imports: Register them and monitor them so performance high can be achieved, if possible.
 * util.Scanner - Data input - Necessary?
 */

import java.util.Arrays;
import java.util.Scanner;

/*
 *This is the main class. It can implement the fitness functions, and the other necessary GA functions,
 * but for the sake of modularity it is preferred that they are implemented in another class.
 * 
 * Future Optimizations:
 *  Modified creation methods - better ways of ensuring that surviving organisms are produced from seedless creation
 *  Fitness Algorithm modification - either make it faster or better at choosing the surviving populace
 *  Search and sort algorithms - Use simple ones like bubble sort this time followed by advanced ones
 *  Multi-threading - the fitness computations can be made to use multiple processors
 *  Database type - Change the type of the database to improve data retention and access speed
 */

public class EE {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Test Code
        System.out.println("Assembly Line Management System");
        Machine[] machines = Generate.generate(null);
        Arrays.sort(machines);
        System.out.println(Arrays.toString(machines));
        /*
         * Pseudocode to be implemented
         * foreach vector of organisms
         *      organism[i] = new organism();
         * 
         * foreach y organisms added to vector
         *      if(perfect_organism) then
         *          organism[i] = new organism(perfect_organism);
         * 
         * foreach organism in database
         *      int discard = organism.fitness();
         * 
         * --SORT the database based on organism fitness --
         */
    }
}
