import java.util.ArrayList;
import java.util.List;

/**
 
 */
public class fShampoo{
    List<GroosryItems> Shampoo =new ArrayList<GroosryItems>();

    public fShampoo(){
        Shampoo.add(new DoveShampo());
        Shampoo.add(new SunSilkShampo());
    }
}
