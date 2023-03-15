package com.mycompany.biblioteca.view;

import com.mycompany.biblioteca.controller.TelaPrincipalController;

public class TelaPrincipal extends javax.swing.JFrame {

    private TelaPrincipalController controller;

    public TelaPrincipal() {
        initComponents();
        controller = new TelaPrincipalController(this);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuEmprestimos = new javax.swing.JMenu();
        mniClientes = new javax.swing.JMenuItem();
        mniLivros = new javax.swing.JMenuItem();
        mniEmprestimos = new javax.swing.JMenuItem();
        mnuConfiguracoes = new javax.swing.JMenu();
        mniCategorias = new javax.swing.JMenuItem();
        mniFuncionarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca");

        mnuEmprestimos.setText("Empréstimos");
        mnuEmprestimos.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N

        mniClientes.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        mniClientes.setText("Clientes");
        mniClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClientesActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mniClientes);

        mniLivros.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        mniLivros.setText("Livros");
        mniLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLivrosActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mniLivros);

        mniEmprestimos.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        mniEmprestimos.setText("Empréstimos");
        mniEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEmprestimosActionPerformed(evt);
            }
        });
        mnuEmprestimos.add(mniEmprestimos);

        jMenuBar1.add(mnuEmprestimos);

        mnuConfiguracoes.setText("Configurações");
        mnuConfiguracoes.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N

        mniCategorias.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        mniCategorias.setText("Categorias");
        mniCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCategoriasActionPerformed(evt);
            }
        });
        mnuConfiguracoes.add(mniCategorias);

        mniFuncionarios.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        mniFuncionarios.setText("Funcionários");
        mniFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFuncionariosActionPerformed(evt);
            }
        });
        mnuConfiguracoes.add(mniFuncionarios);

        jMenuBar1.add(mnuConfiguracoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClientesActionPerformed
        controller.handleAction("mniClientes");
    }//GEN-LAST:event_mniClientesActionPerformed

    private void mniLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLivrosActionPerformed
        controller.handleAction("mniLivros");
    }//GEN-LAST:event_mniLivrosActionPerformed

    private void mniEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEmprestimosActionPerformed
        controller.handleAction("mniEmprestimos");
    }//GEN-LAST:event_mniEmprestimosActionPerformed

    private void mniCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCategoriasActionPerformed
        controller.handleAction("mniCategorias");
    }//GEN-LAST:event_mniCategoriasActionPerformed

    private void mniFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFuncionariosActionPerformed
        controller.handleAction("mniFuncionarios");
    }//GEN-LAST:event_mniFuncionariosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniCategorias;
    private javax.swing.JMenuItem mniClientes;
    private javax.swing.JMenuItem mniEmprestimos;
    private javax.swing.JMenuItem mniFuncionarios;
    private javax.swing.JMenuItem mniLivros;
    private javax.swing.JMenu mnuConfiguracoes;
    private javax.swing.JMenu mnuEmprestimos;
    // End of variables declaration//GEN-END:variables
}
