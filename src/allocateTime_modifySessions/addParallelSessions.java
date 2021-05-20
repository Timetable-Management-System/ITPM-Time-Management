/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package allocateTime_modifySessions;

import com.spm.timetablemanagement.util.Constant;
import com.spm.timetablemanagement.util.CreateQuery;
import com.spm.timetablemanagement.util.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author 
 */
public class addParallelSessions extends javax.swing.JPanel {
    
    Connection connection;
    PreparedStatement pst;
    ResultSet rs;
    String finalTags = null;
    String sessID = null;
    ArrayList<ParallelSession> Parrlist = new ArrayList<>();
    /**
     * Creates new form addParallelSessions
     */
    public addParallelSessions() {
        initComponents();
        YearSelection();
        txt_psSelectionId.setVisible(false);
        txt_psSelectedId.setVisible(false);
        txt_id.setVisible(false);
        showParallelSessionNList();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_ps = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_deleteps = new javax.swing.JButton();
        txt_error_cs = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_psSelected = new javax.swing.JTable();
        btn_select = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_psSelection = new javax.swing.JTable();
        btn_remove = new javax.swing.JButton();
        txt_psSelectionId = new javax.swing.JTextField();
        btn_set = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        selection_y = new javax.swing.JComboBox<>();
        txt_psSelectedId = new javax.swing.JTextField();
        txt_error_selection = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));
        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(710, 360));

        tbl_ps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Academic Year", "Parallel Session", "Session ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_psMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_ps);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setToolTipText("");
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Parallel Session List");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        btn_deleteps.setBackground(new java.awt.Color(255, 255, 255));
        btn_deleteps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_deleteps.setForeground(new java.awt.Color(51, 51, 51));
        btn_deleteps.setText("Delete");
        btn_deleteps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_deleteps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletepsActionPerformed(evt);
            }
        });

        txt_error_cs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_cs.setForeground(new java.awt.Color(255, 51, 51));
        txt_error_cs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_error_cs, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(114, 114, 114))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(250, 250, 250)
                                        .addComponent(btn_deleteps, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_error_cs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_deleteps, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(186, 186, 186))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 710, 380));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Set Parallel Session");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tbl_psSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Academic Year & Semester ", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_psSelected.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_psSelectedMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_psSelected);

        btn_select.setBackground(new java.awt.Color(255, 255, 255));
        btn_select.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_select.setForeground(new java.awt.Color(51, 51, 51));
        btn_select.setText("Select >");
        btn_select.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        tbl_psSelection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Academic Year & Semester ", "Session", "Tag"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_psSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_psSelectionMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_psSelection);

        btn_remove.setBackground(new java.awt.Color(255, 255, 255));
        btn_remove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(51, 51, 51));
        btn_remove.setText("<Remove");
        btn_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_set.setBackground(new java.awt.Color(255, 255, 255));
        btn_set.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_set.setForeground(new java.awt.Color(51, 51, 51));
        btn_set.setText("Set");
        btn_set.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Academic Year");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        selection_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection_yActionPerformed(evt);
            }
        });

        txt_error_selection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_error_selection.setForeground(new java.awt.Color(255, 51, 51));
        txt_error_selection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selection_y, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(txt_psSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(25, 25, 25)))
                            .addComponent(btn_remove)
                            .addComponent(txt_psSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selection_y)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txt_psSelectedId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_psSelectionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_error_selection, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btn_set, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 860, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_psMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_psMouseClicked
        // TODO add your handling code here:
        int i = tbl_ps.getSelectedRow();
        TableModel model = tbl_ps.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_psMouseClicked

    private void btn_deletepsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletepsActionPerformed
        // TODO add your handling code here:
        
        String id = txt_id.getText();
        
        try
        {
            DefaultTableModel model = (DefaultTableModel)tbl_ps.getModel();
            Statement smt = connection.createStatement();
            
            if (txt_id.getText().equals("")){
                
                txt_error_cs.setText("Select First*");
            }
            else{
                txt_error_cs.setText("");
                
                smt.execute("DELETE FROM sp2_parallel_session WHERE id = "+id);
                model.setRowCount(0);
                showParallelSessionNList();
                txt_id.setText("");
                JOptionPane.showMessageDialog(this, "Deleted");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_deletepsActionPerformed

    private void tbl_psSelectedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_psSelectedMouseClicked
        // TODO add your handling code here:
        
        int i = tbl_psSelected.getSelectedRow();
        TableModel model = tbl_psSelection.getModel();
        txt_id.setText(model.getValueAt(i, 0).toString());
        txt_psSelectedId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_psSelectedMouseClicked

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        // TODO add your handling code here:
        if (txt_psSelectionId.getText().equals("")){
            
            txt_error_selection.setText("Select First*");
        }
        else{
            txt_error_selection.setText("");
            String selected_id = txt_psSelectionId.getText();
            showSelectedSessionNList(selected_id);
        }
    }//GEN-LAST:event_btn_selectActionPerformed

    private void tbl_psSelectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_psSelectionMouseClicked
        // TODO add your handling code here:
        int i = tbl_psSelection.getSelectedRow();
        TableModel model = tbl_psSelection.getModel();
        txt_psSelectionId.setText(model.getValueAt(i, 0).toString());
    }//GEN-LAST:event_tbl_psSelectionMouseClicked

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        // TODO add your handling code here:
        if (txt_psSelectedId.getText().equals("")){
            
            txt_error_selection.setText("Select First*");
        }
        else{
            txt_error_selection.setText("");
            DefaultTableModel model = (DefaultTableModel)tbl_psSelected.getModel();
            model.removeRow(Integer.parseInt(txt_psSelectedId.getText())-1);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed
        // TODO add your handling code here:
        
        try{
            DefaultTableModel model = (DefaultTableModel)tbl_psSelected.getModel();
            DefaultTableModel model2 = (DefaultTableModel)tbl_ps.getModel();
            connection = DBconnection.getConnection();
            
            if (tbl_psSelected.getRowCount() == 0){
                
                txt_error_selection.setText("Select Sessions First*");
            }
            else{
                txt_error_selection.setText("");
                
                TagCreator();
                
                String sessionList[] = sessID.split(",");
                boolean lock = false;
                Parrlist = getParallelSessionNList();
                
                for(int x=0;x<sessionList.length;x++){
                    
                    for(int i =0;i<Parrlist.size();i++){
                         String sessionList2[] = Parrlist.get(i).getSessionID().split(",");
                         
                         for(int a=0;a<sessionList2.length;a++){
                            if(sessionList[x].equals(sessionList2[a])){
                                lock = true;
                            }
                         }
                    }
                }
                if(lock){
                    txt_error_selection.setText("This Sessions Already Exist");
                }
                else{
                    PreparedStatement statement = connection.prepareStatement(CreateQuery.getQuery(Constant.INSERT_SP2_PARALLEL_SESSION_TABLE));

                    statement.setString(1, selection_y.getSelectedItem().toString());
                    statement.setString(2, finalTags);
                    statement.setString(3, sessID);

                    statement.executeUpdate();
                    model.setRowCount(0);
                    model2.setRowCount(0);
                    showParallelSessionNList();
                    txt_id.setText("");
                    JOptionPane.showMessageDialog(null, "Inserting Successful!");
                }
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_setActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tbl_psSelection.getModel();
        model.setRowCount(0);
        String year = selection_y.getSelectedItem().toString();
        if (year.equals("Year 01")){
            year = "Y1";
        }
        else if(year.equals("Year 02")){
            year = "Y2";
        }
        else if(year.equals("Year 03")){
            year = "Y3";
        }
        else{
            year = "Y4";
        }
        showSessionNList(year);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selection_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selection_yActionPerformed
    
    public ArrayList<sessionDetails> getSessionNList(String year)
    {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try{
            connection = DBconnection.getConnection();
            Statement st;
            ResultSet rs;
            
            st = connection.createStatement();
            String querry = "select * from session where group_id LIKE '"+year+"%'";
            
            rs= st.executeQuery(querry);
            sessionDetails sDetails;
            while(rs.next())
            {
                sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("group_id"));
                list.add(sDetails);
//                System.out.println(sDetails.getId());
//                System.out.println(sDetails.getsGid());
//                System.out.println(sDetails.getSession());
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return list;
    }
    
    public void showSessionNList(String year)
    {
        ArrayList<sessionDetails> list = getSessionNList(year);
        DefaultTableModel model = (DefaultTableModel)tbl_psSelection.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getsGid();
            row[2] = list.get(i).getSession();
            row[3] = list.get(i).gettag();
            
            model.addRow(row);
        }
    }
    
    public ArrayList<sessionDetails> getselectedSessionNList(String id)
    {
        ArrayList<sessionDetails> list = new ArrayList<sessionDetails>();
        try{
            connection = DBconnection.getConnection();
            String querry = "select * from session where id = '"+id+"'";
            Statement st;
            ResultSet rs;
            
            st = connection.createStatement();
            rs= st.executeQuery(querry);
            sessionDetails sDetails;
            while(rs.next())
            {
                sDetails = new sessionDetails(rs.getInt("id"), rs.getString("subject"), rs.getString("tag"), rs.getString("group_id"));
                list.add(sDetails);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showSelectedSessionNList(String id)
    {
        ArrayList<sessionDetails> list = getselectedSessionNList(id);
        DefaultTableModel model = (DefaultTableModel)tbl_psSelected.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getsGid();
            row[2] = list.get(i).getSession();
            row[3] = list.get(i).gettag();
            
            
            model.addRow(row);
        }
    }
    
    public ArrayList<ParallelSession> getParallelSessionNList()
    {
        ArrayList<ParallelSession> list = new ArrayList<ParallelSession>();
        try{
            connection = DBconnection.getConnection();
            String querry = "select * from sp2_parallel_session";
            Statement st;
            ResultSet rs;
            
            st = connection.createStatement();
            rs= st.executeQuery(querry);
            ParallelSession ParallelSession;
            while(rs.next())
            {
                ParallelSession = new ParallelSession(rs.getInt("id"), rs.getString("yNs"), rs.getString("session"), rs.getString("sessionID"));
                list.add(ParallelSession);
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
    
    public void showParallelSessionNList()
    {
        ArrayList<ParallelSession> list = getParallelSessionNList();
        DefaultTableModel model = (DefaultTableModel)tbl_ps.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getYnS();
            row[2] = list.get(i).getPSession();
            row[3] = list.get(i).getSessionID();
            
            model.addRow(row);
        }
    }
    
    public  void YearSelection(){
        try{
            
            int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
            connection = DBconnection.getConnection();
            String query = "select * from session group by group_id";
            pst = connection.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                String sGid = rs.getString("group_id");
                String year = null;
                
                if(sGid != null){
                    
                    year = substring(sGid,0,2);
                    
                    
                    if (year.equals("Y1")){
                        year = "Year 01";
                        count1++;
                        if(count1 == 1){
                            selection_y.addItem(year);
                        }
                        
                    }else if(year.equals("Y2")){
                        year = "Year 02";
                        count2++;
                        if(count2 == 1){
                            selection_y.addItem(year);
                        }
                    }
                    else if(year.equals("Y3")){
                        year = "Year 03";
                        count3++;
                        if(count3 == 1){
                            selection_y.addItem(year);
                        }
                    }else{
                        year = "Year 04";
                        count4++;
                        if(count4 == 1){
                            selection_y.addItem(year);
                        }
                    }
                }
            }
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void TagCreator(){
        DefaultTableModel model = (DefaultTableModel)tbl_psSelected.getModel();
        int x = tbl_psSelected.getRowCount();
        String[] tags = new String[x];
        String[] newtags = new String[x];
        String[] sub = new String[x];
        
        newtags[0] = model.getValueAt(0, 2).toString();
        tags[0] = model.getValueAt(0, 3).toString();
        sessID = model.getValueAt(0, 0).toString();
        int i = 1;
        while (x!=i){
            
            sub[i] = model.getValueAt(i, 2).toString();
            tags[i] = model.getValueAt(i, 3).toString();
            newtags[i] = '('+newtags[i-1]+','+tags[i-1]+')'+','+'('+sub[i]+','+tags[i]+')';
            finalTags = newtags[i];
            sessID = sessID.concat(","+ model.getValueAt(i, 0).toString());
            i++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_deleteps;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_set;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> selection_y;
    private javax.swing.JTable tbl_ps;
    private javax.swing.JTable tbl_psSelected;
    private javax.swing.JTable tbl_psSelection;
    private javax.swing.JLabel txt_error_cs;
    private javax.swing.JLabel txt_error_selection;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_psSelectedId;
    private javax.swing.JTextField txt_psSelectionId;
    // End of variables declaration//GEN-END:variables
}
