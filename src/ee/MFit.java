package ee;

/**
 *
 * @author hrishioa
 */
public class MFit 
{
    long throughput;
    double energy_use;
    int fat;
    int length;
    double completion;
    
    public MFit(long inthroughp, double inenergy, int infat, int inlength, double incompletion)
    {
        throughput = inthroughp;
        energy_use = inenergy;
        fat = infat;
        length = inlength;
        completion = incompletion;
    }
}
