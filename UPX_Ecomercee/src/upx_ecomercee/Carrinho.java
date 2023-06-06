//Projeto UPX 3
//E-commerce - PixelPlace
package upx_ecomercee;

//Import
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Carrinho extends javax.swing.JFrame {

    //variavel
    int IDCLIENTE = 1;

    int IDPROD1;
    int IDPROD2;
    int IDPROD3;

    public Carrinho() {
        initComponents();

    }

    public Carrinho(int IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;
        Carrinho(IDCLIENTE);
    }

    @SuppressWarnings("unchecked")
    // -- JFrame NÃO ALTERE (objetos no geral) RECOMENDO QUE MINIMIZE --
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Prod2 = new javax.swing.JPanel();
        JLProd2 = new javax.swing.JLabel();
        JLValor2 = new javax.swing.JLabel();
        JBX2 = new javax.swing.JButton();
        JLQtd2 = new javax.swing.JLabel();
        Prod1 = new javax.swing.JPanel();
        JLProd1 = new javax.swing.JLabel();
        JLValor1 = new javax.swing.JLabel();
        JBX1 = new javax.swing.JButton();
        JLQtd1 = new javax.swing.JLabel();
        Prod3 = new javax.swing.JPanel();
        JLProd3 = new javax.swing.JLabel();
        JLValor3 = new javax.swing.JLabel();
        JBX3 = new javax.swing.JButton();
        JLQtd3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JbtnAtt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLCEPV = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TFCEP = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(965, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PixelPlace");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<  Carrinho de Compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Seu Carrinho");

        Prod2.setBackground(new java.awt.Color(255, 255, 255));
        Prod2.setVisible(false);

        JLProd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLProd2.setForeground(new java.awt.Color(0, 0, 0));
        JLProd2.setText("Camiseta");

        JLValor2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLValor2.setForeground(new java.awt.Color(0, 0, 0));
        JLValor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLValor2.setText("105$");

        JBX2.setFont(new java.awt.Font("Swis721 Blk BT", 0, 10)); // NOI18N
        JBX2.setText("X");
        JBX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBX2ActionPerformed(evt);
            }
        });

        JLQtd2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLQtd2.setForeground(new java.awt.Color(0, 0, 0));
        JLQtd2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLQtd2.setText("0");

        javax.swing.GroupLayout Prod2Layout = new javax.swing.GroupLayout(Prod2);
        Prod2.setLayout(Prod2Layout);
        Prod2Layout.setHorizontalGroup(
            Prod2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prod2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(JLProd2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLQtd2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBX2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        Prod2Layout.setVerticalGroup(
            Prod2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prod2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Prod2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLProd2)
                    .addComponent(JLValor2)
                    .addComponent(JBX2)
                    .addComponent(JLQtd2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Prod1.setBackground(new java.awt.Color(255, 255, 255));
        Prod1.setVisible(false);

        JLProd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLProd1.setForeground(new java.awt.Color(0, 0, 0));
        JLProd1.setText("Camiseta");

        JLValor1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLValor1.setForeground(new java.awt.Color(0, 0, 0));
        JLValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLValor1.setText("105s");

        JBX1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 10)); // NOI18N
        JBX1.setText("X");
        JBX1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBX1ActionPerformed(evt);
            }
        });

        JLQtd1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLQtd1.setForeground(new java.awt.Color(0, 0, 0));
        JLQtd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLQtd1.setText("0");

        javax.swing.GroupLayout Prod1Layout = new javax.swing.GroupLayout(Prod1);
        Prod1.setLayout(Prod1Layout);
        Prod1Layout.setHorizontalGroup(
            Prod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prod1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(JLProd1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLQtd1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBX1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        Prod1Layout.setVerticalGroup(
            Prod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prod1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(Prod1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLProd1)
                    .addComponent(JLValor1)
                    .addComponent(JBX1)
                    .addComponent(JLQtd1))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Prod3.setBackground(new java.awt.Color(255, 255, 255));
        Prod3.setVisible(false);

        JLProd3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLProd3.setForeground(new java.awt.Color(0, 0, 0));
        JLProd3.setText("Camiseta");

        JLValor3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLValor3.setForeground(new java.awt.Color(0, 0, 0));
        JLValor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLValor3.setText("105$");

        JBX3.setFont(new java.awt.Font("Swis721 Blk BT", 0, 10)); // NOI18N
        JBX3.setText("X");
        JBX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBX3ActionPerformed(evt);
            }
        });

        JLQtd3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLQtd3.setForeground(new java.awt.Color(0, 0, 0));
        JLQtd3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLQtd3.setText("0");

        javax.swing.GroupLayout Prod3Layout = new javax.swing.GroupLayout(Prod3);
        Prod3.setLayout(Prod3Layout);
        Prod3Layout.setHorizontalGroup(
            Prod3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prod3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(JLProd3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLQtd3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBX3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        Prod3Layout.setVerticalGroup(
            Prod3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prod3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Prod3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLProd3)
                    .addComponent(JLValor3)
                    .addComponent(JBX3)
                    .addComponent(JLQtd3))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Produto");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Valor");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Qntd.");

        JbtnAtt.setText("Atualizar");
        JbtnAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnAttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Prod1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Prod2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Prod3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(JbtnAtt)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(JbtnAtt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Prod2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Prod3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 590, 580));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirmar Compra ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("000$");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FRETE");

        JLCEPV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JLCEPV.setForeground(new java.awt.Color(0, 0, 0));
        JLCEPV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCEPV.setText("...");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CEP");

        TFCEP.setBackground(new java.awt.Color(255, 255, 255));
        TFCEP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFCEP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TFCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCEPActionPerformed(evt);
            }
        });
        TFCEP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFCEPKeyPressed(evt);
            }
        });

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLCEPV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TFCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(TFCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCEPV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCEPActionPerformed
        if (TFCEP.getText().equals("")) {
            JLCEPV.setText("...");
        } else {
            JLCEPV.setText("+15$");
        }
    }//GEN-LAST:event_TFCEPActionPerformed

    private void TFCEPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFCEPKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCEPKeyPressed

    private void JBX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBX3ActionPerformed
        Prod3.setVisible(false);
        JLQtd3.setText("0");
        JLValor3.setText("0");
    }//GEN-LAST:event_JBX3ActionPerformed

    //(Inicio)Botões de Cancelar compra
    private void JBX1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBX1ActionPerformed

        try {
            ExcluirProdutoDoCarrinho(IDPROD1, IDCLIENTE);

            if (JLQtd2.getText().equals("0")) {
                Prod1.setVisible(false);
                JLQtd1.setText("0");
                JLValor1.setText("0");
            } else {
                JLProd1.setText(JLProd2.getText());
                JLQtd1.setText(JLQtd2.getText());
                JLValor1.setText(JLValor2.getText());
                IDPROD1 = IDPROD2;
                if (JLQtd3.getText().equals("0")) {
                    Prod2.setVisible(false);
                    JLQtd2.setText("0");
                    JLValor2.setText("0");
                } else {
                    IDPROD2 = IDPROD3;
                    JLProd2.setText(JLProd3.getText());
                    JLQtd2.setText(JLQtd3.getText());
                    JLValor2.setText(JLValor3.getText());
                    Prod3.setVisible(false);
                    JLQtd3.setText("0");
                    JLValor3.setText("0");
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Carrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBX1ActionPerformed

    private void JBX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBX2ActionPerformed
        try {
            ExcluirProdutoDoCarrinho(IDPROD2, IDCLIENTE);
            if (JLQtd3.getText().equals("0")) {
                Prod2.setVisible(false);
                JLQtd2.setText("0");
                JLValor2.setText("0");
            } else {
                JLProd2.setText(JLProd3.getText());
                JLQtd2.setText(JLQtd3.getText());
                JLValor2.setText(JLValor3.getText());
                Prod3.setVisible(false);
                JLQtd3.setText("0");
                JLValor3.setText("0");
                IDPROD2 = IDPROD3;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Carrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JBX2ActionPerformed
    //(Fim)Botões de Cancelar compra

    public void Carrinho(int IDCLIENTE) {
        this.IDCLIENTE = IDCLIENTE;

        String selectCarrinho = "SELECT * FROM CARRINHO WHERE ID_CLIENTE = ?";
        try {
            Connection conn = DataBase.getConnection("ECOMMERCEDB", "root", "Gabriel@123");

            PreparedStatement stmt = conn.prepareStatement(selectCarrinho);
            stmt.setInt(1, 1);

            ResultSet rs = stmt.executeQuery();

            int i = 1;
            while (rs.next()) {
                int idItemCarrinho = rs.getInt("ID_CARRINHO");
                int quantidade = rs.getInt("QUANTIDADE");
                int idCliente = rs.getInt("ID_CLIENTE");
                int idProduto = rs.getInt("ID_PRODUTO");

                // Faça algo com os dados do item do carrinho
                System.out.println("ID do item do carrinho: " + idItemCarrinho);
                System.out.println("Quantidade: " + quantidade);
                System.out.println("ID do cliente: " + idCliente);
                System.out.println("ID do produto: " + idProduto);
                System.out.println("---------------------------");

                ProdCarrinho(idProduto, i, quantidade);
                i++;
            }

            // Fecha tudo
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void ProdCarrinho(int IDProd, int i, int qntd) throws ClassNotFoundException {
        String SelectProd = "SELECT * FROM PRODUTOS WHERE ID_PRODUTO = " + IDProd;

        try {
            Connection conn = DataBase.getConnection("ECOMMERCEDB", "root", "Gabriel@123");

            PreparedStatement stmt = conn.prepareStatement(SelectProd);

            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                int idProdutoResult = resultSet.getInt("ID_PRODUTO");
                String nome = resultSet.getString("NOME");
                double preco = resultSet.getDouble("PRECO");
                String imagem = resultSet.getString("IMAGEM");

                switch (i) {
                    case 1 -> {
                        JLProd1.setText(nome);
                        JLValor1.setText(Double.toString(preco));
                        JLQtd1.setText(Integer.toString(qntd));
                        Prod1.setVisible(true);
                        IDPROD1 = idProdutoResult;
                    }
                    case 2 -> {
                        JLProd2.setText(nome);
                        JLValor2.setText(Double.toString(preco));
                        JLQtd2.setText(Integer.toString(qntd));
                        Prod2.setVisible(true);
                        IDPROD2 = idProdutoResult;
                    }
                    case 3 -> {
                        JLProd3.setText(nome);
                        JLValor3.setText(Double.toString(preco));
                        JLQtd3.setText(Integer.toString(qntd));
                        Prod3.setVisible(true);
                        IDPROD3 = idProdutoResult;
                    }
                    default -> {
                        System.out.println("ERRO O USUARIO NÃO PODE TER MAIS DE 3 ITENS");
                    }
                }

                System.out.println("ID do Produto: " + idProdutoResult);
                System.out.println("Nome: " + nome);
                System.out.println("Preço: " + preco);
                System.out.println("Imagem: " + imagem);
                System.out.println("------------------------");
            } else {
                System.out.println("Nenhum produto encontrado com o ID: " + IDProd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!TFCEP.getText().isEmpty()) {
            double Total = 5;
            JLCEPV.setText("5$");
            Total =+ Integer.parseInt(JLValor1.getText());
            Total =+ Integer.parseInt(JLValor2.getText());
            Total =+ Integer.parseInt(JLValor3.getText());
        } else {
            JLCEPV.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JbtnAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnAttActionPerformed
        Carrinho(IDCLIENTE);
    }//GEN-LAST:event_JbtnAttActionPerformed

    public void ExcluirProdutoDoCarrinho(int idprod, int idClient) throws ClassNotFoundException {

        String deleteProdutoCarrinho = "DELETE FROM CARRINHO WHERE ID_CLIENTE = ? AND ID_PRODUTO = ?";

        try {
            Connection conn = DataBase.getConnection("ECOMMERCEDB", "root", "Gabriel@123");

            PreparedStatement stmt = conn.prepareStatement(deleteProdutoCarrinho);

            stmt.setInt(1, idClient);
            stmt.setInt(2, idprod);

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Produto removido do carrinho do cliente com sucesso!");
            } else {
                System.out.println("Nenhum produto foi removido do carrinho do cliente.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /* INICIO MAIN */
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
            java.util.logging.Logger.getLogger(Carrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBX1;
    private javax.swing.JButton JBX2;
    private javax.swing.JButton JBX3;
    private javax.swing.JLabel JLCEPV;
    private javax.swing.JLabel JLProd1;
    private javax.swing.JLabel JLProd2;
    private javax.swing.JLabel JLProd3;
    private javax.swing.JLabel JLQtd1;
    private javax.swing.JLabel JLQtd2;
    private javax.swing.JLabel JLQtd3;
    private javax.swing.JLabel JLValor1;
    private javax.swing.JLabel JLValor2;
    private javax.swing.JLabel JLValor3;
    private javax.swing.JButton JbtnAtt;
    private javax.swing.JPanel Prod1;
    private javax.swing.JPanel Prod2;
    private javax.swing.JPanel Prod3;
    private javax.swing.JTextField TFCEP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
