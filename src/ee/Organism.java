package ee;

/**
 *
 * @author hrishioa
 */

//import java.util.Random;

public class Organism
{
    int OID;
    MFit infitness;
    
    public Organism()
    {
        /*
         * Here, create a new organism without a seed. i.e. pull machines from the database
         * and create one from random data.
         */
    }
    
    public Organism(Organism seed)
    {
        /*
         * Here, there is a seed given. 
         * Therefore, mutate the seed to create the new organism.
         */
    }
    
    Organism reproduce(Organism mate)
    {
        return null;
    }
    
    MFit fitness(int units)
    {
        if(infitness!=null) return infitness;
        return null;
    }
}
