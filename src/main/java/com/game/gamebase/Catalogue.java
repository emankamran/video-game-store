package com.game.gamebase;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;



public final class Catalogue extends javax.swing.JFrame{
 
    public Catalogue(){
    initComponents();
//    insert_photos();
Quantity4.setVisible(false);
 buy4.setVisible(false);
 returngame4.setVisible(false);
 save4.setVisible(false);
      displaygames();
      no_of_products();
   
                

    }
   
    
     @SuppressWarnings("unchecked")
    
    public  void displaygames(){
        
                
     String sql = "SELECT gametitle,gamedescription,platform,to_char (price,'$9,999.00'),publisher FROM VIDEOGAME_T";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                String game_title = rs.getString (1);
                String game_desc = rs.getString (2);
                String game_platform = rs.getString (3);
                String game_price = rs.getString (4);
                String game_publisher = rs.getString (5);
                 display_gameimg1();
                
                GTitle.setText(game_title);
                GDesc.setText(game_desc);
                GPlatform.setText(game_platform);
                GPrice.setText(game_price);
                GPublisher.setText(game_publisher);
                
      }
        if (rs.next()){
             String game_title = rs.getString (1);
                String game_desc = rs.getString (2);
                String game_platform = rs.getString (3);
                String game_price = rs.getString (4);
                String game_publisher = rs.getString (5);
                display_gameimg2();
                
                GTitle1.setText(game_title);
                GDesc1.setText(game_desc);
                GPlatform1.setText(game_platform);
                GPrice1.setText(game_price);
                GPublisher1.setText(game_publisher);
            
        }  if (rs.next()){
             String game_title = rs.getString (1);
                String game_desc = rs.getString (2);
                String game_platform = rs.getString (3);
                String game_price = rs.getString (4);
                String game_publisher = rs.getString (5);
                display_gameimg3();
                
                GTitle2.setText(game_title);
                GDesc2.setText(game_desc);
                GPlatform2.setText(game_platform);
                GPrice2.setText(game_price);
                GPublisher2.setText(game_publisher);
            
        }   if (rs.next()){
             String game_title = rs.getString (1);
                String game_desc = rs.getString (2);
                String game_platform = rs.getString (3);
                String game_price = rs.getString (4);
                String game_publisher = rs.getString (5);
                display_gameimg4();
                
                GTitle3.setText(game_title);
                GDesc3.setText(game_desc);
                GPlatform3.setText(game_platform);
                GPrice3.setText(game_price);
                GPublisher3.setText(game_publisher);
            
        }  
        if (rs.next()){
             String game_title = rs.getString (1);
                String game_desc = rs.getString (2);
                String game_platform = rs.getString (3);
                String game_price = rs.getString (4);
                String game_publisher = rs.getString (5);
                display_gameimg5();
                
                GTitle4.setText(game_title);
                G1.setText("Game Title :");
                GDesc4.setText(game_desc);
                G2.setText("Publisher :");
                G3.setText("Platform :");
                G4.setText("Price :");
                G5.setText("Select Quantity :");
                G6.setText("Description :");
                buy4.setVisible(true);
                  returngame4.setVisible(true);
                    save4.setVisible(true);
                Quantity4.setVisible(true);
                GPlatform4.setText(game_platform);
                GPrice4.setText(game_price);
                GPublisher4.setText(game_publisher);
            
        }  
        
      
        
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        GTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GPlatform = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        GPublisher = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        GPrice = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Quantity = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        GDesc = new javax.swing.JLabel();
        GImg2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        GTitle1 = new javax.swing.JLabel();
        GPlatform1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        GPublisher1 = new javax.swing.JLabel();
        GPrice1 = new javax.swing.JLabel();
        GDesc1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        GTitle2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        GPlatform2 = new javax.swing.JLabel();
        GPublisher2 = new javax.swing.JLabel();
        GImg3 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        GPrice2 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        GDesc2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        GImg4 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        GTitle3 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        GPlatform3 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        GPublisher3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        GPrice3 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        GDesc3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Quantity1 = new javax.swing.JSpinner();
        Quantity2 = new javax.swing.JSpinner();
        Quantity3 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buy = new javax.swing.JButton();
        returngame = new javax.swing.JButton();
        save = new javax.swing.JButton();
        buy1 = new javax.swing.JButton();
        returngame1 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        save2 = new javax.swing.JButton();
        buy2 = new javax.swing.JButton();
        save3 = new javax.swing.JButton();
        buy3 = new javax.swing.JButton();
        returngame3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        GImg5 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        GPrice4 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        G5 = new javax.swing.JLabel();
        G6 = new javax.swing.JLabel();
        GTitle4 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();
        GPlatform4 = new javax.swing.JLabel();
        GPublisher4 = new javax.swing.JLabel();
        Quantity4 = new javax.swing.JSpinner();
        GDesc4 = new javax.swing.JLabel();
        buy4 = new javax.swing.JButton();
        returngame4 = new javax.swing.JButton();
        save4 = new javax.swing.JButton();
        GImg6 = new javax.swing.JLabel();
        returngame2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 2732));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIDEO GAMES");
        jLabel1.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Game Title :");

        GTitle.setBackground(new java.awt.Color(255, 255, 255));
        GTitle.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Platform :");

        GPlatform.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Publisher :");

        GPublisher.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Price :");

        GPrice.setText("jLabel10");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Select Quantity : ");

        Quantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Quantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Quantity.setPreferredSize(new java.awt.Dimension(70, 35));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Description :");

        GDesc.setText("jLabel17");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Game Title: ");

        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GTitle1.setText("jLabel6");

        GPlatform1.setText("jLabel8");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Platform :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Publisher :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Select Quantity: ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Description :");

        GPublisher1.setText("jLabel17");

        GPrice1.setText("jLabel18");

        GDesc1.setText("jLabel20");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Game Title :");

        GTitle2.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Platform :");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Publisher :");

        GPlatform2.setText("jLabel28");

        GPublisher2.setText("jLabel29");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Price :");

        GPrice2.setText("jLabel37");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Select  Quantity :");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Description :");

        GDesc2.setText("jLabel41");

        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Game Title :");

        GTitle3.setText("jLabel44");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Platform :");

        GPlatform3.setText("jLabel46");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Publisher :");

        GPublisher3.setText("jLabel48");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Price :");

        GPrice3.setText("jLabel50");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Select Quantity :");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Description :");

        GDesc3.setText("jLabel54");

        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Quantity1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Quantity1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Quantity1.setPreferredSize(new java.awt.Dimension(70, 35));

        Quantity2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Quantity2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Quantity2.setPreferredSize(new java.awt.Dimension(70, 35));

        Quantity3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Quantity3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Quantity3.setPreferredSize(new java.awt.Dimension(70, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Price :");

        buy.setBackground(new java.awt.Color(102, 102, 255));
        buy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buy.setForeground(new java.awt.Color(255, 255, 255));
        buy.setText("Buy Now");
        buy.setBorder(null);
        buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyMouseClicked(evt);
            }
        });
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        returngame.setBackground(new java.awt.Color(51, 51, 51));
        returngame.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returngame.setForeground(new java.awt.Color(255, 255, 255));
        returngame.setText("Return");
        returngame.setBorder(null);
        returngame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returngameMouseClicked(evt);
            }
        });

        save.setBackground(new java.awt.Color(102, 102, 255));
        save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        buy1.setBackground(new java.awt.Color(102, 102, 255));
        buy1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buy1.setForeground(new java.awt.Color(255, 255, 255));
        buy1.setText("Buy Now");
        buy1.setBorder(null);
        buy1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy1MouseClicked(evt);
            }
        });

        returngame1.setBackground(new java.awt.Color(51, 51, 51));
        returngame1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returngame1.setForeground(new java.awt.Color(255, 255, 255));
        returngame1.setText("Return");
        returngame1.setBorder(null);
        returngame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returngame1MouseClicked(evt);
            }
        });

        save1.setBackground(new java.awt.Color(102, 102, 255));
        save1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("Save");
        save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save1MouseClicked(evt);
            }
        });
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        save2.setBackground(new java.awt.Color(102, 102, 255));
        save2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save2.setForeground(new java.awt.Color(255, 255, 255));
        save2.setText("Save");
        save2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save2MouseClicked(evt);
            }
        });

        buy2.setBackground(new java.awt.Color(102, 102, 255));
        buy2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buy2.setForeground(new java.awt.Color(255, 255, 255));
        buy2.setText("Buy Now");
        buy2.setBorder(null);
        buy2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy2MouseClicked(evt);
            }
        });

        save3.setBackground(new java.awt.Color(102, 102, 255));
        save3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save3.setForeground(new java.awt.Color(255, 255, 255));
        save3.setText("Save");
        save3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save3MouseClicked(evt);
            }
        });

        buy3.setBackground(new java.awt.Color(102, 102, 255));
        buy3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buy3.setForeground(new java.awt.Color(255, 255, 255));
        buy3.setText("Buy Now");
        buy3.setBorder(null);
        buy3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy3MouseClicked(evt);
            }
        });

        returngame3.setBackground(new java.awt.Color(51, 51, 51));
        returngame3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returngame3.setForeground(new java.awt.Color(255, 255, 255));
        returngame3.setText("Return");
        returngame3.setBorder(null);
        returngame3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returngame3MouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("No of Products :");
        jLabel8.setOpaque(true);

        products.setBackground(new java.awt.Color(255, 255, 255));
        products.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        products.setText("jLabel12");
        products.setOpaque(true);

        G1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        G2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        G3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        G5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        G6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        G6.setText("  ");

        G4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        G4.setText(" ");

        Quantity4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Quantity4.setPreferredSize(new java.awt.Dimension(70, 35));

        buy4.setBackground(new java.awt.Color(102, 102, 255));
        buy4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buy4.setForeground(new java.awt.Color(255, 255, 255));
        buy4.setText("Buy Now");
        buy4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buy4MouseClicked(evt);
            }
        });

        returngame4.setBackground(new java.awt.Color(51, 51, 51));
        returngame4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returngame4.setForeground(new java.awt.Color(255, 255, 255));
        returngame4.setText("Return");
        returngame4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returngame4MouseClicked(evt);
            }
        });

        save4.setBackground(new java.awt.Color(102, 102, 255));
        save4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save4.setForeground(new java.awt.Color(255, 255, 255));
        save4.setText("Save");
        save4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                save4MouseClicked(evt);
            }
        });

        returngame2.setBackground(new java.awt.Color(51, 51, 51));
        returngame2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returngame2.setForeground(new java.awt.Color(255, 255, 255));
        returngame2.setText("Return");
        returngame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returngame2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel24)))
                                        .addGap(78, 78, 78))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(save2))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(GImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(GPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(241, 241, 241)
                                            .addComponent(returngame2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel22)
                                                    .addGap(84, 84, 84))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel25)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(GTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(GPlatform2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(GPublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(buy2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGap(15, 15, 15))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel47)
                                            .addComponent(jLabel49)
                                            .addComponent(jLabel51))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(Quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(53, 53, 53)
                                                        .addComponent(save3))
                                                    .addComponent(GTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(GDesc3, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(36, 36, 36)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(GPublisher3, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                                            .addComponent(GPlatform3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(17, 17, 17)
                                                        .addComponent(GPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(returngame3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(buy3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)))))
                                    .addComponent(GImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(GPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(GTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(87, 87, 87)
                                                        .addComponent(GPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(39, 39, 39))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(GPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(107, 107, 107)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(returngame, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(151, 151, 151)
                                                .addComponent(save))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(GDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel10))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(11, 11, 11))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(GPlatform1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(GTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(78, 78, 78)
                                                        .addComponent(GPublisher1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(27, 27, 27))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(65, 65, 65)
                                                        .addComponent(GPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(buy1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                                    .addComponent(returngame1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(GImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(save1))
                                            .addComponent(GDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(returngame4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buy4, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(GImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(G1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(G3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(G4, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                                    .addComponent(G5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(GPrice4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(GPublisher4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(GTitle4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(GPlatform4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(G6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(Quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(save4))
                                                    .addComponent(GDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(products))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(GTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(GPlatform))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(GPublisher)
                    .addComponent(buy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(GPrice)
                    .addComponent(returngame, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(GDesc))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(GImg2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(GPrice1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Quantity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(GDesc1))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(GImg3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(GPlatform2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(GTitle2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(buy2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(returngame2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GPublisher2)
                                    .addComponent(jLabel25))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GPrice2)
                                    .addComponent(jLabel36))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(Quantity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(GTitle1)
                        .addGap(18, 18, 18)
                        .addComponent(GPlatform1)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buy1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GPublisher1))
                        .addGap(18, 18, 18)
                        .addComponent(returngame1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(GDesc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GImg4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(GTitle3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(GPlatform3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(GPublisher3)
                    .addComponent(buy3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(GPrice3)
                    .addComponent(returngame3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(Quantity3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(GDesc3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(GImg6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GImg5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1)
                    .addComponent(GTitle4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G2)
                    .addComponent(GPublisher4))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(buy4)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(G4)
                                    .addComponent(GPrice4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(returngame4)
                            .addComponent(Quantity4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G5)
                            .addComponent(save4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(G3)
                            .addComponent(GPlatform4))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G6)
                    .addComponent(GDesc4))
                .addContainerGap(1220, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 2052, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyMouseClicked
   
        String value = Quantity.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
             
        }else{
            
   String game_id = get_gid();
  String quantity=get_quantity();
   String sql = " select stock, gameid, last_row from game_stock_history where gameid = '" + game_id + "' and last_row=(select max(last_row) from game_stock_history)";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
      {
               
               int stock= rs.getInt(1);
             
               int q = Integer.parseInt(quantity);
               if (q>stock && stock>1){
                 JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE);
               }
               
               else if (stock<1){
                  JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE);
            }
               
                
              else{
                  new CustDetails().setVisible(true);
                  this. setVisible(false);}
                      }
               
    } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
       }}
 
    }//GEN-LAST:event_buyMouseClicked

    private void returngameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returngameMouseClicked
  String value = Quantity.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
        }else {
            
        new returnItem().setVisible(true);
       this. setVisible(false);}
    }//GEN-LAST:event_returngameMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        
        
         String sql = "SELECT * FROM VIDEOGAME_T ";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int gid = rs.getInt (1);
                int distid = rs.getInt(9);
        OrderQuantity(gid,distid);
        }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
      
    }//GEN-LAST:event_saveMouseClicked

    private void buy1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy1MouseClicked
    
   
        String value = Quantity1.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
             
        }else{
            
   String game_id = get_gid();
  String quantity=get_quantity();
   String sql = " select stock, gameid, last_row from game_stock_history where gameid = '" + game_id + "' and last_row=(select max(last_row) from game_stock_history)";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
      {
                System.out.println("inside");
               
               int stock= rs.getInt(1);
             
               int q = Integer.parseInt(quantity);
               if (q>stock && stock>1){
                   JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE); 
               }
               
               else if (stock<1){
                  JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE);
            }
               
                
              else{
                       new CustDetails().setVisible(true);
                       this. setVisible(false);}
                      }
               
    } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
       }}
    }//GEN-LAST:event_buy1MouseClicked

    private void buy2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy2MouseClicked
    
        String value = Quantity2.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
             
        }else{
            
   String game_id = get_gid();
  String quantity=get_quantity();
   String sql = " select stock, gameid, last_row from game_stock_history where gameid = '" + game_id + "' and last_row=(select max(last_row) from game_stock_history)";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
      {
                System.out.println("inside");
               
               int stock= rs.getInt(1);
             
               int q = Integer.parseInt(quantity);
               if (q>stock && stock>1){
                   JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE);
               }
               
               else if (stock<1){
                 JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE); 
            }
               
                
              else{
                       new CustDetails().setVisible(true);
                       this. setVisible(false);}
                      }
               
    } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
       }}
    }//GEN-LAST:event_buy2MouseClicked

    private void buy3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy3MouseClicked
      
        String value = Quantity3.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
             
        }else{
            
   String game_id = get_gid();
  String quantity=get_quantity();
   String sql = " select stock, gameid, last_row from game_stock_history where gameid = '" + game_id + "' and last_row=(select max(last_row) from game_stock_history)";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
      {
                System.out.println("inside");
               
               int stock= rs.getInt(1);
             
               int q = Integer.parseInt(quantity);
               if (q>stock && stock>1){
                  JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE);
               }
               
               else if (stock<1){
                 JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE);
            }
               
                
              else{
                       new CustDetails().setVisible(true);
       this. setVisible(false);}
                      }
               
    } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
       }}
    }//GEN-LAST:event_buy3MouseClicked

    private void returngame1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returngame1MouseClicked
       String value = Quantity1.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
        }else {
            
        new returnItem().setVisible(true);
       this. setVisible(false);}
    }//GEN-LAST:event_returngame1MouseClicked

    private void returngame3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returngame3MouseClicked
  String value = Quantity3.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
        }else {
            
        new returnItem().setVisible(true);
       this. setVisible(false);}
    }//GEN-LAST:event_returngame3MouseClicked

    private void save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save1MouseClicked
      String sql = "SELECT * FROM VIDEOGAME_T";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int gid = rs.getInt (1);
        }  if(rs.next()){
                int gid1 = rs.getInt (1);
                int distid1 = rs.getInt(9);
                OrderQuantity1(gid1,distid1);
        }  
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
      
    }//GEN-LAST:event_save1MouseClicked

    private void save2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save2MouseClicked
       String sql = "SELECT * FROM VIDEOGAME_T";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int gid = rs.getInt (1);
        }  if(rs.next()){
                int gid1 = rs.getInt (1);
        } if(rs.next()){
                int gid2 = rs.getInt (1);
                int distid2 = rs.getInt(9);
        OrderQuantity2(gid2,distid2);
        }    
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }//GEN-LAST:event_save2MouseClicked

    private void save3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save3MouseClicked
     String sql = "SELECT * FROM VIDEOGAME_T";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int gid = rs.getInt (1);
        }  if(rs.next()){
                int gid1 = rs.getInt (1);
        } if(rs.next()){
                int gid2 = rs.getInt (1);
        }  if(rs.next()){
                int gid3 = rs.getInt (1);
                int distid3 = rs.getInt(9);
        OrderQuantity3(gid3,distid3);
        }    
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }//GEN-LAST:event_save3MouseClicked

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buyActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save1ActionPerformed

    private void buy4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buy4MouseClicked
  
        String value = Quantity4.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
             
        }else{
            
   String game_id = get_gid();
  String quantity=get_quantity();
   String sql = " select stock, gameid, last_row from game_stock_history where gameid = '" + game_id + "' and last_row=(select max(last_row) from game_stock_history)";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
            if(rs.next())
      {
             
               int stock= rs.getInt(1);
             
               int q = Integer.parseInt(quantity);
               if (q>stock && stock>1){
                   JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE); 
               }
               
               else if (stock<1){
                  JOptionPane.showMessageDialog(null, "Order can not be placed",
      "error", JOptionPane.ERROR_MESSAGE); 
            }
               
                
              else{
                       new CustDetails().setVisible(true);
                       this. setVisible(false);}
                      }
               
    } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
       }}
    }//GEN-LAST:event_buy4MouseClicked

    private void returngame4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returngame4MouseClicked
        String value = Quantity4.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
        }else {
            
        new returnItem().setVisible(true);
       this. setVisible(false);}
    }//GEN-LAST:event_returngame4MouseClicked

    private void save4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_save4MouseClicked
      String sql = "SELECT * FROM VIDEOGAME_T";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int gid = rs.getInt (1);
        }  if(rs.next()){
                int gid1 = rs.getInt (1);
        } if(rs.next()){
                int gid2 = rs.getInt (1);
        } if(rs.next()){
                int gid3 = rs.getInt (1);
        }  if(rs.next()){
                int gid4 = rs.getInt (1);
                int distid4 = rs.getInt(9);
        OrderQuantity4(gid4,distid4);
        }    
        }
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }//GEN-LAST:event_save4MouseClicked

    private void returngame2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returngame2MouseClicked
       String value = Quantity2.getValue().toString();
        if ("0".equals(value)){
             JOptionPane.showMessageDialog(null, "Select Quantity",
      "error", JOptionPane.ERROR_MESSAGE);
        }else {
            
        new returnItem().setVisible(true);
       this. setVisible(false);}
    }//GEN-LAST:event_returngame2MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JLabel G5;
    private javax.swing.JLabel G6;
    private javax.swing.JLabel GDesc;
    private javax.swing.JLabel GDesc1;
    private javax.swing.JLabel GDesc2;
    private javax.swing.JLabel GDesc3;
    private javax.swing.JLabel GDesc4;
    private javax.swing.JLabel GImg2;
    private javax.swing.JLabel GImg3;
    private javax.swing.JLabel GImg4;
    private javax.swing.JLabel GImg5;
    private javax.swing.JLabel GImg6;
    private javax.swing.JLabel GPlatform;
    private javax.swing.JLabel GPlatform1;
    private javax.swing.JLabel GPlatform2;
    private javax.swing.JLabel GPlatform3;
    private javax.swing.JLabel GPlatform4;
    private javax.swing.JLabel GPrice;
    private javax.swing.JLabel GPrice1;
    private javax.swing.JLabel GPrice2;
    private javax.swing.JLabel GPrice3;
    private javax.swing.JLabel GPrice4;
    private javax.swing.JLabel GPublisher;
    private javax.swing.JLabel GPublisher1;
    private javax.swing.JLabel GPublisher2;
    private javax.swing.JLabel GPublisher3;
    private javax.swing.JLabel GPublisher4;
    private javax.swing.JLabel GTitle;
    private javax.swing.JLabel GTitle1;
    private javax.swing.JLabel GTitle2;
    private javax.swing.JLabel GTitle3;
    private javax.swing.JLabel GTitle4;
    private javax.swing.JSpinner Quantity;
    private javax.swing.JSpinner Quantity1;
    private javax.swing.JSpinner Quantity2;
    private javax.swing.JSpinner Quantity3;
    private javax.swing.JSpinner Quantity4;
    private javax.swing.JButton buy;
    private javax.swing.JButton buy1;
    private javax.swing.JButton buy2;
    private javax.swing.JButton buy3;
    private javax.swing.JButton buy4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel products;
    private javax.swing.JButton returngame;
    private javax.swing.JButton returngame1;
    private javax.swing.JButton returngame2;
    private javax.swing.JButton returngame3;
    private javax.swing.JButton returngame4;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save3;
    private javax.swing.JButton save4;
    // End of variables declaration//GEN-END:variables

