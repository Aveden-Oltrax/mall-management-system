

package shopping;




public class Loading extends javax.swing.JFrame {


    java.util.Date dt1;
    /** Creates new form backstore */
    public Loading() {
        initComponents();
        try
        {
        }
        catch(Exception e)
        {
         System.out.println(e.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invalid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Shopping Mall System");
        setBounds(new java.awt.Rectangle(260, 150, 0, 0));
        setMinimumSize(new java.awt.Dimension(650, 370));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        invalid.setFont(new java.awt.Font("Calibri", 0, 16));
        invalid.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(invalid);
        invalid.setBounds(70, 310, 390, 22);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 15));
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 160, 200, 20);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 15));
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(80, 240, 200, 20);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(243, 100, 44));
        jProgressBar1.setMinimum(50);
        jProgressBar1.setMinimumSize(new java.awt.Dimension(10, 16));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(146, 16));
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(0, 350, 650, 5);

        jLabel2.setFont(new java.awt.Font("Cardboard-Cutout", 1, 70));
        jLabel2.setForeground(new java.awt.Color(63, 29, 90));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<HTML> <CENTER> INFORMATICS PRACTICES <BR>  PROJECT </CENTER>  </HTML>");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 650, 150);

        jLabel3.setFont(new java.awt.Font("Im Wunderland", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("2018-19");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 180, 650, 30);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 100, 44));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SHOPPING MALL MANAGEMENT SYSTEM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 250, 650, 80);

        jLabel1.setBackground(new java.awt.Color(247, 240, 251));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 370);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-651)/2, (screenSize.height-371)/2, 651, 371);
    }// </editor-fold>//GEN-END:initComponents
Methods a= new Methods();
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
a.load(jProgressBar1, new Login_or_Signup(), this);
    }//GEN-LAST:event_formWindowActivated

   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel invalid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables

}
