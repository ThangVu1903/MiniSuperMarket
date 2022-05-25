/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.Category;
import Service.CatergoriService;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Categories extends javax.swing.JFrame {
 CatergoriService Clservice;
    DefaultTableModel defaultTableModel;
    Category Ct;
    /**
     * Creates new form DanhMucQuanLy
     */
    public Categories() {
        initComponents();
         Clservice = new CatergoriService();
        Ct = new Category();
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        Category_table_Tuananh.setModel(defaultTableModel);
        
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("NAME");
        defaultTableModel.addColumn("DESC");
       

        
        setTableData(Clservice.getAllCattegories());
    }
private void setTableData(List<Category> categorys){
        for (Category Categories : categorys ){
            defaultTableModel.addRow(new Object[]{Categories.getIdcat(), Categories.getName() , Categories.getDescription()});
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

        Jp_FormCate_TuanAnh = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LB_TuanAnh_FormName = new javax.swing.JLabel();
        Txt_TuanAnh_CatId = new javax.swing.JTextField();
        CatID = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Txt_TuanAnh_CatName = new javax.swing.JTextField();
        CatDesc = new javax.swing.JLabel();
        Txt_TuanAnh_Desc = new javax.swing.JTextField();
        EditCategory_TuanAnh = new javax.swing.JButton();
        AddBtn_TuanAnh = new javax.swing.JButton();
        ClearCategory_TuanAnh = new javax.swing.JButton();
        DeleteCategory_Tuananh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Category_table_Tuananh = new javax.swing.JTable();
        ProDuct_list_TuanAnh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 240));
        setUndecorated(true);

        Jp_FormCate_TuanAnh.setBackground(new java.awt.Color(255, 102, 0));
        Jp_FormCate_TuanAnh.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setRequestFocusEnabled(false);

        LB_TuanAnh_FormName.setBackground(new java.awt.Color(240, 240, 240));
        LB_TuanAnh_FormName.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        LB_TuanAnh_FormName.setForeground(new java.awt.Color(255, 102, 0));
        LB_TuanAnh_FormName.setText("MANAGE CATEGORIES");

        Txt_TuanAnh_CatId.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TuanAnh_CatId.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Txt_TuanAnh_CatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TuanAnh_CatIdActionPerformed(evt);
            }
        });

        CatID.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatID.setForeground(new java.awt.Color(255, 102, 0));
        CatID.setText("CATID");

        Name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 102, 0));
        Name.setText("NAME");

        Txt_TuanAnh_CatName.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TuanAnh_CatName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Txt_TuanAnh_CatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TuanAnh_CatNameActionPerformed(evt);
            }
        });

        CatDesc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        CatDesc.setForeground(new java.awt.Color(255, 102, 0));
        CatDesc.setText("DESCRIPTION");

        Txt_TuanAnh_Desc.setBackground(new java.awt.Color(255, 255, 255));
        Txt_TuanAnh_Desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Txt_TuanAnh_Desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_TuanAnh_DescActionPerformed(evt);
            }
        });

        EditCategory_TuanAnh.setBackground(new java.awt.Color(255, 255, 255));
        EditCategory_TuanAnh.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        EditCategory_TuanAnh.setForeground(new java.awt.Color(255, 102, 0));
        EditCategory_TuanAnh.setText("EDIT");
        EditCategory_TuanAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCategory_TuanAnhActionPerformed(evt);
            }
        });

        AddBtn_TuanAnh.setBackground(new java.awt.Color(255, 255, 255));
        AddBtn_TuanAnh.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn_TuanAnh.setForeground(new java.awt.Color(255, 102, 0));
        AddBtn_TuanAnh.setText("ADD");
        AddBtn_TuanAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtn_TuanAnhActionPerformed(evt);
            }
        });

        ClearCategory_TuanAnh.setBackground(new java.awt.Color(255, 255, 255));
        ClearCategory_TuanAnh.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ClearCategory_TuanAnh.setForeground(new java.awt.Color(255, 102, 0));
        ClearCategory_TuanAnh.setText("CLEAR");
        ClearCategory_TuanAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearCategory_TuanAnhActionPerformed(evt);
            }
        });

        DeleteCategory_Tuananh.setBackground(new java.awt.Color(255, 255, 255));
        DeleteCategory_Tuananh.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DeleteCategory_Tuananh.setForeground(new java.awt.Color(255, 102, 0));
        DeleteCategory_Tuananh.setText("DELETE");
        DeleteCategory_Tuananh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCategory_TuananhActionPerformed(evt);
            }
        });

        Category_table_Tuananh.setBackground(new java.awt.Color(255, 255, 255));
        Category_table_Tuananh.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Category_table_Tuananh.setForeground(new java.awt.Color(0, 0, 0));
        Category_table_Tuananh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NAME", "DESCRIPTION"
            }
        ));
        Category_table_Tuananh.setGridColor(new java.awt.Color(120, 120, 120));
        Category_table_Tuananh.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Category_table_Tuananh.setRowHeight(25);
        Category_table_Tuananh.setSelectionBackground(new java.awt.Color(255, 102, 0));
        Category_table_Tuananh.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Category_table_Tuananh.setShowGrid(true);
        jScrollPane1.setViewportView(Category_table_Tuananh);

        ProDuct_list_TuanAnh.setBackground(new java.awt.Color(240, 240, 240));
        ProDuct_list_TuanAnh.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        ProDuct_list_TuanAnh.setForeground(new java.awt.Color(255, 102, 0));
        ProDuct_list_TuanAnh.setText("PRODUCT LIST");
        ProDuct_list_TuanAnh.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(ProDuct_list_TuanAnh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(AddBtn_TuanAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(EditCategory_TuanAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(DeleteCategory_Tuananh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(ClearCategory_TuanAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(CatDesc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_TuanAnh_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LB_TuanAnh_FormName))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(CatID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Txt_TuanAnh_CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(Txt_TuanAnh_CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LB_TuanAnh_FormName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatID)
                    .addComponent(Txt_TuanAnh_CatId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name)
                    .addComponent(Txt_TuanAnh_CatName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CatDesc)
                    .addComponent(Txt_TuanAnh_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditCategory_TuanAnh)
                    .addComponent(ClearCategory_TuanAnh)
                    .addComponent(DeleteCategory_Tuananh)
                    .addComponent(AddBtn_TuanAnh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProDuct_list_TuanAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Jp_FormCate_TuanAnhLayout = new javax.swing.GroupLayout(Jp_FormCate_TuanAnh);
        Jp_FormCate_TuanAnh.setLayout(Jp_FormCate_TuanAnhLayout);
        Jp_FormCate_TuanAnhLayout.setHorizontalGroup(
            Jp_FormCate_TuanAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jp_FormCate_TuanAnhLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jp_FormCate_TuanAnhLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        Jp_FormCate_TuanAnhLayout.setVerticalGroup(
            Jp_FormCate_TuanAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jp_FormCate_TuanAnhLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jp_FormCate_TuanAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Jp_FormCate_TuanAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_TuanAnh_CatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TuanAnh_CatIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TuanAnh_CatIdActionPerformed

    private void Txt_TuanAnh_CatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TuanAnh_CatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TuanAnh_CatNameActionPerformed

    private void Txt_TuanAnh_DescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_TuanAnh_DescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_TuanAnh_DescActionPerformed

    private void ClearCategory_TuanAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearCategory_TuanAnhActionPerformed
        // TODO add your handling code here:
        Txt_TuanAnh_CatId.setText("");
        Txt_TuanAnh_CatName.setText("");
        Txt_TuanAnh_Desc.setText("");
    }                                        

    private void sellertableMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)Category_table_Tuananh.getModel();
        int myindex = Category_table_Tuananh.getSelectedRow();
        Txt_TuanAnh_CatId.setText(model.getValueAt(myindex, 0).toString());
        Txt_TuanAnh_CatName.setText(model.getValueAt(myindex, 1).toString());
        Txt_TuanAnh_Desc.setText(model.getValueAt(myindex, 2).toString());
    }//GEN-LAST:event_ClearCategory_TuanAnhActionPerformed

    private void AddBtn_TuanAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtn_TuanAnhActionPerformed
        if (Txt_TuanAnh_CatId.getText().equals("") || Txt_TuanAnh_CatName.getText().equals("") || Txt_TuanAnh_Desc.getText().equals("")  ) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
        } else {
            try {
                Ct.setIdcat(Txt_TuanAnh_CatId.getText());
                Ct.setName(Txt_TuanAnh_CatName.getText());

                Ct.setDescription(Txt_TuanAnh_Desc.getText());
                
              
                
                Clservice.addCategory(Ct);
                JOptionPane.showMessageDialog(this, "Thêm sinh viên thành công!");
            } catch (SQLException ex) {
                Logger.getLogger(Seler.class.getName()).log(Level.SEVERE, null, ex);
            }
        defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
        setTableData(Clservice.getAllCattegories());
        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        }
    }//GEN-LAST:event_AddBtn_TuanAnhActionPerformed

    private void EditCategory_TuanAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCategory_TuanAnhActionPerformed
         int row = Category_table_Tuananh.getSelectedRow();
        if (row == -1)//nguoi dung chua chon hang nao
        {
            JOptionPane.showMessageDialog(Categories.this, "Vui lòng chọn nhân viên cần sửa trước", "loi", JOptionPane.ERROR_MESSAGE);

        } else {
            int confirm = JOptionPane.showConfirmDialog(Categories.this, "Bạn chắc chắn muốn chỉnh sửa không?");
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String slId = String.valueOf(Category_table_Tuananh.getValueAt(row, 0));

                    Clservice.deleteSeller(slId);

                    defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
                    setTableData(Clservice.getAllCattegories());
                    //JOptionPane.showMessageDialog(this, "Xóa thành công!");
                } catch (SQLException ex) {
                    Logger.getLogger(Seler.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }
        if (Txt_TuanAnh_CatId.getText().equals("") || Txt_TuanAnh_CatName.getText().equals("") || Txt_TuanAnh_Desc.getText().equals("")  ) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin!");
        } else {
            try {
               Ct.setIdcat(Txt_TuanAnh_CatId.getText());
                Ct.setName(Txt_TuanAnh_CatName.getText());

                Ct.setDescription(Txt_TuanAnh_Desc.getText());
                
              
                
               Clservice.addCategory(Ct);
                JOptionPane.showMessageDialog(this, "cập nhật sinh viên thành công!");
            } catch (SQLException ex) {
                Logger.getLogger(Seler.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        
        
        
        defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
        setTableData(Clservice.getAllCattegories());
        
    }//GEN-LAST:event_EditCategory_TuanAnhActionPerformed

    private void DeleteCategory_TuananhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCategory_TuananhActionPerformed
        // TODO add your handling code here:
         int row = Category_table_Tuananh.getSelectedRow();
        if (row == -1)//nguoi dung chua chon hang nao
        {
            JOptionPane.showMessageDialog(Categories.this, "Vui lòng chọn nhân viên cần xóa trước", "loi", JOptionPane.ERROR_MESSAGE);

        } else {
            int confirm = JOptionPane.showConfirmDialog(Categories.this, "Bạn chắc chắn muốn xóa không?");
            if (confirm == JOptionPane.YES_OPTION) {

                try {
                    String slId = String.valueOf(Category_table_Tuananh.getValueAt(row, 0));

                    Clservice.deleteSeller(slId);

                    defaultTableModel.setRowCount(0);//de xoa het du lieu hien tai
                    setTableData(Clservice.getAllCattegories());
                    JOptionPane.showMessageDialog(this, "Xóa thành công!");
                } catch (SQLException ex) {
                    Logger.getLogger(Seler.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else 
                return ;

            

        }
    }//GEN-LAST:event_DeleteCategory_TuananhActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn_TuanAnh;
    private javax.swing.JLabel CatDesc;
    private javax.swing.JLabel CatID;
    private javax.swing.JTable Category_table_Tuananh;
    private javax.swing.JButton ClearCategory_TuanAnh;
    private javax.swing.JButton DeleteCategory_Tuananh;
    private javax.swing.JButton EditCategory_TuanAnh;
    private javax.swing.JPanel Jp_FormCate_TuanAnh;
    private javax.swing.JLabel LB_TuanAnh_FormName;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel ProDuct_list_TuanAnh;
    private javax.swing.JTextField Txt_TuanAnh_CatId;
    private javax.swing.JTextField Txt_TuanAnh_CatName;
    private javax.swing.JTextField Txt_TuanAnh_Desc;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