public void OrderQuantity(int x, int y){
     try {
              Connection connection = DBConnect.connect();
 try {
          
            String sql6= "INSERT INTO customer_orderline_t(OrderQuantity,GameID,DistributorID) VALUES (?,?,?)";
                PreparedStatement statement6 = connection.prepareStatement(sql6);
                                     
                  String value = Quantity.getValue().toString();
  
                   statement6.setString(1,value);
                   statement6.setInt(2,x);
                   statement6.setInt(3,y);
                 
            int row1 = statement6.executeUpdate();  
             if (row1>0){
                   JOptionPane.showMessageDialog(this, "quantity inserted!");
                   stock_update(x);
               }
         
        
     }catch(HeadlessException | NumberFormatException | SQLException e){
              e.printStackTrace();
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}

public void OrderQuantity1(int x,int y){
     try {
              Connection connection = DBConnect.connect();
 try {
          
            String sql6= "INSERT INTO customer_orderline_t(OrderQuantity,GameID,DistributorID) VALUES (?,?,?)";
                PreparedStatement statement6 = connection.prepareStatement(sql6);
                                     
                  String value = Quantity1.getValue().toString();
  
                   statement6.setString(1,value);
                   statement6.setInt(2,x);
                   statement6.setInt(3,y);
                 
            int row1 = statement6.executeUpdate();  
             if (row1>0){
                   JOptionPane.showMessageDialog(this, "quantity inserted!");
                   stock_update(x);
               }
         
        
     }catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}

public void OrderQuantity2(int x,int y){
     try {
              Connection connection = DBConnect.connect();
 try {
          
            String sql6= "INSERT INTO customer_orderline_t(OrderQuantity,GameID,Distributorid) VALUES (?,?,?)";
                PreparedStatement statement6 = connection.prepareStatement(sql6);
                                     
                  String value = Quantity2.getValue().toString();
  
                   statement6.setString(1,value);
                   statement6.setInt(2,x);
                   statement6.setInt(3,y);
                 
            int row1 = statement6.executeUpdate();  
             if (row1>0){
                   JOptionPane.showMessageDialog(this, "quantity inserted!");
                   stock_update(x);
               }
         
        
     }catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}

public void OrderQuantity3(int x,int y ){
     try {
              Connection connection = DBConnect.connect();
 try {
          
            String sql6= "INSERT INTO customer_orderline_t(OrderQuantity,GameID,Distributorid) VALUES (?,?,?)";
                PreparedStatement statement6 = connection.prepareStatement(sql6);
                                     
                  String value = Quantity3.getValue().toString();
  
                   statement6.setString(1,value);
                   statement6.setInt(2,x);
                   statement6.setInt(3,y);
                 
            int row1 = statement6.executeUpdate();  
             if (row1>0){
                   JOptionPane.showMessageDialog(this, "quantity inserted!");
                   stock_update(x);
               }
         
        
     }catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
    
public void OrderQuantity4(int x,int y ){
     try {
              Connection connection = DBConnect.connect();
 try {
          
            String sql6= "INSERT INTO customer_orderline_t(OrderQuantity,GameID,Distributorid) VALUES (?,?,?)";
                PreparedStatement statement6 = connection.prepareStatement(sql6);
                                     
                  String value = Quantity4.getValue().toString();
  
                   statement6.setString(1,value);
                   statement6.setInt(2,x);
                   statement6.setInt(3,y);
                 
            int row1 = statement6.executeUpdate();  
             if (row1>0){
                   JOptionPane.showMessageDialog(this, "quantity inserted!");
                   stock_update(x);
               }
         
        
     }catch(HeadlessException | NumberFormatException | SQLException e){
                System.out.println("failed");
            }
       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }}
    

    public void stock_update(int gid){
         
        String sql = "select OrderQuantity, stock from (select orderquantity, stock, c.gameid, c.last_row from customer_orderline_t c inner join videogame_t v on c.gameid = v.gameid  where c.gameid = '" + gid+ "' ) where last_row = (select max(last_row) from customer_orderline_t)";
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
             System.out.println("outside");
            while(rs.next())
      {
                System.out.println("inside");
               String quantity= rs.getString(1);
               int stock= rs.getInt(2);
               System.out.println(quantity+stock);
               int q = Integer.parseInt(quantity);
               if (q>stock && stock>1){
                    JOptionPane.showMessageDialog(null, "Only "+stock+" item(s) in stock",
      "error", JOptionPane.ERROR_MESSAGE);
                  
               }
               
               else{
                   if (stock<1){
                 display_stockstatus();
            }
               int new_stock = stock - q;
             
               trigger_dbms_output.main(null);
              
               
                update_new_stock(new_stock, gid);
                
              }
               
    } }
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        }
    }
    
    public void update_new_stock(int new_s, int gid){
           String sql= "UPDATE videogame_t SET stock = '" + new_s + "' WHERE gameid = '" + gid + "'";
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);
            
            
            
      }
        
            catch (SQLException ex) {
    ex.printStackTrace();
    return;
        }
    }
        
    public void display_stockstatus(){
         String sql = "SELECT * FROM low_stock where time = (select max(time) from low_stock)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                String msg = rs.getString (1);
                JOptionPane.showMessageDialog(null, msg,"error", JOptionPane.ERROR_MESSAGE);
             
    }
 
    }
        
            catch (SQLException ex) {
    ex.printStackTrace();
    return;
        }
    }
    
    
