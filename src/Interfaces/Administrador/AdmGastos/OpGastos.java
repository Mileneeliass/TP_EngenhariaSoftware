/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Administrador.AdmGastos;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetos.Funcionario;
import objetos.Gastos;
import objetos_dao.FuncionarioDAO;
import objetos_dao.GastosDAO;

/**
 *
 * @author Marco Antônio
 */
public class OpGastos extends javax.swing.JPanel {

    /**
     * Creates new form temp
     */
    
    GastosDAO gastoBanco = new GastosDAO();
    public static int indice = -1;
    
    public OpGastos() {
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

        TelaFunc = new javax.swing.JTabbedPane();
        AbaAgenServ = new javax.swing.JPanel();
        ValorLabel = new javax.swing.JLabel();
        cpfgast = new javax.swing.JLabel();
        desclabel = new javax.swing.JLabel();
        Datalabel = new javax.swing.JLabel();
        labelcpf = new javax.swing.JLabel();
        dataGast = new javax.swing.JLabel();
        descGast = new javax.swing.JLabel();
        valorGast = new javax.swing.JLabel();
        AbaCadAgenServ = new javax.swing.JPanel();
        CpfCadAgenGast = new javax.swing.JLabel();
        comboCpf = new javax.swing.JComboBox<>();
        labeldesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoCadGast = new javax.swing.JTextArea();
        calendarioCadGast = new com.toedter.calendar.JCalendar();
        CadastrarAgenGast = new javax.swing.JButton();
        ExcluirAgenGast = new javax.swing.JButton();
        ValorCadGast = new javax.swing.JLabel();
        valorCadGast = new javax.swing.JFormattedTextField();
        TabelaPesquisaAgenServ = new javax.swing.JPanel();
        PesquisarAgenGast = new javax.swing.JButton();
        pesquisarAgenGast = new javax.swing.JTextField();
        ScrollTabelaAgenServ = new javax.swing.JScrollPane();
        TabelaGasto = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        TelaFunc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        AbaAgenServ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ValorLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ValorLabel.setText("Valor:");

        cpfgast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        desclabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        desclabel.setText("Descrição:");

        Datalabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Datalabel.setText("Data:");

        labelcpf.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        labelcpf.setText("CPF:");

        dataGast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        descGast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        valorGast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout AbaAgenServLayout = new javax.swing.GroupLayout(AbaAgenServ);
        AbaAgenServ.setLayout(AbaAgenServLayout);
        AbaAgenServLayout.setHorizontalGroup(
            AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaAgenServLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaAgenServLayout.createSequentialGroup()
                        .addComponent(labelcpf)
                        .addGap(18, 18, 18)
                        .addComponent(cpfgast, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(descGast, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AbaAgenServLayout.createSequentialGroup()
                        .addComponent(Datalabel)
                        .addGap(18, 18, 18)
                        .addComponent(dataGast, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ValorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorGast, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(desclabel))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        AbaAgenServLayout.setVerticalGroup(
            AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaAgenServLayout.createSequentialGroup()
                .addGroup(AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaAgenServLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelcpf))
                    .addGroup(AbaAgenServLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(cpfgast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Datalabel)
                        .addComponent(dataGast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AbaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ValorLabel)
                        .addComponent(valorGast, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(desclabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descGast, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TelaFunc.addTab("Serviços", AbaAgenServ);

        AbaCadAgenServ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CpfCadAgenGast.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CpfCadAgenGast.setText("CPF:");

        comboCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCpfMouseClicked(evt);
            }
        });

        labeldesc.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        labeldesc.setText("Descrição:");

        descricaoCadGast.setColumns(20);
        descricaoCadGast.setRows(5);
        descricaoCadGast.setWrapStyleWord(true);
        descricaoCadGast.setLineWrap(true);
        jScrollPane1.setViewportView(descricaoCadGast);

        calendarioCadGast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        calendarioCadGast.setWeekOfYearVisible(false);
        calendarioCadGast.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calendarioCadGastPropertyChange(evt);
            }
        });

        CadastrarAgenGast.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CadastrarAgenGast.setText("Cadastrar");
        CadastrarAgenGast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAgenGastActionPerformed(evt);
            }
        });

        ExcluirAgenGast.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ExcluirAgenGast.setText("Excluir");
        ExcluirAgenGast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirAgenGastActionPerformed(evt);
            }
        });

        ValorCadGast.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ValorCadGast.setText("Valor:");

        valorCadGast.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout AbaCadAgenServLayout = new javax.swing.GroupLayout(AbaCadAgenServ);
        AbaCadAgenServ.setLayout(AbaCadAgenServLayout);
        AbaCadAgenServLayout.setHorizontalGroup(
            AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaCadAgenServLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labeldesc)
                    .addComponent(CpfCadAgenGast)
                    .addComponent(ValorCadGast))
                .addGap(18, 18, 18)
                .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCadGast, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calendarioCadGast, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExcluirAgenGast, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CadastrarAgenGast, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        AbaCadAgenServLayout.setVerticalGroup(
            AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaCadAgenServLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(CadastrarAgenGast)
                .addGap(102, 102, 102)
                .addComponent(ExcluirAgenGast)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbaCadAgenServLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaCadAgenServLayout.createSequentialGroup()
                        .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CpfCadAgenGast)
                            .addComponent(comboCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ValorCadGast)
                            .addComponent(valorCadGast, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(AbaCadAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeldesc)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(calendarioCadGast, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TelaFunc.addTab("Controle", AbaCadAgenServ);

        TabelaPesquisaAgenServ.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PesquisarAgenGast.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        PesquisarAgenGast.setText("Pesquisar");
        PesquisarAgenGast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarAgenGastActionPerformed(evt);
            }
        });

        pesquisarAgenGast.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pesquisarAgenGast.setPreferredSize(new java.awt.Dimension(74, 32));

        TabelaGasto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TabelaGasto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TabelaGasto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Descrição", "Data", "CPF", "Valor", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaGasto.setToolTipText("");
        TabelaGasto.setAlignmentX(1.0F);
        TabelaGasto.setAlignmentY(1.0F);
        TabelaGasto.setRowHeight(28);
        TabelaGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaGastoMouseClicked(evt);
            }
        });
        ScrollTabelaAgenServ.setViewportView(TabelaGasto);

        btnLimpar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TabelaPesquisaAgenServLayout = new javax.swing.GroupLayout(TabelaPesquisaAgenServ);
        TabelaPesquisaAgenServ.setLayout(TabelaPesquisaAgenServLayout);
        TabelaPesquisaAgenServLayout.setHorizontalGroup(
            TabelaPesquisaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaPesquisaAgenServLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PesquisarAgenGast)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarAgenGast, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TabelaPesquisaAgenServLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ScrollTabelaAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TabelaPesquisaAgenServLayout.setVerticalGroup(
            TabelaPesquisaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TabelaPesquisaAgenServLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TabelaPesquisaAgenServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisarAgenGast)
                    .addComponent(pesquisarAgenGast, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollTabelaAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Titulo.setFont(new java.awt.Font("Impact", 0, 30)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Gerenciar Gastos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TabelaPesquisaAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TelaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TabelaPesquisaAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCpfMouseClicked
        //         if(comboSolicitadorCadServico.getSelectedItem() != null)
        //            System.out.println(comboSolicitadorCadServico.getSelectedItem().toString().split("\\|")[1]);
    }//GEN-LAST:event_comboCpfMouseClicked

    private void calendarioCadGastPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calendarioCadGastPropertyChange

    }//GEN-LAST:event_calendarioCadGastPropertyChange

    private void CadastrarAgenGastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAgenGastActionPerformed

        try {

            boolean i = true;
            Gastos tempGast = new Gastos();

            if( comboCpf.getSelectedItem() == null ||
                descricaoCadGast.getText().isBlank() ||
                calendarioCadGast.getDate() == null ||
                valorCadGast.getValue().toString().isBlank())
                throw new Exception("Preencha todos os campos corretamente");

            tempGast.setFuncionario(new FuncionarioDAO().getFuncionario(((Funcionario)comboCpf.getSelectedItem()).getCPF()));

            //LocalTime t = LocalTime.parse(comboHoraCadServico.getSelectedItem().toString());
            //Calendar cal = Calendar.getInstance();
            // cal.setTimeInMillis(calendarioCadGast.getDate().getTime());
            // cal.set(Calendar.HOUR_OF_DAY, t.getHour());
            //cal.set(Calendar.MINUTE, t.getMinute());
            //cal.set(Calendar.SECOND, t.getSecond());
            //cal.set(Calendar.MILLISECOND, t.getNano());

            tempGast.setData(new Date (calendarioCadGast.getDate().getTime()));
            tempGast.setDescricao(descricaoCadGast.getText());
            tempGast.setValor(Float.valueOf(valorCadGast.getValue().toString()));

            gastoBanco.adiciona(tempGast);
            AtualizaTabela();

            JOptionPane.showMessageDialog(null, "Gasto registrado com sucesso!");
            Limpar();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            Logger.getLogger(OpGastos.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_CadastrarAgenGastActionPerformed

    private void ExcluirAgenGastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirAgenGastActionPerformed
        indice = TabelaGasto.getSelectedRow();
        Gastos gasto = new Gastos();

        try{
            int chaveGast= (int) TabelaGasto.getValueAt(indice, 4);
            gasto=gastoBanco.getGasto(chaveGast);
            gastoBanco.remove(gasto);
            AtualizaTabela();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o gasto");
            indice = -1;
        }
    }//GEN-LAST:event_ExcluirAgenGastActionPerformed

    private void PesquisarAgenGastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarAgenGastActionPerformed
        try {
            // Botão Pesquisar Funcionário

            DefaultTableModel TF = (DefaultTableModel) TabelaGasto.getModel();
            TF.setNumRows(0);

            ArrayList<Gastos> gastos = gastoBanco.getGastos(pesquisarAgenGast.getText());

            for (Gastos g : gastos) {
                if(g.getFuncionario().getCPF().contains(pesquisarAgenGast.getText()))
                TF.addRow(new Object[]{
                    g.getDescricao(),
                    g.getData(),
                    g.getFuncionario().getCPF(),
                    g.getValor(),
                    g.getId()
                });

            }
        } catch (Exception ex) {
            Logger.getLogger(OpGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PesquisarAgenGastActionPerformed

    private void TabelaGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaGastoMouseClicked
        indice = TabelaGasto.getSelectedRow();

        try {
            Gastos gasto =  gastoBanco.getGasto((int) TabelaGasto.getValueAt(indice, 4));
            if (indice >= 0 && gasto != null) {                

                dataGast.setText(new SimpleDateFormat("dd/MM/yyyy").format(gasto.getData()));
                cpfgast.setText(gasto.getFuncionario().getCPF());
                valorGast.setText("R$ "+Float.toString(gasto.getValor()));
                descGast.setText(gasto.getDescricao());
                
                //Controle
                calendarioCadGast.setDate(gasto.getData());
                comboCpf.setSelectedItem(gasto.getFuncionario());
                valorCadGast.setText(Float.toString(gasto.getValor()));
                descricaoCadGast.setText(gasto.getDescricao());

                CadastrarAgenGast.setEnabled(false);
                ExcluirAgenGast.setEnabled(true);

            } else {

                JOptionPane.showMessageDialog(null, "Selecione o Gasto na Tabela!!!");
                indice = -1;
            }

        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Selecione um Gasto Valido!!!");
            indice = -1;
        } catch (Exception ex) {
            Logger.getLogger(OpGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TabelaGastoMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        Limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        try {
            comboCpf.addItem(null);
            for(Funcionario f : new FuncionarioDAO().getLista()){
                comboCpf.addItem(f);
            }

            //        DefaultListSelectionModel model = new DefaultListSelectionModel();
            //        model.addSelectionInterval(0, 3);
            //        model.addSelectionInterval(6, 6);
            //        EnabledJComboBoxRenderer enableRenderer = new EnabledJComboBoxRenderer(model);
            //        comboHoraCadServico.setRenderer(enableRenderer);

            Limpar();
        } catch (Exception ex) {
            Logger.getLogger(OpGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formAncestorAdded

    public void AtualizaTabela() {

        try {
            DefaultTableModel TF = (DefaultTableModel) TabelaGasto.getModel();
            TF.setNumRows(0);
            
            ArrayList<Gastos> gastos = gastoBanco.getLista();
            
            for (int i = 0; i <gastos.size(); i++) {
                
                TF.addRow(new Object[]{
                    gastos.get(i).getDescricao(),
                    new SimpleDateFormat("dd/MM/yyyy").format(gastos.get(i).getData()),
                    gastos.get(i).getFuncionario().getCPF(),
                    "R$ " + gastos.get(i).getValor(),
                    gastos.get(i).getId()   });
            }
        } catch (Exception ex) {
            Logger.getLogger(OpGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Limpar(){
        

                calendarioCadGast.setDate(new java.util.Date());
                comboCpf.setSelectedItem(null);
                valorCadGast.setText("");
                descricaoCadGast.setText(""); 
                
                dataGast.setText("");
                cpfgast.setText("");
                valorGast.setText("");
                descGast.setText("");  
                
                CadastrarAgenGast.setEnabled(true);
                AtualizaTabela();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbaAgenServ;
    private javax.swing.JPanel AbaCadAgenServ;
    private javax.swing.JButton CadastrarAgenGast;
    private javax.swing.JLabel CpfCadAgenGast;
    private javax.swing.JLabel Datalabel;
    private javax.swing.JButton ExcluirAgenGast;
    private javax.swing.JButton PesquisarAgenGast;
    private javax.swing.JScrollPane ScrollTabelaAgenServ;
    private javax.swing.JTable TabelaGasto;
    private javax.swing.JPanel TabelaPesquisaAgenServ;
    private javax.swing.JTabbedPane TelaFunc;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel ValorCadGast;
    private javax.swing.JLabel ValorLabel;
    private javax.swing.JButton btnLimpar;
    private com.toedter.calendar.JCalendar calendarioCadGast;
    private javax.swing.JComboBox<Funcionario> comboCpf;
    private javax.swing.JLabel cpfgast;
    private javax.swing.JLabel dataGast;
    private javax.swing.JLabel descGast;
    private javax.swing.JLabel desclabel;
    private javax.swing.JTextArea descricaoCadGast;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelcpf;
    private javax.swing.JLabel labeldesc;
    private javax.swing.JTextField pesquisarAgenGast;
    private javax.swing.JFormattedTextField valorCadGast;
    private javax.swing.JLabel valorGast;
    // End of variables declaration//GEN-END:variables
}
