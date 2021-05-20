/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spm.timetablemanagement.statistics;

import com.spm.timetablemanagement.form.room.*;
import com.spm.timetablemanagement.models.tag;
import com.spm.timetablemanagement.models.Room;
import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class stats extends javax.swing.JPanel {
    Connection c;
    ResultSet rs,rs1,rs2;
    PreparedStatement statement,statement1,statement2;
    Statement st,st1,st2;
    
    
    
    
    /**
     * Creates new form InsertWorkingHours
     */
    public stats() throws SQLException {
        initComponents();
        
        try {
            
            c = DBconnection.getConnection();
            st = c.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InsertRoom.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on create Connection"+ex.getMessage(), "Data load error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(stats.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error on create Connection"+ex.getMessage(), "Data load error", JOptionPane.ERROR_MESSAGE);
        }
        
        String sql = "SELECT COUNT(id) FROM lecturer";
        
        rs = st.executeQuery(sql);
        
        while (rs.next()) {
            int result1 = rs.getInt(1);
            String res = Integer.toString(result1);
            
            lect.setText(res);
        }
        
        String sql2 = "SELECT COUNT(id) FROM generated_group_id";
        
        rs1 = st.executeQuery(sql2);
        
        while (rs1.next()) {
            int result2 = rs1.getInt(1);
            String res1 = Integer.toString(result2);
           
            stu.setText(res1);
        }
        
        String sql3 = "SELECT COUNT(id) FROM subject";
        
        rs2 = st.executeQuery(sql3);
        
        while (rs2.next()) {
            int result3 = rs2.getInt(1);
            String res2 = Integer.toString(result3);
            
            sub.setText(res2);
        }
        
        
                
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lect = new javax.swing.JLabel();
        stu = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Lecturers");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel4.setText("Students");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setText("Subjects");

        lect.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        lect.setForeground(new java.awt.Color(58, 149, 167));

        stu.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        stu.setForeground(new java.awt.Color(58, 149, 167));

        sub.setBackground(new java.awt.Color(58, 149, 167));
        sub.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        sub.setForeground(new java.awt.Color(58, 149, 167));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lect, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lect, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(550, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lect;
    private javax.swing.JLabel stu;
    private javax.swing.JLabel sub;
    // End of variables declaration//GEN-END:variables


}
