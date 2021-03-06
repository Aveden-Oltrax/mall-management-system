

package shopping;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Make_Order extends javax.swing.JFrame {

    /** Creates new form backstore */
    public Make_Order() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        tfbill = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tfname = new javax.swing.JTextField();
        tfprice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tfqty = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        tfman = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tadesc = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jComboBox1 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Make Order - Shopping Mall System");
        setBounds(new java.awt.Rectangle(87, 5, 0, 0));
        setMinimumSize(new java.awt.Dimension(850, 750));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jList2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Cart", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        jList2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        jList2.setForeground(new java.awt.Color(0, 0, 102));
        jList2.setModel(new DefaultListModel());
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jList2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(560, 200, 258, 170);

        tfbill.setEditable(false);
        tfbill.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        tfbill.setForeground(new java.awt.Color(0, 102, 102));
        tfbill.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfbill.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Bill", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        getContentPane().add(tfbill);
        tfbill.setBounds(560, 440, 260, 80);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 380, 260, 40);

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Aharoni", 0, 24));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BUY NOW");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 660, 290, 60);

        tfname.setFont(new java.awt.Font("Aharoni", 1, 14));
        tfname.setForeground(new java.awt.Color(0, 102, 102));
        tfname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Name", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        getContentPane().add(tfname);
        tfname.setBounds(560, 530, 260, 100);

        tfprice.setEditable(false);
        tfprice.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        tfprice.setForeground(new java.awt.Color(0, 102, 102));
        tfprice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfprice.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Price", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        getContentPane().add(tfprice);
        tfprice.setBounds(300, 190, 240, 85);

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Aharoni", 1, 24));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 660, 290, 60);

        tfqty.setEditable(false);
        tfqty.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        tfqty.setForeground(new java.awt.Color(0, 102, 102));
        tfqty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfqty.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available Qty.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        getContentPane().add(tfqty);
        tfqty.setBounds(300, 540, 240, 90);

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Aharoni", 1, 24));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SHOW LIST");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(40, 190, 240, 60);

        tfman.setEditable(false);
        tfman.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        tfman.setForeground(new java.awt.Color(0, 102, 102));
        tfman.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tfman.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manufacturer", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        getContentPane().add(tfman);
        tfman.setBounds(300, 290, 240, 100);

        tadesc.setColumns(20);
        tadesc.setEditable(false);
        tadesc.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        tadesc.setForeground(new java.awt.Color(51, 51, 51));
        tadesc.setLineWrap(true);
        tadesc.setRows(5);
        tadesc.setWrapStyleWord(true);
        tadesc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Description", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        jScrollPane2.setViewportView(tadesc);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 400, 240, 120);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Products", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        jList1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 16));
        jList1.setForeground(new java.awt.Color(0, 0, 102));
        jList1.setModel(new DefaultListModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 260, 240, 280);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Qty.", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 20))); // NOI18N
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(40, 550, 240, 70);

        jButton6.setBackground(new java.awt.Color(120, 0, 0));
        jButton6.setFont(new java.awt.Font("Aharoni", 1, 24));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(640, 660, 180, 60);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\logo the mall.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 20, 150, 150);

        jLabel9.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\MINIMISE.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(773, 2, 35, 35);

        jLabel10.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\CLOSE.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(813, 2, 35, 35);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 850, 750);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-850)/2, (screenSize.height-750)/2, 850, 750);
    }// </editor-fold>//GEN-END:initComponents

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        try {

            Class.forName("java.sql.DriverManager");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "tiger");

            Statement stmt = (Statement) con.createStatement();

            String query = "select * from shop where name="+"'"+jList1.getSelectedValue()+"';";


            ResultSet rs = stmt.executeQuery(query);


            while (rs.next()) {

                String name = rs.getString("name");
                String man = rs.getString("man");
                String desc = rs.getString("descp");
                int price= rs.getInt("price");
                int qty = rs.getInt("qty");

                tfman.setText(man);
                tadesc.setText(desc);
                tfprice.setText(""+price);
                tfqty.setText(""+qty);

                jButton2.setEnabled(true);




                jComboBox1.removeAllItems();
                for(int i=1;i<=qty;i++) {

                    jComboBox1.addItem(i);
                }


            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jList1ValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            Class.forName("java.sql.DriverManager");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "tiger");

            Statement stmt = (Statement) con.createStatement();

            String query = "select name from shop where qty>0;";

            ResultSet rs = stmt.executeQuery(query);

            DefaultListModel dlm = (DefaultListModel) jList1.getModel();

            dlm.removeAllElements();
            while (rs.next()) {

                String name = rs.getString("name");
                dlm.addElement(name);
                jList1.setModel(dlm);


                jButton5.setEnabled(false);

            }

            jList1.setSelectedIndex(0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jList2.isSelectionEmpty()==false){         try {

            Class.forName("java.sql.DriverManager");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "tiger");

            Statement stmt = (Statement) con.createStatement();

            DefaultListModel dlmm=(DefaultListModel)jList2.getModel();

            String cartitem=(String)jList2.getSelectedValue();
            String name=cartitem.substring(0,cartitem.length()-4);
            int qty =Integer.parseInt(cartitem.substring(cartitem.length()-1,cartitem.length()));
            dlmm.removeElementAt(jList2.getSelectedIndex());
            jList2.setModel(dlmm);

            DefaultListModel dlm=(DefaultListModel)jList1.getModel();
            dlm.addElement(name);

            String queryprice="Select price from shop where name='"+name+"';";
            int price=0;

            ResultSet rs=stmt.executeQuery(queryprice);
            if(rs.next()) {
                price=rs.getInt("price");
            }


            String query="update shop set qty=qty+"+qty+" where  name='"+name+"';";
            stmt.executeUpdate(query);

            int bill=Integer.parseInt(tfbill.getText())-(price*qty);
            tfbill.setText(""+bill);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        } else{
            JOptionPane.showMessageDialog(this,"Please select the item which you want to remove from your cart");
        }
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String name=tfname.getText();
        String amt=tfbill.getText();
        int bill;
        if(amt.isEmpty()) {
            bill=0;
        } else {
            bill=Integer.parseInt(amt);
        }

        if(bill>0) {
            if(name.isEmpty()==false) {
                JOptionPane.showMessageDialog(this,name+" Thank You for shopping with us, BYE");

                try {

                    Class.forName("java.sql.DriverManager");

                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "tiger");

                    Statement stmt = (Statement) con.createStatement();
                    String products="";

                    DefaultListModel dlm=(DefaultListModel)jList2.getModel();


                    for(int i=1;i<=dlm.getSize();i++) {
                        jList2.setSelectedIndex(i-1);
                        String item=(String)jList2.getSelectedValue();
                        if(i==1)
                            products+=""+item;
                        else
                            products+=","+item;
                    }
                    String query="insert into orders values(null,'"+name+"','"+products+"',"+bill+",sysdate());";
                    stmt.executeUpdate(query);
                }

                catch(Exception e) {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }

                ((DefaultListModel)jList2.getModel()).clear();
                tfname.setText("");
                tfbill.setText("");

            } else{
                JOptionPane.showMessageDialog(this,"Please enter your name");

            }
        } else {
            JOptionPane.showMessageDialog(this,name+" Your cart is empty,please fill it");

        }
}//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Menu avail=new Menu();
        avail.setVisible(true);        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(ICONIFIED);
}//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
}//GEN-LAST:event_jLabel10MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jList1.isSelectionEmpty()==false){       try {

            Class.forName("java.sql.DriverManager");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "tiger");

            Statement stmt = (Statement) con.createStatement();

            DefaultListModel dlmm=(DefaultListModel)jList1.getModel();

            String name=(String)jList1.getSelectedValue();
            int qty =jComboBox1.getSelectedIndex()+1;

            String query="update shop set qty=qty-"+qty+" where  name='"+name+"';";
            stmt.executeUpdate(query);

            dlmm.removeElementAt(jList1.getSelectedIndex());
            DefaultListModel dlm=(DefaultListModel)jList2.getModel();
            String item=name+" x "+qty;
            dlm.addElement(item);
            jList2.setModel(dlm);

            int bill=0;
            if(tfbill.getText().isEmpty()) {
                bill=Integer.parseInt(tfprice.getText())*qty;
            } else {
                bill=Integer.parseInt(tfbill.getText())+(Integer.parseInt(tfprice.getText())*qty);
            }
            tfbill.setText(""+bill);

            tfman.setText(null);
            tadesc.setText(null);
            tfprice.setText(null);
            tfqty.setText(null);

            jButton3.setEnabled(true);
            jButton4.setEnabled(true);




        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        } else {
            JOptionPane.showMessageDialog(this,"Please select the item which you want to add to your cart");
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
                 jLabel9.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\MINIMISE.png"));

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\CLOSE.png"));
         jLabel5.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\logo the mall.png"));
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Make_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Make_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Make_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Make_Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Make_Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea tadesc;
    private javax.swing.JTextField tfbill;
    private javax.swing.JTextField tfman;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfprice;
    private javax.swing.JTextField tfqty;
    // End of variables declaration//GEN-END:variables

}