//    public void insert_photos(){
//        
//   
//         String sql = "INSERT INTO GAME_PHOTO VALUES(?,?)";
//  
//        try {
//            Connection connection = DBConnect.connect();
//       PreparedStatement s = connection.prepareStatement(sql);
//          
//            //Inserting Blob type
//InputStream in;
//             try {
////                 in = new FileInputStream("C:/Users/DELL/OneDrive/Desktop/Elden_Ring_PS4_cover_4_140x160.jpg");
////                s.setBlob(1, in);
//                 in = new FileInputStream("C:/Users/DELL/OneDrive/Desktop/stormtrooper_140x160.png");
//                s.setBlob(1, in);
//                s.setInt(2,1);
////                 in = new FileInputStream("C:/Users/DELL/OneDrive/Desktop/g1_140x160.png");
////                s.setBlob(1, in);
////                 in = new FileInputStream("C:/Users/DELL/OneDrive/Desktop/god-of-war-iii-playstation-3-front-cover_140x160.jpg");
////                s.setBlob(1, in);
//    s.execute();
//             } catch (FileNotFoundException ex) {
//                 Logger.getLogger(Catalogue.class.getName()).log(Level.SEVERE, null, ex);
//             }
//                
//   }catch(HeadlessException | NumberFormatException | SQLException e){
//                System.out.println("failed");
//            }
//         
//         
//
//}
public void display_gameimg1(){
    
         String sql = "Select * from GAME_PHOTOS";
  
        try {
            Connection connection = DBConnect.connect();
       PreparedStatement s = connection.prepareStatement(sql);
       ResultSet rs = s.executeQuery();
       if(rs.next()){//now on 1st row  
              
Blob b=rs.getBlob(1);//2 means 2nd column data  
byte barr[]=b.getBytes(1,(int)b.length());
        Image img= ImageIO.read(new ByteArrayInputStream(barr));
        Image img1= img.getScaledInstance(180,200,Image.SCALE_SMOOTH);
        ImageIcon icon= new ImageIcon(img1);
        jLabel6.setIcon(icon);                    
       }
       System.out.println("ok");  
              
connection.close();  
}catch (Exception e) {e.printStackTrace();  }  
}


