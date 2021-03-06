/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controlador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Util;

/**
 *
 * @author andre
 */
public class TelaAssociacaoDeTarefas extends javax.swing.JFrame {

    private int numTarefas;
    private int numPessoas;
    DefaultTableModel modeloTabela;
    DefaultTableModel modeloTabelaResultado;

    /**
     * Creates new form TelaAssociacaoDeTarefas
     */
    public TelaAssociacaoDeTarefas() {
        initComponents();

        modeloTabela = new DefaultTableModel();
        table_Geral.setEnabled(false);
        table_Geral.getTableHeader().setReorderingAllowed(false);

        modeloTabelaResultado = new DefaultTableModel();
        table_Resultado.setEnabled(false);
        table_Resultado.getTableHeader().setReorderingAllowed(false);

        numTarefas = 0;
        numPessoas = 0;
        button_Resolver.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        textField_Pessoa = new javax.swing.JTextField();
        button_Adicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Geral = new javax.swing.JTable();
        button_Resolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textField_Tarefa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Resultado = new javax.swing.JTable();

        jLabel2.setText("Número de pessoas");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pessoas"));

        jLabel3.setText("Nome");

        textField_Pessoa.setToolTipText("Nome da pessoa");
        textField_Pessoa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField_PessoaFocusLost(evt);
            }
        });
        textField_Pessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_PessoaActionPerformed(evt);
            }
        });

        button_Adicionar.setText("ADICIONAR");
        button_Adicionar.setToolTipText("Adicionar uma pessoa");
        button_Adicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_AdicionarMouseClicked(evt);
            }
        });
        button_Adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textField_Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_Adicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textField_Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Adicionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        table_Geral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table_Geral);

        button_Resolver.setText("RESOLVER");
        button_Resolver.setToolTipText("Resolver problema de Associação de Tarefas");
        button_Resolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ResolverActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarefas"));

        jLabel5.setText("Quantidade de tarefas");

        textField_Tarefa.setToolTipText("Quantidade de tarefas");
        textField_Tarefa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField_TarefaFocusLost(evt);
            }
        });
        textField_Tarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_TarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField_Tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textField_Tarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        table_Resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table_Resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(button_Resolver, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Resolver)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField_PessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_PessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_PessoaActionPerformed

    private void button_ResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ResolverActionPerformed
        // TODO add your handling code here:
        if (table_Geral.getRowCount() < table_Geral.getColumnCount() - 1) {
            JOptionPane.showMessageDialog(null, "Impossivel de resolver, número de pessoas MENOR que o número de tarefas.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            numPessoas = table_Geral.getRowCount();
            int matrizDoProblema[][] = new int[numPessoas][numTarefas];

            for (int i = 0; i < numTarefas; i++) {
                for (int j = 0; j < numPessoas; j++) {
                    matrizDoProblema[j][i] = (int) table_Geral.getValueAt(j, i + 1);
                }
            }

            modeloTabelaResultado.setColumnCount(0);
            modeloTabelaResultado.setRowCount(0);
            int aux[] = Controlador.associacaoDeTarefas(matrizDoProblema, numPessoas, numTarefas);
            int vetorSolucao[] = new int[numTarefas];

            System.arraycopy(aux, 0, vetorSolucao, 0, aux.length);

            Object linha[] = new Object[numTarefas];
            for (int i = 0; i < numTarefas; i++) {
                modeloTabelaResultado.addColumn("Tarefa " + (i + 1));
                linha[i] = table_Geral.getValueAt(vetorSolucao[i], 0);
            }
            modeloTabelaResultado.addRow(linha);
            table_Resultado.setModel(modeloTabelaResultado);

        }

    }//GEN-LAST:event_button_ResolverActionPerformed

    private void textField_TarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_TarefaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_TarefaActionPerformed

    private void textField_TarefaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_TarefaFocusLost
        // TODO add your handling code here:
        try {
            
            int resposta = 1;

            if (table_Geral.getColumnCount() > 0) {
                Object[] options = {"Cancelar", "Confirmar"};
                resposta = JOptionPane.showOptionDialog(null, "Atenção! Caso queira continuar, todos os dados inseridos serão perdidos e a tabela sera resetada.", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            }
            
            if (resposta == 1) {
                if (Integer.parseInt(textField_Tarefa.getText()) > 0) {
                    button_Resolver.setEnabled(false);
                    numTarefas = Integer.parseInt(textField_Tarefa.getText());

                    modeloTabela.setColumnCount(0);
                    modeloTabela.setRowCount(0);

                    modeloTabela.addColumn("");
                    for (int i = 1; i <= numTarefas; i++) {
                        String titulo = "Tarefa " + i;
                        modeloTabela.addColumn(titulo);
                    }

                    table_Geral.setModel(modeloTabela);

                } else {
                    JOptionPane.showMessageDialog(null, "Número de tarefas deve ser um valor maior do que zero", "Erro", JOptionPane.ERROR_MESSAGE);
                    textField_Tarefa.setText("");
                }
            }else{
                textField_Tarefa.setText(Integer.toString(table_Geral.getColumnCount()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor informe a quantidade de tarefas!", "ERRO", JOptionPane.ERROR_MESSAGE);
            textField_Tarefa.setText("");
            button_Resolver.setEnabled(false);
        }
    }//GEN-LAST:event_textField_TarefaFocusLost

    private void button_AdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_AdicionarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_button_AdicionarMouseClicked

    private void button_AdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AdicionarActionPerformed
        // TODO add your handling code here:

        String nome = textField_Pessoa.getText();
        if (nome.equals("") || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o nome da pessoa.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else if (!Util.isAlpha(nome)) {
            JOptionPane.showMessageDialog(null, "Nome deve possuir apenas letras!", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {

            boolean adicionarLinha = true;
            int vetorPerformance[] = new int[numTarefas];

            Object linha[] = new Object[numTarefas + 1];
            linha[0] = nome;
            String aux;
            for (int i = 0; i < numTarefas; i++) {
                aux = JOptionPane.showInputDialog(null, ("Qual a performance de " + nome + " na tarefa " + (i + 1) + "?"), "Valor da performance", JOptionPane.QUESTION_MESSAGE);
                if (aux == null) {
                    adicionarLinha = false;
                    break;
                } else if (aux.isEmpty() || !Util.isNumeric(aux)) {
                    adicionarLinha = false;
                    JOptionPane.showMessageDialog(null, "Insira um valor mair que 0!", "Erro", JOptionPane.ERROR_MESSAGE);
                    i--;
                    continue;
                }

                if ((vetorPerformance[i] = Integer.parseInt(aux)) > 0) {
                    linha[i + 1] = vetorPerformance[i];
                } else {
                    JOptionPane.showMessageDialog(null, "Insira um valor mair que 0!", "Erro", JOptionPane.ERROR_MESSAGE);
                    i--;
                }
            }

            if (adicionarLinha) {
                modeloTabela.addRow(linha);
            }
            if (table_Geral.getRowCount() > 0) {
                button_Resolver.setEnabled(true);
            } else {
                button_Resolver.setEnabled(false);
            }

            textField_Pessoa.setText("");
            textField_Pessoa.setText("");
        }
    }//GEN-LAST:event_button_AdicionarActionPerformed

    private void textField_PessoaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textField_PessoaFocusLost
        // TODO add your handling code here
    }//GEN-LAST:event_textField_PessoaFocusLost

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
            java.util.logging.Logger.getLogger(TelaAssociacaoDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAssociacaoDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAssociacaoDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAssociacaoDeTarefas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAssociacaoDeTarefas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Adicionar;
    private javax.swing.JButton button_Resolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable table_Geral;
    private javax.swing.JTable table_Resultado;
    private javax.swing.JTextField textField_Pessoa;
    private javax.swing.JTextField textField_Tarefa;
    // End of variables declaration//GEN-END:variables
}
