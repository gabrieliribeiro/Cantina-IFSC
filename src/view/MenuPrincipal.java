/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
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
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFornecedor = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemBairro = new javax.swing.JMenuItem();
        jMenuItemCidade = new javax.swing.JMenuItem();
        jMenuItemEndereco = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCarteirinha = new javax.swing.JMenuItem();
        jMenuItemProduto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMovimentos = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(703, 507));
        setMinimumSize(new java.awt.Dimension(703, 507));

        jPanel1.setBackground(new java.awt.Color(184, 171, 149));

        jLabel1.setBackground(new java.awt.Color(164, 137, 91));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icones/LogoMenu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuCadastros.setText("Cadastros");

        jMenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCliente);

        jMenuItemFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItemFornecedor.setText("Fornecedor");
        jMenuItemFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFornecedor);

        jMenuItemFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFuncionario);
        jMenuCadastros.add(jSeparator1);

        jMenuItemBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemBairro.setText("Bairro");
        jMenuItemBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBairroActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemBairro);

        jMenuItemCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItemCidade.setText("Cidade");
        jMenuItemCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCidadeActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCidade);

        jMenuItemEndereco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItemEndereco.setText("Endereço");
        jMenuItemEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEnderecoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemEndereco);
        jMenuCadastros.add(jSeparator2);

        jMenuItemCarteirinha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItemCarteirinha.setText("Carteirinha");
        jMenuItemCarteirinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCarteirinhaActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemCarteirinha);

        jMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jMenuItemProduto.setText("Produto");
        jMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProduto);
        jMenuCadastros.add(jSeparator3);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_END, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.setName(""); // NOI18N
        jMenuCadastros.add(jMenuItemSair);

        jMenuBar1.add(jMenuCadastros);

        jMenuMovimentos.setText("Movimentos");

        jMenu1.setText("Contas");

        jMenuItem9.setText("jMenuItem9");
        jMenu1.add(jMenuItem9);

        jMenuMovimentos.add(jMenu1);

        jMenuBar1.add(jMenuMovimentos);

        jMenuRelatorios.setText("Relatórios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");
        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedorActionPerformed
        // TODO add your handling code here:
        CadastroFornecedor cadastroFornecedor = new CadastroFornecedor();
        
        //inserir a classe do controller
        cadastroFornecedor.setVisible(true);

    }//GEN-LAST:event_jMenuItemFornecedorActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        CadastroCliente cadastroCliente = new CadastroCliente();
        
        //inserir a classe do controller
        cadastroCliente.setVisible(true);

    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBairroActionPerformed
        // TODO add your handling code here:
        CadastroBairro cadastroBairro = new CadastroBairro();
        
        //inserir a classe do controller
        cadastroBairro.setVisible(true);
        
      
    }//GEN-LAST:event_jMenuItemBairroActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
        
        //inserir a classe do controller
        cadastroFuncionario.setVisible(true);

    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCidadeActionPerformed
        // TODO add your handling code here:
        CadastroCidade cadastroCidade = new CadastroCidade();
        
        //inserir a classe do controller
        cadastroCidade.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemCidadeActionPerformed

    private void jMenuItemEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnderecoActionPerformed
        // TODO add your handling code here:
        CadastroEndereco cadastroEndereco = new CadastroEndereco();
        
        //inserir a classe do controller
        cadastroEndereco.setVisible(true);
    }//GEN-LAST:event_jMenuItemEnderecoActionPerformed

    private void jMenuItemCarteirinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarteirinhaActionPerformed
        // TODO add your handling code here:
        CadastroCarteirinha cadastroCarteirinha = new CadastroCarteirinha();
        
        //inserir a classe do controller
        cadastroCarteirinha.setVisible(true);
    }//GEN-LAST:event_jMenuItemCarteirinhaActionPerformed

    private void jMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutoActionPerformed
        // TODO add your handling code here:
        CadastroProduto cadastroProduto = new CadastroProduto();
        
        //inserir a classe do controller
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemBairro;
    private javax.swing.JMenuItem jMenuItemCarteirinha;
    private javax.swing.JMenuItem jMenuItemCidade;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemEndereco;
    private javax.swing.JMenuItem jMenuItemFornecedor;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemProduto;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuMovimentos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
