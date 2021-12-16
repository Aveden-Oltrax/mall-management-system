/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;
import javax.swing.Timer;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
/**
 *
 * @author Admin
 */
public class Methods {

Timer t = null; int a = 0; int b = 0;
    public void load(final JProgressBar A, final JFrame B, final JFrame C)
    {
 t = new Timer(15,new ActionListener()
{
    public void actionPerformed(ActionEvent e)
 {
    a++;
    A.setValue(a);
     if(a==100)
    {
         t.stop();
         B.setVisible(true);
         C.dispose();
     }

  }
});
 t.start();
    }
}
