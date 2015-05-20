package ee;
/**
 *
 * @author hrishioa
 */
public class MType 
{
    int TID;
    int energy_use;
    int max_inp;
    int time;
    
    public MType(int inTID, int inenergy, int inmaxinp, int intime)
    {
        TID = inTID;
        energy_use = inenergy;
        max_inp = inmaxinp;
        time = intime;
    }
    
    MOut process(int units, double efficiency)
    {
        return null;
    }
}
