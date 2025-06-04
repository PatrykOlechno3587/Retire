import javax.swing.*;
import java.awt.*;
import java.util.ListResourceBundle;

public class RetireResources extends ListResourceBundle {




    private static final Object[][] contents = {
             // BEGIN LOCALIZE
             { "colorPre", Color.blue }, { "colorGain", Color.white }, { "colorLoss", Color.red }
             // END LOCALIZE
             };

        public Object[][] getContents()
 {
         return contents;
         }
}
