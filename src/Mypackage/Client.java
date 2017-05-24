/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Client extends javax.swing.JFrame {

    private static Socket s;
    private static BufferedReader in;
    private static PrintWriter out;
    ArrayList<String> denumiri ;
    int CodCard;

    public Client() {
       denumiri  = new ArrayList<>();
       denumiri.add("1 Mai");
            denumiri.add("Academia Militara");
            denumiri.add("Aeroport Baneasa");
            denumiri.add("Aeroport Henri Coanda- Otopeni");
            denumiri.add("Alaska");
            denumiri.add("Alexandru Moldoveanu");
            denumiri.add("Andronache");
            denumiri.add("Anghel Saligny");
            denumiri.add("Aparatorii Patriei");
            denumiri.add("Aurel Vlaicu");
            denumiri.add("Autogara Rahova");
            denumiri.add("Aviatorilor");
            denumiri.add("Bacovia");
            denumiri.add("Baneasa Institut");
            denumiri.add("Baneasa Meteo");
            denumiri.add("Barza");
            denumiri.add("Basarab");
            denumiri.add("Berceni");
            denumiri.add("Brancusi");
            denumiri.add("Bucegi");
            denumiri.add("Cartier Baneasa");
            denumiri.add("Casa Presei Libere");
            denumiri.add("Colentina");
            denumiri.add("Constantin Brancoveanu");
            denumiri.add("Costin Georgian");
            denumiri.add("Crangasi");
            denumiri.add("Dacia");
            denumiri.add("Delfinului");
            denumiri.add("Depoul RATB");
            denumiri.add("Depoul Voluntari");
            denumiri.add("Dimitrie Leonida");
            denumiri.add("Doamna Ghica");
            denumiri.add("Dristor");
            denumiri.add("Drumul Taberei");
            denumiri.add("Eroii Revolutiei");
            denumiri.add("Eroilor");
            denumiri.add("Express");
            denumiri.add("Favorit");
            denumiri.add("Gara Baneasa");
            denumiri.add("Gara Progresul");
            denumiri.add("Gara de nord");
            denumiri.add("Gorjului");
            denumiri.add("Gradistea");
            denumiri.add("Granitul");
            denumiri.add("Grivita");
            denumiri.add("Grozavesti");
            denumiri.add("Hasdeu");
            denumiri.add("Independentei 1877");
            denumiri.add("Izvor");
            denumiri.add("Lac Straulesti");
            denumiri.add("Laminorului");
            denumiri.add("Luica");
            denumiri.add("Lujerului");
            denumiri.add("Mihai Bravu");
            denumiri.add("Morarilor");
            denumiri.add("Nicolae Grigorescu");
            denumiri.add("Nicolae Teclu");
            denumiri.add("Obor");
            denumiri.add("Pacii");
            denumiri.add("Padina");
            denumiri.add("Pajura");
            denumiri.add("Pantelimon");
            denumiri.add("Parc Bazilescu");
            denumiri.add("Parc Drumul Taberei");
            denumiri.add("Penitenciar Rahova");
            denumiri.add("Petrache Poenaru");
            denumiri.add("Piata Iancului");
            denumiri.add("Piata Muncii");
            denumiri.add("Piata Progresul");
            denumiri.add("Piata Rahova");
            denumiri.add("Piata Romana");
            denumiri.add("Piata Sudului");
            denumiri.add("Piata Unirii");
            denumiri.add("Piata Victoriei");
            denumiri.add("Pipera");
            denumiri.add("Politehnica");
            denumiri.add("Preciziei");
            denumiri.add("Privighetorilor");
            denumiri.add("Raul Doamnei");
            denumiri.add("Republica");
            denumiri.add("Romancierilor");
            denumiri.add("Sebastian");
            denumiri.add("Spital Fundeni");
            denumiri.add("Sportului");
            denumiri.add("Stadionul National");
            denumiri.add("Stefan cel Mare");
            denumiri.add("Timpuri Noi");
            denumiri.add("Tineretului");
            denumiri.add("Titan");
            denumiri.add("Toporan");
            denumiri.add("Universitate");
            denumiri.add("Valea Ialomitei");
            denumiri.add("Vlahuta");
            denumiri.add("Voluntari");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 800));

        jPanel7.setVisible(false);

        jLabel13.setText("jLabel13");

        jButton9.setText("Calculeaza ruta");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jSpinner10.setModel(new javax.swing.SpinnerListModel(new String[] {"Selectati statie", "1 Mai", "Academia Militara", "Aeroport Baneasa", "Aeroport Henri Coanda- Otopeni", "Alaska", "Alexandru Moldoveanu", "Andronache", "Anghel Saligny", "Aparatorii Patriei", "Aurel Vlaicu", "Autogara Rahova", "Aviatorilor", "Bacovia", "Baneasa Institut", "Baneasa Meteo", "Barza", "Basarab", "Berceni", "Brancusi", "Bucegi", "Cartier Baneasa", "Casa Presei Libere", "Colentina", "Constantin Brancoveanu", "Costin Georgian", "Crangasi", "Dacia", "Delfinului", "Depoul RATB", "Depoul Voluntari", "Dimitrie Leonida", "Doamna Ghica", "Dristor", "Drumul Taberei", "Eroii Revolutiei", "Eroilor", "Express", "Favorit", "Gara Baneasa", "Gara Progresul", "Gara de nord", "Gorjului", "Gradistea", "Granitul", "Grivita", "Grozavesti", "Hasdeu", "Independentei 1877", "Izvor", "Lac Straulesti", "Laminorului", "Luica", "Lujerului", "Mihai Bravu", "Morarilor", "Nicolae Grigorescu", "Nicolae Teclu", "Obor", "Pacii", "Padina", "Pajura", "Pantelimon", "Parc Bazilescu", "Parc Drumul Taberei", "Penitenciar Rahova", "Petrache Poenaru", "Piata Iancului", "Piata Muncii", "Piata Progresul", "Piata Rahova", "Piata Romana", "Piata Sudului", "Piata Unirii", "Piata Victoriei", "Pipera", "Politehnica", "Preciziei", "Privighetorilor", "Raul Doamnei", "Republica", "Romancierilor", "Sebastian", "Spital Fundeni", "Sportului", "Stadionul National", "Stefan cel Mare", "Timpuri Noi", "Tineretului", "Titan", "Toporan", "Universitate", "Valea Ialomitei", "Vlahuta", "Voluntari"}));

        jSpinner11.setModel(new javax.swing.SpinnerListModel(new String[] {"Selectati statie", "1 Mai", "Academia Militara", "Aeroport Baneasa", "Aeroport Henri Coanda- Otopeni", "Alaska", "Alexandru Moldoveanu", "Andronache", "Anghel Saligny", "Aparatorii Patriei", "Aurel Vlaicu", "Autogara Rahova", "Aviatorilor", "Bacovia", "Baneasa Institut", "Baneasa Meteo", "Barza", "Basarab", "Berceni", "Brancusi", "Bucegi", "Cartier Baneasa", "Casa Presei Libere", "Colentina", "Constantin Brancoveanu", "Costin Georgian", "Crangasi", "Dacia", "Delfinului", "Depoul RATB", "Depoul Voluntari", "Dimitrie Leonida", "Doamna Ghica", "Dristor", "Drumul Taberei", "Eroii Revolutiei", "Eroilor", "Express", "Favorit", "Gara Baneasa", "Gara Progresul", "Gara de nord", "Gorjului", "Gradistea", "Granitul", "Grivita", "Grozavesti", "Hasdeu", "Independentei 1877", "Izvor", "Lac Straulesti", "Laminorului", "Luica", "Lujerului", "Mihai Bravu", "Morarilor", "Nicolae Grigorescu", "Nicolae Teclu", "Obor", "Pacii", "Padina", "Pajura", "Pantelimon", "Parc Bazilescu", "Parc Drumul Taberei", "Penitenciar Rahova", "Petrache Poenaru", "Piata Iancului", "Piata Muncii", "Piata Progresul", "Piata Rahova", "Piata Romana", "Piata Sudului", "Piata Unirii", "Piata Victoriei", "Pipera", "Politehnica", "Preciziei", "Privighetorilor", "Raul Doamnei", "Republica", "Romancierilor", "Sebastian", "Spital Fundeni", "Sportului", "Stadionul National", "Stefan cel Mare", "Timpuri Noi", "Tineretului", "Titan", "Toporan", "Universitate", "Valea Ialomitei", "Vlahuta", "Voluntari"}));

        jLabel15.setText("De la :");

        jLabel16.setText("Pana la: ");

        jButton10.setText("Back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setVisible(false);
        jPanel6.setName("jPanel6"); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(505, 368));

        jLabel14.setAutoscrolls(true);
        jLabel14.setName("jLabel14"); // NOI18N

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setVisible(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(505, 368));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Verificare");
        jLabel9.setAlignmentY(0.0F);

        jLabel10.setText("Numar autobuz");

        jLabel11.setText("Numar persoane");

        jButton6.setText("Verifica");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(138, Short.MAX_VALUE)
