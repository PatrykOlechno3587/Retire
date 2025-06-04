import java.awt.*;
import java.util.ListResourceBundle;

public class RetireResources_zh extends ListResourceBundle {

    private static final Object[][] contents = {
             // BEGIN LOCALIZE
             { "colorPre", Color.red }, { "colorGain", Color.blue }, { "colorLoss", Color.yellow }
             // END LOCALIZE
             };

         public Object[][] getContents()
 {
         return contents;
         }
}
