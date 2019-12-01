/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Principal;

import Interfaces.Administrador.AdmAgenServ.OpAgenServicos;
import Interfaces.Administrador.AdmAluno.OpAlunos;
import Interfaces.Administrador.AdmEquipamentos.OpEquipamentos;
import Interfaces.Administrador.AdmFuncionario.OpFuncionarios;
import Interfaces.Administrador.AdmGastos.OpGastos;
import Interfaces.Administrador.AdmPagamentos.OpPagamentos;
import Interfaces.Administrador.AdmTurmas.OpTurma;
import Interfaces.Instrutor.InstAluno.OpAlunoExerc;
import Interfaces.Nutricionista.NutrAluno.OpAlunoAlim;
import static Interfaces.Principal.Login.funcionarioLogin;
import Interfaces.Visualizar.ViewEquipTurma;
import Interfaces.Visualizar.ViewFichaExercicio;
import Interfaces.Visualizar.ViewGastoMensal;
import Interfaces.Visualizar.ViewPagamentoMulta;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Marco Antônio
 */
public class MenuSelecao extends javax.swing.JFrame {

    
    String tipoFunc = "";
    
    /**
     * Creates new form AdminSelecao
     */
    public MenuSelecao(String tipoFunc) {
        this.tipoFunc = tipoFunc;
        initComponents();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        GerAlunos = new javax.swing.JMenuItem();
        GerAlunosInst = new javax.swing.JMenuItem();
        GerAlunosNutr = new javax.swing.JMenuItem();
        GerFuncionarios = new javax.swing.JMenuItem();
        GerTurmas = new javax.swing.JMenuItem();
        GerAgendServ = new javax.swing.JMenuItem();
        GerPagamentos = new javax.swing.JMenuItem();
        GerGastos = new javax.swing.JMenuItem();
        GerEquipamentos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        VisEquipTurma = new javax.swing.JMenuItem();
        VisFichaExercicio = new javax.swing.JMenuItem();
        VisGastoMensal = new javax.swing.JMenuItem();
        VisPagAtrasado = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(915, 685));
        setSize(new java.awt.Dimension(915, 685));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setPreferredSize(new java.awt.Dimension(124, 35));

