/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import javax.swing.table.DefaultTableModel;
import model.Util;

/**
 *
 * @author andre
 */
public class TelaSubsequenciaMaisLonga extends javax.swing.JFrame {

    boolean stringX;
    boolean stringY;

    DefaultTableModel modeloTabela_Char;
    DefaultTableModel modeloTabela_Num;

    /**
     * Creates new form TelaSubsequenciaMaisLonga
     */
    public TelaSubsequenciaMaisLonga() {
        initComponents();
        modeloTabela_Char = new DefaultTableModel();
        table_Char.setEnabled(false);
        table_Char.getTableHeader().setReorderingAllowed(false);
        modeloTabela_Num = new DefaultTableModel();
        table_Num.setEnabled(false);
        table_Num.getTableHeader().setReorderingAllowed(false);
        button_Resolver.setEnabled(false);
        stringX = stringY = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_X = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_Y = new javax.swing.JTextArea();
        button_Resolver = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_Char = new javax.swing.JTable();
        textField_Resultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Num = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sequências"));

        txtArea_X.setColumns(20);
        txtArea_X.setRows(5);
        txtArea_X.setText("Buscando essa sequencia 1");
        txtArea_X.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtArea_XFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtArea_X);

        txtArea_Y.setColumns(20);
        txtArea_Y.setRows(5);
        txtArea_Y.setText("nesta sequência 2");
        txtArea_Y.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtArea_YFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtArea_Y);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        button_Resolver.setText("RESOLVER");
        button_Resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ResolverActionPerformed(evt);
            }
        });

        table_Char.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_Char.setEnabled(false);
        jScrollPane4.setViewportView(table_Char);

        textField_Resultado.setEditable(false);
        textField_Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_ResultadoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Subsequência mais longa encontrada:");

        table_Num.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table_Num.setEnabled(false);
        jScrollPane3.setViewportView(table_Num);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textField_Resultado))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_Resolver, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Resolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textField_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField_ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_ResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_ResultadoActionPerformed

    private void button_ResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ResolverActionPerformed
        // TODO add your handling code here:
        Controlador controlador = new Controlador();
        String X = txtArea_X.getText();
        String Y = txtArea_Y.getText();

        //gerar tabelas
        int tamanhoX = X.length() + 1;
        int tamanhoY = Y.length() + 1;
        char vetorX[] = new char[tamanhoX];
        char vetorY[] = new char[tamanhoY];

        vetorX = Util.stringToArray(X, tamanhoX, true);
        vetorY = Util.stringToArray(Y, tamanhoY, true);

        char B[][] = new char[tamanhoX][tamanhoY];
        int C[][] = new int[tamanhoX][tamanhoY];

        controlador.gerarTabelasSubsequencia(vetorX, vetorY, B, C);
        //exibir tabelas

        modeloTabela_Char.setColumnCount(0);
        modeloTabela_Char.setRowCount(0);
        modeloTabela_Num.setColumnCount(0);
        modeloTabela_Num.setRowCount(0);

        modeloTabela_Char.addColumn("");
        modeloTabela_Num.addColumn("");
        for (int i = 1; i < tamanhoY; i++) {
            modeloTabela_Char.addColumn(Y.charAt(i - 1));
            modeloTabela_Num.addColumn(Y.charAt(i - 1));
        }

        for (int i = 0; i < tamanhoX; i++) {
            Object linha_Char[] = new Object[tamanhoY];
            Object linha_Num[] = new Object[tamanhoY];
            for (int j = 0; j < tamanhoY; j++) {
                linha_Char[j] = B[i][j];
                linha_Num[j] = C[i][j];
            }
            modeloTabela_Char.addRow(linha_Char);
            modeloTabela_Num.addRow(linha_Num);
        }

        table_Char.setModel(modeloTabela_Char);
        table_Num.setModel(modeloTabela_Num);

        //solucionar o problema
        String sequenciaEncontrada = controlador.subsequenciaMaisLonga(B, vetorX, tamanhoX, tamanhoY);
        if(sequenciaEncontrada.isEmpty()) sequenciaEncontrada = "Não foi encontrado nenhum caractere da sequência 1 na sequência 2...";
        textField_Resultado.setText(sequenciaEncontrada);


    }//GEN-LAST:event_button_ResolverActionPerformed

    private void txtArea_XFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtArea_XFocusLost
        // TODO add your handling code here:
        if (!txtArea_X.getText().isEmpty()) {
            stringX = true;
        } else {
            stringX = false;
        }
        if (stringX == true && stringY == true) {
            button_Resolver.setEnabled(true);
        } else {
            button_Resolver.setEnabled(false);
        }
    }//GEN-LAST:event_txtArea_XFocusLost

    private void txtArea_YFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtArea_YFocusLost
        // TODO add your handling code here:
        if (!txtArea_Y.getText().isEmpty()) {
            stringY = true;
        } else {
            stringY = false;
        }
        if (stringX == true && stringY == true) {
            button_Resolver.setEnabled(true);
        } else {
            button_Resolver.setEnabled(false);
        }
    }//GEN-LAST:event_txtArea_YFocusLost

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
            java.util.logging.Logger.getLogger(TelaSubsequenciaMaisLonga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSubsequenciaMaisLonga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSubsequenciaMaisLonga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSubsequenciaMaisLonga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSubsequenciaMaisLonga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Resolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable table_Char;
    private javax.swing.JTable table_Num;
    private javax.swing.JTextField textField_Resultado;
    private javax.swing.JTextArea txtArea_X;
    private javax.swing.JTextArea txtArea_Y;
    // End of variables declaration//GEN-END:variables
}
