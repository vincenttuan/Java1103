/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_salety;

import food_salety.entity.Rice;
import food_salety.util.Service;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MB-teacher
 */
public class RiceJFrame extends javax.swing.JFrame {

    private Service service = new Service();
    
    public RiceJFrame() {
        initComponents();
        // 取得 Rice 資料表內的資料
        List<Rice> rices = service.queryRicesFromTable();
        showRiceTable(rices);
    }
    
    private void showRiceTable(List<Rice> rices) {
        // 清空 rice_table 的內容
        DefaultTableModel model = (DefaultTableModel)rice_table.getModel();
        model.setNumRows(0); // 清空
        
        // 逐筆將資料放入 rice_table 內
        for(Rice r : rices) {
            Object[] rowData = {r.getId(), r.get品名(), r.get檢驗結果(), r.get不合格原因(), r.get行政處分()};
            model.addRow(rowData);
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

        kw = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        importBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rice_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("市售米檢驗資料");

        kw.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        kw.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        searchBtn.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        searchBtn.setText("查詢");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        clearBtn.setText("清空");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        importBtn.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        importBtn.setText("匯入");
        importBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importBtnActionPerformed(evt);
            }
        });

        rice_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "品名", "檢驗結果", "不合格原因", "行政處分"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rice_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(kw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importBtn)
                    .addComponent(clearBtn))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // 清空 button
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        service.clearRiceTable();
        List<Rice> rices = service.queryRicesFromTable();
        showRiceTable(rices);
        if(rices.size() == 0) {
            JOptionPane.showMessageDialog(rootPane, "資料已清除");
        } else {
            JOptionPane.showMessageDialog(rootPane, "清除失敗");
        }
    }//GEN-LAST:event_clearBtnActionPerformed
    
    // 查詢 button
    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String keyword = kw.getText();
        List<Rice> rices = service.queryRicesFromTable(keyword);
        showRiceTable(rices);
    }//GEN-LAST:event_searchBtnActionPerformed
    
    // 匯入 button
    private void importBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importBtnActionPerformed
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        service.importToRiceTable(url);
        List<Rice> rices = service.queryRicesFromTable();
        showRiceTable(rices);
        if(rices.size() > 0) {
            JOptionPane.showMessageDialog(rootPane, "資料已匯入");
        } else {
            JOptionPane.showMessageDialog(rootPane, "匯入失敗或無資料可供匯入");
        }
    }//GEN-LAST:event_importBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiceJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiceJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton importBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kw;
    private javax.swing.JTable rice_table;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
