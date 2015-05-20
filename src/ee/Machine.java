package ee;

/**
 *
 * @author hrishioa
 */
public class Machine implements Comparable
{
    int MID;
    MType type;
    double efficiency;

    public Machine(int inMID, MType intype, double inefficiency)
    {
        MID = inMID;
        type = intype;
        efficiency = inefficiency;
    }
    
    MOut process(int units)
    {
        return null;
    }
    
    @Override public String toString()
    {
        return ("Machine "+MID+": Type "+type.TID+" - Efficiency: "+efficiency)+"\n";
    }
    
    @Override public int compareTo(Object ol)
    {
        if(this.type.TID == ((Machine)ol).type.TID)
        {
            if(this.efficiency == ((Machine)ol).efficiency) return 0;
            else if(this.efficiency > ((Machine)ol).efficiency) return 1;
            else return -1;
        }
        else if(this.type.TID < ((Machine)ol).type.TID) return -1;
        else return 1;
    }
}