public void display_gameimg2(){
    
         String sql = "Select * from GAME_PHOTOS";
  
        try {
            Connection connection = DBConnect.connect();
       PreparedStatement s = connection.prepareStatement(sql);
       ResultSet rs = s.executeQuery();
       if(rs.next()){//now on 1st row  
              System.out.println("ignored");     
       }
       if(rs.next()){//now on 1st row  
Blob b2=rs.getBlob(1);
byte barr2[]=b2.getBytes(1,(int)b2.length());
Image img2= ImageIO.read(new ByteArrayInputStream(barr2));
        Image img12= img2.getScaledInstance(180,200,Image.SCALE_SMOOTH);
        ImageIcon icon2= new ImageIcon(img12);
 GImg2.setIcon(icon2);}
       System.out.println("ok");  
              
connection.close();  
}catch (Exception e) {e.printStackTrace();  }  
}

public void display_gameimg3(){
    
         String sql = "Select * from GAME_PHOTOS";
  
        try {
            Connection connection = DBConnect.connect();
       PreparedStatement s = connection.prepareStatement(sql);
       ResultSet rs = s.executeQuery();
       if(rs.next()){//now on 1st row  
              System.out.println("ignored");     
       }
       
       if(rs.next()){//now on 1st row  
           System.out.println("ignored");           
}if(rs.next()){//now on 1st row  
Blob b3=rs.getBlob(1);
byte barr3[]=b3.getBytes(1,(int)b3.length());
Image img3= ImageIO.read(new ByteArrayInputStream(barr3));
        Image img13= img3.getScaledInstance(180,200,Image.SCALE_SMOOTH);
        ImageIcon icon3= new ImageIcon(img13);
 GImg3.setIcon(icon3);  } 
       
       System.out.println("ok");  
              
connection.close();  
}catch (Exception e) {e.printStackTrace();  }  
}