=======
                .addContainerGap(84, Short.MAX_VALUE)
>>>>>>> origin/master
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
<<<<<<< HEAD
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 138, Short.MAX_VALUE)
=======
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 84, Short.MAX_VALUE)
>>>>>>> origin/master
                        .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)))
                .addContainerGap(138, Short.MAX_VALUE))
=======
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(85, Short.MAX_VALUE))
>>>>>>> origin/master
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap(59, Short.MAX_VALUE))
=======
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap(60, Short.MAX_VALUE))
>>>>>>> origin/master
        );

        jPanel4.setVisible(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(505, 368));

        jLabel7.setText("Cardul a fost validat");

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
<<<<<<< HEAD
                        .addContainerGap(182, Short.MAX_VALUE)
=======
                        .addContainerGap(331, Short.MAX_VALUE)
>>>>>>> origin/master
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
<<<<<<< HEAD
                .addContainerGap(182, Short.MAX_VALUE))
=======
                .addContainerGap(333, Short.MAX_VALUE))
>>>>>>> origin/master
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(151, Short.MAX_VALUE))
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(107, Short.MAX_VALUE))
>>>>>>> origin/master
        );

        jPanel3.setVisible(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(505, 368));

        jLabel3.setText("Validare Card");

        jLabel4.setText("Data");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2017, 2017, 2100, 1));

        jLabel5.setText("Ora");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(7, 0, 23, 1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel6.setText("Numar autobuz");

        jButton4.setText("Validare");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setText("Numar persoane");

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9, 1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jButton9.setText("back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 58, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 38, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setVisible(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(505, 368));

        jButton2.setText("Validare card");
        jButton2.setActionCommand("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Verificare card");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setText("Planificare Calatorie");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap(189, Short.MAX_VALUE))
>>>>>>> origin/master
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(123, Short.MAX_VALUE)
=======
                .addContainerGap(294, Short.MAX_VALUE)
>>>>>>> origin/master
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jButton8)
<<<<<<< HEAD
                .addContainerGap(123, Short.MAX_VALUE))
