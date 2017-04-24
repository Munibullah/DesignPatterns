import java.util.ArrayList;
import java.util.List;

/**
 
 */
public class fSpice{
    List<GroosryItems> Spice = new ArrayList<GroosryItems>();

    public fSpice(){
        Spice.add(new CurrySpice());
        Spice.add(new BiryaniSpice());
        Spice.add(new AcharGhostSpice());
        Spice.add(new TikkaSpice());
        Spice.add(new PulawoSpice());
        Spice.add(new KababSpice());
    }
}
