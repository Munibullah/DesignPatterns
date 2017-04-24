import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.ArrayList;
import java.util.List;

/**
 
 */
public class fSugar{
     List<GroosryItems> Sugar = new ArrayList<GroosryItems>();

    public fSugar(){
        Sugar.add(new WhiteSugar());
        Sugar.add(new BrownSugar());
    }
}