=======
                .addContainerGap(294, Short.MAX_VALUE))
>>>>>>> origin/master
        );

        jPanel1.setPreferredSize(new java.awt.Dimension(505, 368));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Conectare");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("      ID CARD: ");

        jLabel12.setVisible(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 54, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
>>>>>>> origin/master
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addGap(407, 407, 407)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addGap(407, 407, 407)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
>>>>>>> origin/master
                    .addGap(204, 204, 204)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        out.flush();
        String mesaj = "validare";
        out.println(mesaj);
        jPanel2.setVisible(false);
        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel3.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        out.flush();
        String mesaj = "verificare";
        out.println(mesaj);

        jPanel1.setVisible(false);
        jPanel4.setVisible(false);
        jPanel3.setVisible(false);
        jPanel2.setVisible(false);
        jPanel6.setVisible(false);
        jPanel5.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        out.flush();
        String nrAutobuz = jSpinner8.getValue().toString();
        jLabel2.setText("");
        jLabel2.setVisible(true);
        System.out.println("nrauto " + nrAutobuz);
        out.println(nrAutobuz);
        String zi = jSpinner1.getValue().toString();
        System.out.println("zi " + zi);
        out.println(zi);
        String luna = jSpinner2.getValue().toString();
        System.out.println("luna " + luna);
        out.println(luna);
        String an = jSpinner3.getValue().toString();
        System.out.println("an " + an);
        out.println(an);
        String ora = jSpinner4.getValue().toString();
        System.out.println("ora " + ora);
        out.println(ora);
        String minut = jSpinner5.getValue().toString();
        System.out.println("minut " + minut);
        out.println(minut);
        String nrPersoane = jSpinner9.getValue().toString();

        out.println(nrPersoane);
        System.out.println("pers " + nrPersoane);
        try {
            String mesaj = in.readLine();
            if (mesaj.equals("abonament inexistent si fonduri insuficiente")) {
                jLabel2.setText("abonament inexistent si fonduri insuficiente");
                jLabel2.setVisible(true);
            } else if (mesaj.equals("fonduri insuficiente pentru numarul de persoane selectat")) {
                jLabel2.setText("fonduri insuficiente pentru numarul de persoane selectat");
                jLabel2.setVisible(true);
            } else {
                jPanel1.setVisible(false);
                jPanel2.setVisible(false);
                jPanel3.setVisible(false);
                jPanel5.setVisible(false);
                jPanel6.setVisible(false);
                jPanel4.setVisible(true);
                jSpinner8.setValue(0);
                jSpinner9.setValue(0);
                jSpinner1.setValue(1);
                jSpinner2.setValue(1);
                jSpinner3.setValue(2017);
                jSpinner4.setValue(7);
                jSpinner5.setValue(0);
                jLabel2.setVisible(false);

            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        out.flush();
        String nrAutobuz = jSpinner6.getValue().toString();
        System.out.println("nrauto " + nrAutobuz);
        out.println(nrAutobuz);
        String nrPersoane = jSpinner7.getValue().toString();
        out.println(nrPersoane);
        System.out.println("pers " + nrPersoane);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel1.setVisible(false);
        jPanel6.setVisible(true);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);

        try {
            String message = in.readLine();
<<<<<<< HEAD
            if (!message.equals("cardul nu a fost validat")) {
                System.out.println(message);
                jLabel14.setText(message);

            } else {
                jLabel14.setText("cardul nu a fost validat");
            }
=======
            System.out.println(message);
            jLabel14.setText(message);

>>>>>>> origin/master
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        out.flush();
        String mesaj = jTextField1.getText().trim().toString();
        jLabel12.setText("");
        jLabel12.setVisible(true);
        boolean isInteger = Pattern.matches("\\d+", mesaj);
        if (isInteger == true) {
            out.println(mesaj);
            CodCard = Integer.parseInt(mesaj);
            try {
                String message = in.readLine();
                if (message.equals("exista")) {
                    jPanel1.setVisible(false);

                    jPanel3.setVisible(false);
                    jPanel4.setVisible(false);
                    jPanel5.setVisible(false);
                    jPanel6.setVisible(false);
                    jPanel2.setVisible(true);
                    jTextField1.setText("");

                    jLabel12.setVisible(false);

                } else {
                    jLabel12.setText("id inexistent");
                    jLabel12.setVisible(true);

                }
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            jLabel12.setText("date incorecte");
            jLabel12.setVisible(true);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel1.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jPanel1.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel2.setVisible(false);

        jPanel7.setVisible(true);

    }//GEN-LAST:event_jButton8ActionPerformed

<<<<<<< HEAD
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jPanel7.setVisible(false);
        jTextPane1.setText("");
        jPanel1.setVisible(true);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String plecare = jSpinner10.getValue().toString();
        String destinatie = jSpinner11.getValue().toString();
        if (destinatie.equals(plecare) == true) {
            jTextPane1.setText("Statia de plecare coincide cu destinatia ");
        } else {
            System.out.println(plecare + " " + destinatie);
           
            int statie_plecare = 0;
            int statie_destinatie = 0;
            for (int i = 0; i < denumiri.size(); i++) {
                if (denumiri.get(i).equals(plecare) == true) {
                    statie_plecare = i + 2;
                }
                if (denumiri.get(i).equals(destinatie) == true) {
                    statie_destinatie = i + 2;
                }
            }

            System.out.println(plecare + " " + statie_plecare + " " + destinatie + " " + statie_destinatie);

            // Process process = new ProcessBuilder("C:\\Users\\Madaluna\\Documents\\GitHub\\RATB\\dw.exe","7","20").start();
            String aa = String.valueOf(statie_plecare);
            System.out.println(aa);
            String bb = String.valueOf(statie_destinatie);
            String ff = "dw.exe " + aa + " " + bb;

            String[] command
                    = {
                        "cmd",};
            Process p;
            try {
                p = Runtime.getRuntime().exec(command);
                new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
                PrintWriter stdin = new PrintWriter(p.getOutputStream());
                stdin.println(" cd C:\\Users\\Madaluna\\Documents\\GitHub\\RATB ");
                stdin.println("g++ -o dw dw.cpp ");
                stdin.println(ff);

                int returnCode;

                stdin.close();
                returnCode = p.waitFor();
                System.out.println("Return code = " + returnCode);
                //read from file data 
                ArrayList<String> rute = new ArrayList<>();
                String rutaAleasa;
                BufferedReader br = new BufferedReader(new FileReader("date.txt"));

                String line = null;
                while ((line = br.readLine()) != null) {
                    rute.add(line);
                }
                if (rute.size() != 0) {
                    rutaAleasa = rute.get(0);
                    br.close();
                    for (String u : rute) {
                        if (u.length() < rutaAleasa.length()) {
                            rutaAleasa = u;
                        }
                    }
                    jTextPane1.setText("Cea mai scurta ruta intre cele doua statii este : " + rutaAleasa);
                } else {
                    jTextPane1.setText("Nu s-a putut gasi ruta disponibila");
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

=======
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel1.setVisible(true);
>>>>>>> origin/master
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {

        s = new Socket("localhost", 8080);
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(s.getOutputStream(), true);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
