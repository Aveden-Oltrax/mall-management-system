

package shopping;

import java.sql.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Signup extends javax.swing.JFrame {

    Connection con;
    Statement stemt,smt1;
    ResultSet rs;
    java.util.Date dt1;
    /** Creates new form backstore */
    public Signup() {
        initComponents();
        try
        {
            Class .forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","tiger");
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

        jDialog1 = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        invalid = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        h = new javax.swing.JPasswordField();
        j = new javax.swing.JLabel();
        k = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        d = new javax.swing.JLabel();
        m = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        g = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        ku = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        z = new javax.swing.JTextField();
        i = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jDialog1.setBounds(new java.awt.Rectangle(342, 210, 0, 0));
        jDialog1.setMinimumSize(new java.awt.Dimension(340, 340));
        jDialog1.setUndecorated(true);
        jDialog1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jDialog1WindowOpened(evt);
            }
        });
        jDialog1.getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i1 - Copy.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 100, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i2 - Copy.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 10, 100, 100);

        jLabel6.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i3 - Copy.png")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 10, 100, 100);

        jLabel7.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i4 - Copy.png")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 120, 100, 100);

        jLabel8.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i5 - Copy.png")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 120, 100, 100);

        jLabel19.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i6 - Copy.png")); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel19);
        jLabel19.setBounds(230, 120, 100, 100);

        jLabel21.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i7 - Copy.png")); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 230, 100, 100);

        jLabel23.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i8 - Copy.png")); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel23);
        jLabel23.setBounds(120, 230, 100, 100);

        jLabel24.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i9 - Copy.png")); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jDialog1.getContentPane().add(jLabel24);
        jLabel24.setBounds(230, 230, 100, 100);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 1, true));
        jLabel25.setOpaque(true);
        jDialog1.getContentPane().add(jLabel25);
        jLabel25.setBounds(0, 0, 340, 340);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Shopping Mall System");
        setBounds(new java.awt.Rectangle(252, 55, 0, 0));
        setMinimumSize(new java.awt.Dimension(520, 650));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel11.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\BLACK.png")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(830, 0, 1024, 760);

        jButton1.setBackground(new java.awt.Color(11, 198, 160));
        jButton1.setFont(new java.awt.Font("Aharoni", 1, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE ACCOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 530, 460, 50);

        invalid.setFont(new java.awt.Font("Aharoni", 0, 14));
        invalid.setForeground(new java.awt.Color(51, 153, 255));
        getContentPane().add(invalid);
        invalid.setBounds(760, 300, 220, 22);

        t.setBackground(new java.awt.Color(11, 198, 160));
        t.setFont(new java.awt.Font("Calibri", 1, 20));
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        t.setText("CREATE ACCOUNT");
        t.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 198, 160), 1, true));
        t.setOpaque(true);
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMouseClicked(evt);
            }
        });
        t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tKeyPressed(evt);
            }
        });
        getContentPane().add(t);
        t.setBounds(570, 520, 460, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\CLOSE.png")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(483, 2, 35, 35);

        h.setFont(new java.awt.Font("Tahoma", 0, 15));
        h.setForeground(new java.awt.Color(102, 102, 102));
        h.setText("PASSWORD");
        h.setBorder(null);
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        h.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                hFocusLost(evt);
            }
        });
        getContentPane().add(h);
        h.setBounds(60, 390, 320, 30);

        j.setBackground(new java.awt.Color(255, 255, 255));
        j.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\SHOW PASSWORD.png")); // NOI18N
        j.setOpaque(true);
        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMouseClicked(evt);
            }
        });
        getContentPane().add(j);
        j.setBounds(380, 380, 40, 40);

        k.setBackground(new java.awt.Color(255, 255, 255));
        k.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\HIDE PASSWORD.png")); // NOI18N
        k.setOpaque(true);
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kMouseClicked(evt);
            }
        });
        getContentPane().add(k);
        k.setBounds(380, 380, 40, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 0, 0);

        d.setFont(new java.awt.Font("Calibri", 0, 15));
        d.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(d);
        d.setBounds(40, 290, 200, 20);

        m.setFont(new java.awt.Font("Tahoma", 0, 15));
        m.setForeground(new java.awt.Color(102, 102, 102));
        m.setText("CONFIRM PASSWORD");
        m.setBorder(null);
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mFocusLost(evt);
            }
        });
        getContentPane().add(m);
        m.setBounds(60, 470, 320, 30);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 16));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> \nAlready have an account ? \n<font color = rgb(11,198,160)> <b>login!</b> </font> \n</html>");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 610, 230, 30);

        g.setFont(new java.awt.Font("Calibri", 0, 15));
        g.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(g);
        g.setBounds(40, 370, 200, 20);

        o.setBackground(new java.awt.Color(255, 255, 255));
        o.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\SHOW PASSWORD.png")); // NOI18N
        o.setOpaque(true);
        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oMouseClicked(evt);
            }
        });
        getContentPane().add(o);
        o.setBounds(380, 460, 40, 40);

        p.setBackground(new java.awt.Color(255, 255, 255));
        p.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\HIDE PASSWORD.png")); // NOI18N
        p.setOpaque(true);
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMouseClicked(evt);
            }
        });
        getContentPane().add(p);
        p.setBounds(380, 460, 40, 40);

        ku.setText("0");
        ku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(ku);
        ku.setBounds(690, 290, 60, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\MINIMISE.png")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(443, 2, 35, 35);

        z.setFont(new java.awt.Font("Tahoma", 0, 15));
        z.setForeground(new java.awt.Color(102, 102, 102));
        z.setText("USERNAME");
        z.setBorder(null);
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });
        z.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zFocusLost(evt);
            }
        });
        getContentPane().add(z);
        z.setBounds(60, 310, 360, 30);

        i.setBackground(new java.awt.Color(204, 204, 204));
        i.setOpaque(true);
        getContentPane().add(i);
        i.setBounds(40, 420, 380, 2);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 198, 160));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGN UP !");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 20, 190, 40);

        l.setFont(new java.awt.Font("Calibri", 0, 15));
        l.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(l);
        l.setBounds(40, 450, 200, 20);

        f.setBackground(new java.awt.Color(204, 204, 204));
        f.setOpaque(true);
        getContentPane().add(f);
        f.setBounds(40, 340, 380, 2);

        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i0.png")); // NOI18N
        jLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMouseClicked(evt);
            }
        });
        getContentPane().add(jLabel);
        jLabel.setBounds(150, 80, 180, 180);

        n.setBackground(new java.awt.Color(204, 204, 204));
        n.setOpaque(true);
        getContentPane().add(n);
        n.setBounds(40, 500, 380, 2);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 650);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-520)/2, (screenSize.height-650)/2, 520, 650);
    }// </editor-fold>//GEN-END:initComponents
