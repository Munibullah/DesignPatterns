import java.util.ArrayList;
import java.util.List;

/**

 */
public class fDetergen {
    List<GroosryItems> Detergen = new ArrayList<GroosryItems>();

    public fDetergen() {
        Detergen.add(new HarpicDetergen());
        Detergen.add(new SurfExcelDetergen());
        Detergen.add(new DetolDetergen());

    }
}