        jMenu4.setText("   Inicio   ");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu1.setText("   Gerenciar   ");
        jMenu1.setMinimumSize(new java.awt.Dimension(63, 30));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        GerAlunos.setText("Alunos");
        GerAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerAlunosActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerAlunos);

        GerAlunosInst.setText("Alunos");
        GerAlunosInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerAlunosInstActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Instrutor"))
        jMenu1.add(GerAlunosInst);

        GerAlunosNutr.setText("Alunos");
        GerAlunosNutr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerAlunosNutrActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Nutricionista"))
        jMenu1.add(GerAlunosNutr);

        GerFuncionarios.setText("Funcionarios");
        GerFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerFuncionariosActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerFuncionarios);

        GerTurmas.setText("Turmas");
        GerTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerTurmasActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerTurmas);

        GerAgendServ.setText("Serviços");
        GerAgendServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerAgendServActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerAgendServ);

        GerPagamentos.setText("Pagamentos");
        GerPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerPagamentosActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerPagamentos);

        GerGastos.setText("Gastos");
        GerGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerGastosActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerGastos);

        GerEquipamentos.setText("Equipamentos");
        GerEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerEquipamentosActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu1.add(GerEquipamentos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("   Visualizar   ");

        VisEquipTurma.setText("Equipamentos por turma");
        VisEquipTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisEquipTurmaActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo") || this.tipoFunc.equals("Instrutor"))
        jMenu2.add(VisEquipTurma);

        VisFichaExercicio.setText("Ficha de exercícios");
        VisFichaExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisFichaExercicioActionPerformed(evt);
            }
        });
        jMenu2.add(VisFichaExercicio);

        VisGastoMensal.setText("Gastos mensais");
        VisGastoMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisGastoMensalActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu2.add(VisGastoMensal);

        VisPagAtrasado.setText("Pagamentos atrasados");
        VisPagAtrasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisPagAtrasadoActionPerformed(evt);
            }
        });
        if(this.tipoFunc.equals("Administrativo"))
        jMenu2.add(VisPagAtrasado);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("   Sair   ");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuBar1.add(Box.createHorizontalGlue());

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jMenu3.setHorizontalAlignment(SwingConstants.RIGHT);
        
        if(funcionarioLogin != null){
            if(funcionarioLogin.validarSenha("123456")){
                MudarSenha MS = new MudarSenha(funcionarioLogin, this);
                MS.setVisible(true);
                this.setEnabled(false);
            }
        }
        
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void GerAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerAlunosActionPerformed
        JPanel alunos = new OpAlunos();
       // alunos.setBackground(Color.white);        
        alunos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(alunos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
        
    }//GEN-LAST:event_GerAlunosActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        this.getContentPane().removeAll();
        this.getContentPane().validate();
        this.getContentPane().repaint();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void GerFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerFuncionariosActionPerformed
        JPanel funcionarios = new OpFuncionarios();
       // alunos.setBackground(Color.white);        
        funcionarios.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(funcionarios, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerFuncionariosActionPerformed

    private void GerTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerTurmasActionPerformed
        JPanel turmas = new OpTurma();
           
        turmas.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(turmas, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerTurmasActionPerformed

    private void GerAgendServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerAgendServActionPerformed
        JPanel agendamentos = new OpAgenServicos();
       // alunos.setBackground(Color.white);        
        agendamentos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(agendamentos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerAgendServActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void GerAlunosInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerAlunosInstActionPerformed
        JPanel alunos = new OpAlunoExerc();
       // alunos.setBackground(Color.white);        
        alunos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(alunos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerAlunosInstActionPerformed

    private void GerAlunosNutrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerAlunosNutrActionPerformed
        JPanel alunos = new OpAlunoAlim();
       // alunos.setBackground(Color.white);        
        alunos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(alunos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerAlunosNutrActionPerformed

    private void GerPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerPagamentosActionPerformed
        JPanel pagamentos = new OpPagamentos();
      
        pagamentos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(pagamentos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerPagamentosActionPerformed

    private void GerEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerEquipamentosActionPerformed
        JPanel equipamentos = new OpEquipamentos();
      
        equipamentos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(equipamentos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_GerEquipamentosActionPerformed

    private void VisEquipTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisEquipTurmaActionPerformed
        JPanel equipTurma = new ViewEquipTurma();
      
        equipTurma.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(equipTurma, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_VisEquipTurmaActionPerformed

    private void GerGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerGastosActionPerformed
        JPanel gastos = new OpGastos();
      
        gastos.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(gastos, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
        
        
    }//GEN-LAST:event_GerGastosActionPerformed

    private void VisGastoMensalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisGastoMensalActionPerformed
        JPanel gastoMensal = new ViewGastoMensal();
      
        gastoMensal.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(gastoMensal, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_VisGastoMensalActionPerformed

    private void VisPagAtrasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisPagAtrasadoActionPerformed
        JPanel pagamentosA = new ViewPagamentoMulta();
      
        pagamentosA.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(pagamentosA, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_VisPagAtrasadoActionPerformed

    private void VisFichaExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisFichaExercicioActionPerformed
        JPanel fichaExercicio = new ViewFichaExercicio();
      
        fichaExercicio.setBounds(0, 0, 900, 600);   
        
        this.getContentPane().removeAll();
        this.getContentPane().add(fichaExercicio, BorderLayout.CENTER);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();
        
        this.getContentPane().setVisible(true);
    }//GEN-LAST:event_VisFichaExercicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem GerAgendServ;
    private javax.swing.JMenuItem GerAlunos;
    private javax.swing.JMenuItem GerAlunosInst;
    private javax.swing.JMenuItem GerAlunosNutr;
    private javax.swing.JMenuItem GerEquipamentos;
    private javax.swing.JMenuItem GerFuncionarios;
    private javax.swing.JMenuItem GerGastos;
    private javax.swing.JMenuItem GerPagamentos;
    private javax.swing.JMenuItem GerTurmas;
    private javax.swing.JMenuItem VisEquipTurma;
    private javax.swing.JMenuItem VisFichaExercicio;
    private javax.swing.JMenuItem VisGastoMensal;
    private javax.swing.JMenuItem VisPagAtrasado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
