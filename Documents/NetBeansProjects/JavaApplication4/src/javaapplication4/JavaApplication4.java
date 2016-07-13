package javaapplication4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class JavaApplication4 {

    JFrame f = new JFrame();
    JPanel p = new JPanel();

    JLabel l;
    JLabel item1;
    JLabel item2;
    JLabel item3;
    JLabel item4;
    JLabel item5;
    JLabel item6;
    JLabel item7;
    JLabel item8;
    JLabel item9;
    JLabel item10;
    JLabel item11;
    JLabel item12;
    JLabel item13;
    JLabel item14;
    JLabel item15;
    JComboBox cb1;

    JTextField tx1;
    JTextField tx2;
    JTextField tx3;
    JTextField tx4;
    JTextField tx5;
    JTextField tx6;
    JTextArea tx7;
    JTextField tx8;
    JTextField tx9;

    JTextField tx10;
    JTextField tx11;
    JTextField tx12;
    JTextField tx14;
    JTextField tx15;
    JTextArea tx13;
    JTable tbl1;

    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;

    Statement stmt;
    Statement st;

    JavaApplication4() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); /// look and feel for the UI

        } catch (Exception e) {
        }

        JFrame f = new JFrame("Student Management | Admin");        ///title 

        JMenuBar menu = new JMenuBar();                              ///menu bar
        menu.setOpaque(true);
        menu.setPreferredSize(new Dimension(200, 20));
        f.setJMenuBar(menu);
        f.getContentPane();

        l = new JLabel("Student Records");
        l.setBounds(500, 10, 300, 100);                           /// positioning the label inside panel on a frame
        l.setFont(new Font("Arial", Font.BOLD, 18));
        p.add(l);                                                ///adding component to panel
        p.setLayout(null);

        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));  ///picture
        p.add(Box.createRigidArea(new Dimension(0, 10)));
        ImageIcon icon = new ImageIcon("info.PNG");
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        p.add(label);

        f.setExtendedState(f.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        f.setFocusableWindowState(true);
        f.add(p);
        f.setSize(800, 500);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);

        //adding buttons and textboxes to the panel
        item1 = new JLabel("Student No:");
        item1.setBounds(300, 100, 200, 24);
        p.add(item1);

        tx1 = new JTextField(20);
        tx1.setBounds(370, 100, 150, 24);
        p.add(tx1);

        item14 = new JLabel("Year :");
        item14.setBounds(300, 130, 200, 24);
        p.add(item14);

        tx14 = new JTextField(20);
        tx14.setBounds(370, 130, 80, 24);
        p.add(tx14);

        item2 = new JLabel("Course:");
        item2.setBounds(300, 160, 200, 24);
        p.add(item2);

        tx2 = new JTextField();
        tx2.setBounds(370, 160, 150, 24);
        p.add(tx2);

        item3 = new JLabel("Name:");
        item3.setBounds(300, 190, 150, 24);
        p.add(item3);

        tx3 = new JTextField();
        tx3.setBounds(370, 190, 150, 24);
        p.add(tx3);

        item4 = new JLabel("Surname:");
        item4.setBounds(280, 230, 150, 24);
        p.add(item4);

        tx4 = new JTextField();
        tx4.setBounds(370, 230, 150, 24);
        p.add(tx4);

        item5 = new JLabel("ID Number:");
        item5.setBounds(270, 270, 150, 24);
        p.add(item5);

        tx5 = new JTextField();
        tx5.setBounds(370, 270, 150, 24);
        p.add(tx5);

        item6 = new JLabel("Physical address:");
        item6.setBounds(250, 300, 150, 24);
        p.add(item6);

        tx6 = new JTextField();
        tx6.setBounds(370, 300, 150, 24);
        p.add(tx6);

        item7 = new JLabel("Postal address:");
        item7.setBounds(250, 330, 150, 24);
        p.add(item7);

        tx7 = new JTextArea();
        tx7.setBounds(370, 330, 150, 100);
        p.add(tx7);

        item8 = new JLabel("Postal Code:");
        item8.setBounds(250, 440, 150, 24);
        p.add(item8);

        tx8 = new JTextField();
        tx8.setBounds(370, 440, 50, 24);
        p.add(tx8);

        item9 = new JLabel("Parent Id number:");
        item9.setBounds(600, 120, 150, 24);
        p.add(item9);

        tx9 = new JTextField();
        tx9.setBounds(750, 120, 150, 24);
        p.add(tx9);

        item10 = new JLabel("Surname:");
        item10.setBounds(600, 190, 150, 24);
        p.add(item10);

        tx10 = new JTextField();
        tx10.setBounds(750, 190, 150, 24);
        p.add(tx10);

        item11 = new JLabel("Occupation:");
        item11.setBounds(600, 230, 150, 24);
        p.add(item11);

        tx11 = new JTextField();
        tx11.setBounds(750, 230, 150, 24);
        p.add(tx11);

        item12 = new JLabel("Cell No:");
        item12.setBounds(600, 270, 150, 24);
        p.add(item12);

        tx12 = new JTextField();
        tx12.setBounds(750, 270, 150, 24);
        p.add(tx12);

        item15 = new JLabel("Parent/Guadian Name:");
        item15.setBounds(600, 150, 150, 24);
        p.add(item15);

        tx15 = new JTextField();
        tx15.setBounds(750, 150, 150, 24);
        p.add(tx15);

        tbl1 = new JTable();
        tbl1.setBounds(950, 100, 400, 200);
        p.add(tbl1);

        btn1 = new JButton("Save");
        btn1.setBounds(370, 600, 100, 30);
        btn1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String studentId = tx1.getText();
                String name = tx3.getText();
                String surname = tx4.getText();
                String courseName = tx2.getText();
                String IdNum = tx5.getText();
                String PhysicalAddress = tx6.getText();
                String PostalAddress = tx7.getText();
                String Zip_code = tx8.getText();
                String parentId = tx9.getText();
                String Psurname = tx10.getText();
                String occupation = tx11.getText();
                String cellNo = tx12.getText();
                String year_enrolled = tx14.getText();
                String Pname = tx15.getText();

                 if (IdNum.length() < 13 || IdNum.length() > 13) {
                 Toolkit tk = Toolkit.getDefaultToolkit();
                 tk.beep();
                 JOptionPane.showMessageDialog(null, "Invalid ID number", "Error", JOptionPane.ERROR_MESSAGE);
                 tx5.requestFocusInWindow();
                 } else {
                    try {
                        /**
                         * Registering the JDBC driver:
                         */
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;
                        /**
                         * Opening a connection:
                         */
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Stan123");

                        if (conn != null) {

                            JOptionPane.showMessageDialog(null, "Saving record to the database...");
                            /**
                             * Executing a query:
                             */
                            String sql = " INSERT INTO student_table VALUES('" + studentId + "', '" + name + "','" + surname + "','" + courseName + "','" + year_enrolled + "','" + IdNum + "','" + PhysicalAddress + "','" + PostalAddress + "','" + Zip_code + "')";

                            //String sqlQuery = " INSERT INTO parent_table VALUES('" + parentId + "', '" + Pname + "','" + Psurname + "','" + occupation + "','" + cellNo + "')";

                            PreparedStatement stmt = conn.prepareStatement(sql);

                            //PreparedStatement st = conn.prepareStatement(sqlQuery);

                            stmt.executeUpdate(sql);

                            //st.executeUpdate(sqlQuery);
                            /**
                             * Clean up the environment:
                             */
                            conn.close();

                        }
                    } catch (Exception me) {

                        JOptionPane.showMessageDialog(null, "Error occurred in inserting data");
                        me.printStackTrace();

                    }
                }

            }

        }
        );

        p.add(btn1);

        btn2 = new JButton("Clear");
        btn2.setBounds(500, 600, 100, 30);
        btn2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                tx1.setText("");//to clear textboxes
                tx2.setText("");
                tx3.setText("");
                tx4.setText("");
                tx5.setText("");
                tx6.setText("");
                tx7.setText("");
                tx7.setText("");
                tx8.setText("");
                tx9.setText("");
                tx10.setText("");
                tx11.setText("");
                tx12.setText("");
                tx13.setText("");
                tx14.setText("");
                tx15.setText("");
            }

        });
        p.add(btn2);

        btn3 = new JButton("Update");
        btn3.setBounds(650, 600, 100, 30);
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                String studentId = tx1.getText();
                String name = tx3.getText();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = null;

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Stan123");

                    JOptionPane.showMessageDialog(null, "Updating  records...");

                    stmt = conn.createStatement();
                    String sql = "UPDATE student_table  SET name='" + name + "' " + " WHERE  studentId='" + studentId + "'";
                    PreparedStatement stmt = conn.prepareStatement(sql);

                    stmt.executeUpdate(sql);
                    stmt.addBatch(sql);

                    System.out.print("Student Information:\n" + "=================================");
                    System.out.print("\nStudent No      : " + studentId);
                    System.out.print("\nName            : " + name);
                    System.out.print("\n========================================");

                } catch (Exception e) {
                }

            }

        });

        p.add(btn3);

        btn4 = new JButton("Delete");
        btn4.setBounds(800, 600, 100, 30);
        btn4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                String studentId = tx1.getText();

                try {

                    Connection conn = null;

                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Stan123");

                    JOptionPane.showMessageDialog(null, "Deleting records...");

                    String sql = "DELETE  FROM student_table WHERE studentId='" + studentId + "' ";

                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.executeUpdate(sql);

                } catch (Exception e) {

                    e.printStackTrace();
                }

            }

        });

        p.add(btn4);

        btn4 = new JButton("Search");
        btn4.setBounds(550, 100, 80, 20);

        btn4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                String studentId = tx1.getText();
                if (studentId.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the student number or ID number");
                    tx1.requestFocusInWindow();

                } else {
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = null;

                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Stan123");

                        JOptionPane.showMessageDialog(null, "Retrieving  records...");

                        String sql = "SELECT studentId, name,surname,courseName,year_enrolled,IdNum,PhysicalAddress,PostalAddress,Zip_code FROM student_table WHERE studentId= '" + studentId + "'";
                        //String sqlQuery = "SELECT * FROM parent_table ";

                        stmt = conn.createStatement();
                        st = conn.createStatement();

                        //ResultSet r = st.executeQuery(sqlQuery);
                        ResultSet rs = stmt.executeQuery(sql);

                        while (rs.next()) {

                            String name = rs.getString(2);
                            String surname = rs.getString(3);
                            String courseName = rs.getString(4);
                            String year_enrolled = rs.getString(5);
                            String IdNum = rs.getString(6);
                            String PhysicalAddress = rs.getString(7);
                            String PostalAddress = rs.getString(8);
                            String Zip_code = rs.getString(9);
                            
                            /*String parentId = rs.getString(1);
                            String Pname = rs.getString(2);
                            String Psurname = rs.getString(3);
                            String occupation = rs.getString(4);
                            String cellNo = rs.getString(5);*/

                            tx1.setText(studentId);
                            tx3.setText(name);
                            tx4.setText(surname);
                            tx2.setText(courseName);
                            tx5.setText(IdNum);
                            tx6.setText(PhysicalAddress);
                            tx7.setText(PostalAddress);
                            tx8.setText(Zip_code);

                           /* tx15.setText(Pname);
                            tx10.setText(Psurname);
                            tx9.setText(parentId);
                            tx11.setText(occupation);
                            tx12.setText(cellNo);*/

                            tx14.setText(year_enrolled);

                         

                        }

                        stmt.close();

                     
                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(null, "Student Number already exists");
                        e.printStackTrace();
                    }
                }

            }

        });

        p.add(btn4);

        btn6 = new JButton("Exit");
        btn6.setBounds(950, 600, 80, 30);
        btn6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {

                int response = JOptionPane.showConfirmDialog(null, "are you sure?", "Confirm ", JOptionPane.YES_NO_CANCEL_OPTION);

                switch (response) {
                    case JOptionPane.YES_OPTION:
                        System.exit(JFrame.EXIT_ON_CLOSE);
                        break;

                }

            }

        });
        p.add(btn6);

    }

    public static void main(String[] args) {

        new JavaApplication4();

    }

}
