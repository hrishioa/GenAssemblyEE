package ee;

/**
 *This class is used to generate test data for the program to use later.
 * @author hrishioa
 */

import java.util.Random;

public class Generate 
{
    public static Machine[] generate(MType[] types)
    {
        System.out.println("Conjuring machines: ");
        Random r = new Random();
        int arrsize = Math.abs(r.nextInt() % 100)+1;
        Machine[] machines = new Machine[arrsize];
                
        if(types==null)
        {
            types = new MType[Math.abs(r.nextInt()%20)+1];
            for(int i=0;i<types.length;i++)
                types[i] = new MType(i,r.nextInt(),r.nextInt(),r.nextInt());
        }
        
        for(int i=0;i<machines.length;i++)
        {
            machines[i] = new Machine(i,types[Math.abs(r.nextInt() % types.length)],(r.nextDouble()%1));
            System.out.println(machines[i]);
        }
        
        return machines;
    }
}
