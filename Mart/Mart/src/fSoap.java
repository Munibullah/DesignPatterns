import java.util.ArrayList;
import java.util.List;

/**
 
 */
public class fSoap{
    List<GroosryItems> Soap = new ArrayList<GroosryItems>();

    public fSoap() {
        Soap.add(new DoveSoap());
        Soap.add(new LuxSoap());
    }
}

