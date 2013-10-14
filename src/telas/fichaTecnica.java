/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Controller.cadastroController;
import controledeatletas.Futebolista;
import javax.swing.JOptionPane;

/**
 *
 * @author Kleber Moreira
 */
public class fichaTecnica extends javax.swing.JFrame {

    private telaCadastro telaAnterior;
    /**
     * Creates new form fichaTecnica
     */
    private fichaTecnica() {
        initComponents();
        
        setSize(1038, 536);
    }

    public fichaTecnica(telaCadastro telaAnterior)
    {
       this();
       
       this.telaAnterior = telaAnterior;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        tfClube = new javax.swing.JTextField();
        tfclubeAnterior = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacao = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESPECIFICAÇÃO TÉCNICA DO ATLETA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Principal deficiência:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 280, 150, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Principal atributo: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 200, 130, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Posição:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 120, 80, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clube:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 80, 80, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categoria: ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 40, 70, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Premiações:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(390, 360, 70, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Preço:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(540, 320, 80, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Clube anterior:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(540, 160, 110, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Liga:");
        jLabel12.setToolTipText("Informe o país em que atua");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(540, 240, 40, 17);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Observação:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(60, 360, 80, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Profissional", "Amador" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(170, 40, 100, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Goleiro", "Lateral", "Zagueiro", "Volante", "Meio campo", "Atacante" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(170, 120, 81, 20);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Técnica", "Habilidade", "Marcação", "Velocidade", "Força", "Finalização", "Cabeceio", "Assistência", "Elasticidade", "Salto" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(170, 200, 110, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marcação", "Habilidade", "Técnica", "Velocidade", "Força", "Finalização", "Cabeceio", "Assistência", "Elasticidade", "Salto" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(170, 280, 120, 20);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brasileira", "Inglesa", "Espanhola", "Alemã", "Italiana", "Argentina", "Turca", "Mexicana", "Chinesa", "Japonesa", "Russa", "Portuguesa", "Outra" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(640, 240, 100, 20);

        tfClube.setToolTipText("Digite o clube em que atua");
        tfClube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfClubeActionPerformed(evt);
            }
        });
        getContentPane().add(tfClube);
        tfClube.setBounds(640, 80, 310, 20);

        tfclubeAnterior.setToolTipText("Digite o clube anterior");
        getContentPane().add(tfclubeAnterior);
        tfclubeAnterior.setBounds(640, 160, 310, 20);

        tfPreco.setToolTipText("Digite o valor de mercado do atleta");
        getContentPane().add(tfPreco);
        tfPreco.setBounds(640, 320, 310, 20);

        taObservacao.setColumns(20);
        taObservacao.setRows(5);
        taObservacao.setToolTipText("Informe caso necessario alguma observação a respeito do atleta");
        jScrollPane1.setViewportView(taObservacao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 380, 240, 120);

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(620, 390, 60, 30);

        jButton6.setText("-");
        getContentPane().add(jButton6);
        jButton6.setBounds(620, 450, 60, 40);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setToolTipText("Informe as premiações individuais ganhas pelo atleta");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(376, 376, 240, 120);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(730, 430, 100, 40);

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar);
        btCancelar.setBounds(875, 430, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kleber Moreira\\Desktop\\Icons\\cristiano-ronaldo-vs-lionel-messi-hd-wallpapers-2012.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfClubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfClubeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfClubeActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:        
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
        
        String clube = tfClube.getText();
        String clubeAnterior = tfclubeAnterior.getText();
        String preco = tfPreco.getText();
        
        int Preco;
        
        try {
            Preco = Integer.parseInt(preco);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro. Informe o preço corretamente");
            return;
        }
        
        Futebolista soccer = new Futebolista(clube, clube, clubeAnterior, preco);
        
        cadastroController jogador = new cadastroController();
        
        jogador.cadastrarFicha(soccer);
        
        if(jogador.cadastrarFicha(soccer))
        {
            JOptionPane.showMessageDialog(this, "Cadastrado com sucesso");
            
            this.dispose();
        }
        
        else
            JOptionPane.showMessageDialog(this, "Erro. Faltando dados");
           
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        setEnabled(false);
        new Premiacao(this).setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        telaAnterior.setVisible(true);
        telaAnterior.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(fichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fichaTecnica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fichaTecnica().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea taObservacao;
    private javax.swing.JTextField tfClube;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfclubeAnterior;
    // End of variables declaration//GEN-END:variables

    private double DoubleparseDouble(String preco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}