Connection conn = null;
ResultSet rs1 = null;
Statement stmt = null;
Menu a = new Menu();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int ans = JOptionPane.showConfirmDialog(null,"want to add an account");
        if (ans == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/store","root","tiger");
                stmt = con.createStatement();
                String jk = z.getText();
                int s2 = jk.length();
                if (s2==0) {
                    f.setForeground(java.awt.Color.red);
                    JOptionPane.showMessageDialog(null, "Please enter username");
                }
                String ui = new String(h.getPassword());
                int s3 = ui.length();
                if (s3==0) {
                    i.setForeground(java.awt.Color.red);
                    JOptionPane.showMessageDialog(null, "Please enter password");
                }
                String yuy = new String(m.getPassword());
                int s4 = yuy.length();
                if (s4==0) {
                    n.setForeground(java.awt.Color.red);
                    JOptionPane.showMessageDialog(null, "Please confirm password");
                }
                if(ui.equals(yuy) == false) {
                    JOptionPane.showMessageDialog(null, "Re-enter password");
                } else{
                    String query = "insert into user values(" + "'" + z.getText()+ "','"+  new String(h.getPassword()) + "'," + ku.getText()+");";
                    System.out.print(query);
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Account Created!");
                    new Login().setVisible(true);
                    this.dispose();}
            } catch(Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "error in account creation");
                String x1 = z.getText();
                int a1 = x1.length();
                if (a1==0) {
                    z.setForeground(new java.awt.Color(102,102,102));
                    z.setText("USERNAME");
                    d.setText("");
                    f.setBackground(new java.awt.Color(204, 204, 204));
                } else {
                    z.setText(""+x1);
                    f.setBackground(new java.awt.Color(255, 255, 255));
                }
                String y2 =  new String(h.getPassword());
                int a2 = y2.length();
                if (a2==0) {
                    h.setEchoChar((char)0);
                    h.setText("PASSWORD");
                    g.setText("");
                    h.setForeground(new java.awt.Color(102, 102, 102));
                    i.setBackground(new java.awt.Color(204, 204, 204));
                } else {
                    h.setText(""+y2);
                    i.setBackground(new java.awt.Color(255, 255, 255));
                }
                String y3 =  new String(m.getPassword());
                int a3 = y3.length();
                if (a3==0) {
                    m.setEchoChar((char)0);
                    m.setText("CONFIRM PASSWORD");
                    l.setText("");
                    m.setForeground(new java.awt.Color(102, 102, 102));
                    n.setBackground(new java.awt.Color(204, 204, 204));
                } else {
                    System.out.println("n o its not null");
                    m.setText(""+y3);
                    n.setBackground(new java.awt.Color(255, 255, 255));
                }
            }
        }
        String x6 = z.getText();
        int a6 = x6.length();

        if (a6==0) {
            z.setForeground(new java.awt.Color(102,102,102));
            z.setText("USERNAME");
            d.setText("");
            f.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            z.setText(""+x6);
            f.setBackground(new java.awt.Color(255, 255, 255));
        }
        String y7 =  new String(h.getPassword());
        int a7 = y7.length();

        if (a7==0) {
            h.setEchoChar((char)0);
            h.setText("PASSWORD");
            g.setText("");
            h.setForeground(new java.awt.Color(102, 102, 102));
            i.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            h.setText(""+y7);
            i.setBackground(new java.awt.Color(255, 255, 255));
        }
        String y8 =  new String(m.getPassword());
        int a8 = y8.length();

        if (a8==0) {
            m.setEchoChar((char)0);
            m.setText("CONFIRM PASSWORD");
            l.setText("");
            m.setForeground(new java.awt.Color(102, 102, 102));
            n.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            m.setText(""+y8);
            n.setBackground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        System.exit(0);
}//GEN-LAST:event_jLabel10MouseClicked

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed

}//GEN-LAST:event_hActionPerformed

    private void hFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hFocusGained
        k.setVisible(false);
        j.setVisible(true);
        h.setEchoChar('•');
        g.setText(""+"    PASSWORD");
        h.setText("");
        h.setForeground(new java.awt.Color(0, 0,0));
        i.setBackground(new java.awt.Color(11,198,160));
}//GEN-LAST:event_hFocusGained

    private void hFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hFocusLost
        String y =  new String(h.getPassword());
        int a = y.length();
        if (a==0) {
            h.setEchoChar((char)0);
            h.setText("PASSWORD");
            g.setText("");
            h.setForeground(new java.awt.Color(102, 102, 102));
            i.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            h.setText(""+y);
            i.setBackground(new java.awt.Color(255, 255, 255));
        }
}//GEN-LAST:event_hFocusLost

    private void jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMouseClicked
        // TODO add your handling code here:
        //show password
        k.setVisible(true);
        k.setLocation(380, 380);
        j.setVisible(false);
        h.setEchoChar((char)0);
}//GEN-LAST:event_jMouseClicked

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed

}//GEN-LAST:event_mActionPerformed

    private void mFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mFocusGained
        p.setVisible(false);
        o.setVisible(true);
        m.setEchoChar('•');
        l.setText(""+"    CONFIRM PASSWORD");
        m.setText("");
        m.setForeground(new java.awt.Color(0, 0,0));
        n.setBackground(new java.awt.Color(11,198,160));
}//GEN-LAST:event_mFocusGained

    private void mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mFocusLost
        // TODO add your handling code here:
        String y =  new String(m.getPassword());
        int a = y.length();
        if (a==0) {
            m.setEchoChar((char)0);
            m.setText("CONFIRM PASSWORD");
            l.setText("");
            m.setForeground(new java.awt.Color(102, 102, 102));
            n.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            m.setText(""+y);
            n.setBackground(new java.awt.Color(255, 255, 255));
        }
}//GEN-LAST:event_mFocusLost

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        new Login().setVisible(true);
}//GEN-LAST:event_jLabel1MouseClicked

    private void oMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMouseClicked
        // TODO add your handling code here:


        p.setVisible(true);
        p.setLocation(380, 460);
        o.setVisible(false);
        m.setEchoChar((char)0);
}//GEN-LAST:event_oMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(ICONIFIED);
}//GEN-LAST:event_jLabel9MouseClicked

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed

}//GEN-LAST:event_zActionPerformed

    private void zFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zFocusGained
        d.setText(""+"USERNAME");
        z.setText("");
        z.setForeground(new java.awt.Color(0, 0,0));
        f.setBackground(new java.awt.Color(11,198,160));
}//GEN-LAST:event_zFocusGained

    private void zFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zFocusLost
        String x = z.getText();
        int ku = x.length();
        if (ku==0) {
            z.setForeground(new java.awt.Color(102,102,102));
            z.setText("USERNAME");
            d.setText("");
            f.setBackground(new java.awt.Color(204, 204, 204));
        } else {
            z.setText(""+x);
            f.setBackground(new java.awt.Color(255, 255, 255));
        }
}//GEN-LAST:event_zFocusLost

    private void pMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMouseClicked
        // TODO add your handling code here:
        p.setVisible(false);
        o.setVisible(true);
        o.setLocation(380, 460);
        m.setEchoChar('•');
}//GEN-LAST:event_pMouseClicked

    private void kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMouseClicked
        // TODO add your handling code here:
        //hide password
        k.setVisible(false);
        j.setVisible(true);
        j.setLocation(380, 380);
        h.setEchoChar('•');
}//GEN-LAST:event_kMouseClicked

    private void jLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMouseClicked
        jLabel11.setLocation(0,0);
        jDialog1.setVisible(true);
}//GEN-LAST:event_jLabelMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i1.png"));
        jDialog1.setVisible(false);
        ku.setText("1");
}//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i2.png"));
        jDialog1.setVisible(false);
        ku.setText("2");
}//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i3.png"));
        jDialog1.setVisible(false);
        ku.setText("3");
}//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i4.png"));
        jDialog1.setVisible(false);
        ku.setText("4");
}//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i5.png"));
        jDialog1.setVisible(false);
        ku.setText("5");
}//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i6.png"));
        jDialog1.setVisible(false);
        ku.setText("6");
}//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i7.png"));
        jDialog1.setVisible(false);
        ku.setText("7");
}//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i8.png"));
        jDialog1.setVisible(false);
        ku.setText("8");
}//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jLabel11.setLocation(830,0);
        jLabel.setIcon(new javax.swing.ImageIcon("M:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i9.png"));
        jDialog1.setVisible(false);
        ku.setText("9");
}//GEN-LAST:event_jLabel24MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
h.setEchoChar((char)0);
m.setEchoChar((char)0);
jLabel4.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i1 - Copy.png"));
jLabel5.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i2 - Copy.png"));
jLabel6.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i3 - Copy.png"));
jLabel7.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i4 - Copy.png"));
jLabel8.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i5 - Copy.png"));
jLabel19.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i6 - Copy.png"));
jLabel21.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i7 - Copy.png"));
jLabel23.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i8 - Copy.png")); // NOI18N
jLabel24.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i9 - Copy.png")); // NOI18
jLabel11.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\BLACK.png")); // NOI18N
jLabel10.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\CLOSE.png")); // NOI18N
j.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\SHOW PASSWORD.png")); // NOI18N
k.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\HIDE PASSWORD.png")); // NOI18N
o.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\SHOW PASSWORD.png")); // NOI18N
p.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\HIDE PASSWORD.png")); // NOI18N
jLabel9.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\MINIMISE.png")); // NOI18N
jLabel.setIcon(new javax.swing.ImageIcon("D:\\IP PROJECT 2018-19\\PICTURES\\PROFILE PICS\\i0.png"));


    }//GEN-LAST:event_formWindowOpened

    private void tKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tKeyPressed
        // TODO add your handling code here:
}//GEN-LAST:event_tKeyPressed

    private void tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMouseClicked

}//GEN-LAST:event_tMouseClicked

    private void jDialog1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jDialog1WindowOpened
        // TODO add your handling code here:
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        jDialog1.setBounds((screenSize.width-520)/2, (screenSize.height-650)/2, 520, 650);
    }//GEN-LAST:event_jDialog1WindowOpened

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel d;
    private javax.swing.JLabel f;
    private javax.swing.JLabel g;
    private javax.swing.JPasswordField h;
    private javax.swing.JLabel i;
    private javax.swing.JLabel invalid;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel k;
    private javax.swing.JLabel ku;
    private javax.swing.JLabel l;
    private javax.swing.JPasswordField m;
    private javax.swing.JLabel n;
    private javax.swing.JLabel o;
    private javax.swing.JLabel p;
    private javax.swing.JLabel t;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables

}
