import java.util.ArrayList;
import java.util.List;

/**
 
 */
public class fHandWash{
    List<GroosryItems> HandWash = new ArrayList<GroosryItems>();

    public fHandWash() {
        HandWash.add(new PoundsHandwash());
        HandWash.add(new DetolHandWash());
    }
}