public void display_gameimg4(){
    
         String sql = "Select * from GAME_PHOTOS";
  
        try {
            Connection connection = DBConnect.connect();
       PreparedStatement s = connection.prepareStatement(sql);
       ResultSet rs = s.executeQuery();
       if(rs.next()){//now on 1st row  
              System.out.println("ignored");     
       }
       if(rs.next()){
       
       System.out.println("ignored"); 
       } if(rs.next()){
       
       System.out.println("ignored"); 
       }  if(rs.next()){//now on 1st row  
Blob b4=rs.getBlob(1);
byte barr4[]=b4.getBytes(1,(int)b4.length());//1 means first image  
             Image img4= ImageIO.read(new ByteArrayInputStream(barr4));
        Image img14= img4.getScaledInstance(180,200,Image.SCALE_SMOOTH);
        ImageIcon icon4= new ImageIcon(img14);
GImg4.setIcon(icon4);
}
       
       System.out.println("ok");  
              
connection.close();  
}catch (Exception e) {e.printStackTrace();  }  
}

public void display_gameimg5(){
    
         String sql = "Select * from GAME_PHOTOS";
  
        try {
            Connection connection = DBConnect.connect();
       PreparedStatement s = connection.prepareStatement(sql);
       ResultSet rs = s.executeQuery();
       if(rs.next()){//now on 1st row  
              System.out.println("ignored");     
       }
       
       if(rs.next()){//now on 1st row  
           System.out.println("ignored");           
}if(rs.next()){
       
       System.out.println("ignored"); 
       } if(rs.next()){
       
       System.out.println("ignored"); 
       } if(rs.next()){//now on 1st row  
Blob b5=rs.getBlob(1);
byte barr5[]=b5.getBytes(1,(int)b5.length());
Image img5= ImageIO.read(new ByteArrayInputStream(barr5));
        Image img15= img5.getScaledInstance(180,200,Image.SCALE_SMOOTH);
        ImageIcon icon5= new ImageIcon(img15);
 GImg6.setIcon(icon5);  } 
       
       System.out.println("ok");  
              
connection.close();  
}catch (Exception e) {e.printStackTrace();  }  
}



public void no_of_products(){
     String sql = "Select sum(products) from ( SELECT count (gameid) as products FROM videogame_t group by gametitle having count(gameid) >=1)";
  
        try {
            Connection connection = DBConnect.connect();
            Statement s = connection.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                int product_no = rs.getInt (1);
                String pno = Integer.toString(product_no);
                products.setText(pno);
              }  
        
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    return;
        
}}
   public String get_gid(){
        String sql = "select gameid from customer_orderline_t where last_row =(select max(last_row) from customer_orderline_t)";
         try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
          
            while(rs.next())
      {
                
               String gid = rs.getString(1);
               
            return gid;
   }
             } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    
       }return null;
}
   
   public String get_quantity(){
String sql="select orderquantity from customer_orderline_t where last_row = (select max(last_row) from customer_orderline_t)" ; 
      try {
            Connection connection = DBConnect.connect();
            Statement s = connection.createStatement();
         
            ResultSet rs = s.executeQuery(sql);
            
             if (rs.next()){
                 String quantity= rs.getString(1);
                 return quantity;
   }
             } 
        
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Connection Failed!");
    ex.printStackTrace();
    
       }return null;
}
             
           
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameDistributor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new Catalogue().setVisible(true);
        }
        });
    }
    
}