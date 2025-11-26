
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author maxen
 */
public class FenetreQuiz extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreQuiz.class.getName());

    private ArrayList<Question> listeQuestions = new ArrayList<>();
    private int indexQuestionCourante = 0;
    private int score = 0;
    private int TempsRestant = 10;
    private Timer Chronometre;

    /**
     * Creates new form FenetreQuiz
     */
    public FenetreQuiz() {
        initComponents();
        lblScore.setText("Score : " + score);
        btnSuivant.setText("Suivant");
        //Questions :
        listeQuestions.add(new Question(
                "Quelle est la capitale de la France ?",
                "Lyon", "Paris", "Marseille", "Nice",
                2));

        listeQuestions.add(new Question(
                "Combien font 3 × 3 ?",
                "6", "9", "12", "3",
                2));

        listeQuestions.add(new Question(
                "Quel est l'océan à l'ouest de l'Europe ?",
                "Atlantique", "Arctique", "Indien", "Pacifique",
                1));

        listeQuestions.add(new Question(
                "Quel langage est utilisé avec NetBeans ?",
                "C++", "Java", "Python", "HTML",
                2));

        listeQuestions.add(new Question(
                "Combien y a-t-il de continents ?",
                "4", "5", "6", "7",
                4));

        listeQuestions.add(new Question(
                "Quelle planète est la plus proche du Soleil ?",
                "Venus", "Mercure", "Mars", "Terre",
                2));

        listeQuestions.add(new Question(
                "Quel est le plus grand océan de la Terre ?",
                "Atlantique", "Arctique", "Pacifique", "Indien",
                3));

        listeQuestions.add(new Question(
                "Quel est le symbole chimique de l'eau ?",
                "O2", "H2O", "CO2", "HO",
                2));

        listeQuestions.add(new Question(
                "Qui a peint la Joconde ?",
                "Van Gogh", "Picasso", "Léonard de Vinci", "Monet",
                3));

        listeQuestions.add(new Question(
                "En quelle année l'homme a-t-il marché sur la Lune ?",
                "1969", "1959", "1979", "1982",
                1));

        listeQuestions.add(new Question(
                "Combien de côtés a un hexagone ?",
                "5", "6", "7", "8",
                2));

        listeQuestions.add(new Question(
                "Qui est l'auteur de 'Le Petit Prince' ?",
                "Jules Verne", "Victor Hugo", "Molière", "Antoine de Saint-Exupéry",
                4));

        listeQuestions.add(new Question(
                "Quelle est la capitale de l'Espagne ?",
                "Madrid", "Barcelone", "Séville", "Valence",
                1));

        listeQuestions.add(new Question(
                "Quel est le plus grand animal vivant sur Terre ?",
                "Éléphant", "Baleine bleue", "Girafe", "Orque",
                2));

        listeQuestions.add(new Question(
                "Dans quel pays se trouve la Tour de Pise ?",
                "Italie", "Espagne", "France", "Portugal",
                1));

        listeQuestions.add(new Question(
                "Combien y a-t-il de secondes dans 1 minute ?",
                "30", "45", "60", "90",
                3));

        listeQuestions.add(new Question(
                "Quel est le langage utilisé principalement pour le développement Android ?",
                "C#", "Kotlin", "Swift", "Ruby",
                2));

        listeQuestions.add(new Question(
                "Quel est le résultat de 12 ÷ 3 ?",
                "3", "4", "6", "9",
                2));

        listeQuestions.add(new Question(
                "Quel est le plus grand désert du monde ?",
                "Sahara", "Gobi", "Antarctique", "Kalahari",
                3));

        listeQuestions.add(new Question(
                "Quel est l’élément chimique dont le symbole est ‘Fe’ ?",
                "Fer", "Fluor", "Francium", "Fermium",
                1));

        Collections.shuffle(listeQuestions);
        afficherQuestionCourante();

    }

    private void afficherQuestionCourante() {

        Question q = listeQuestions.get(indexQuestionCourante);

        ArrayList<String> propositions = new ArrayList<>();

        propositions.add(q.getProposition1());
        propositions.add(q.getProposition2());
        propositions.add(q.getProposition3());
        propositions.add(q.getProposition4());

        Collections.shuffle(propositions);

        btnRep1.setText(propositions.get(0));
        btnRep2.setText(propositions.get(1));
        btnRep3.setText(propositions.get(2));
        btnRep4.setText(propositions.get(3));

        lblQuestion.setText(q.getIntitule());

        btnRep1.setEnabled(true);
        btnRep2.setEnabled(true);
        btnRep3.setEnabled(true);
        btnRep4.setEnabled(true);

        lblFeedBack.setVisible(false);

        //Chronometre :
        TempsRestant = 10;
        lblChrono.setText("Temps : " + TempsRestant + "s");

        if (Chronometre != null) {
            Chronometre.stop();
        }

        Chronometre = new Timer(1000, (e) -> {
            TempsRestant--;
            lblChrono.setText("Temps : " + TempsRestant + "s");

            if (TempsRestant <= 0) {
                Chronometre.stop();
                lblFeedBack.setText("Temps écoulé");
                btnRep1.setEnabled(false);
                btnRep2.setEnabled(false);
                btnRep3.setEnabled(false);
                btnRep4.setEnabled(false);
            }
        });
        Chronometre.start();

    }

    private void verifierReponse(int numChoisi) {

        Question q = listeQuestions.get(indexQuestionCourante);
        lblFeedBack.setVisible(true);

        String bonne = "";

        switch (q.getIndexBonneReponse()) {
            case 1:
                bonne = q.getProposition1();
                break;
            case 2:
                bonne = q.getProposition2();
                break;
            case 3:
                bonne = q.getProposition3();
                break;
            case 4:
                bonne = q.getProposition4();
                break;
        }

        String texteChoisi = "";

        if (numChoisi == 1) {
            texteChoisi = btnRep1.getText();
        }
        if (numChoisi == 2) {
            texteChoisi = btnRep2.getText();
        }
        if (numChoisi == 3) {
            texteChoisi = btnRep3.getText();
        }
        if (numChoisi == 4) {
            texteChoisi = btnRep4.getText();
        }

        if (texteChoisi.equals(bonne)) {
            lblFeedBack.setText("Bonne réponse");
            score++;
        } else {
            lblFeedBack.setText("Mauvaise réponse");
        }

        btnRep1.setEnabled(false);
        btnRep2.setEnabled(false);
        btnRep3.setEnabled(false);
        btnRep4.setEnabled(false);

        lblScore.setText("Score : " + score);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuestion = new javax.swing.JLabel();
        btnRep1 = new javax.swing.JButton();
        btnRep2 = new javax.swing.JButton();
        btnRep3 = new javax.swing.JButton();
        btnRep4 = new javax.swing.JButton();
        lblFeedBack = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        btnSuivant = new javax.swing.JButton();
        lblChrono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblQuestion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuestion.setText("jLabel1");
        getContentPane().add(lblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        btnRep1.setText("jButton1");
        btnRep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        btnRep2.setText("jButton2");
        btnRep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        btnRep3.setText("jButton3");
        btnRep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        btnRep4.setText("jButton4");
        btnRep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRep4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        lblFeedBack.setText("jLabel1");
        getContentPane().add(lblFeedBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lblScore.setText("jLabel1");
        lblScore.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnSuivant.setText("jButton1");
        btnSuivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuivantActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuivant, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        lblChrono.setText("jLabel1");
        lblChrono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 0)));
        getContentPane().add(lblChrono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep1ActionPerformed
        // TODO add your handling code here:
        verifierReponse(1);
    }//GEN-LAST:event_btnRep1ActionPerformed

    private void btnRep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep2ActionPerformed
        // TODO add your handling code here:
        verifierReponse(2);
    }//GEN-LAST:event_btnRep2ActionPerformed

    private void btnRep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep3ActionPerformed
        // TODO add your handling code here:
        verifierReponse(3);
    }//GEN-LAST:event_btnRep3ActionPerformed

    private void btnRep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRep4ActionPerformed
        // TODO add your handling code here:
        verifierReponse(4);
    }//GEN-LAST:event_btnRep4ActionPerformed

    private void btnSuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuivantActionPerformed
        // TODO add your handling code here:
        btnSuivant.setText("Suivant");
        indexQuestionCourante++;
        

        if (indexQuestionCourante < listeQuestions.size()) {

            afficherQuestionCourante();

        } else {

            lblFeedBack.setText("Quiz terminé. Score : " + score + " / " + listeQuestions.size());

            btnSuivant.setEnabled(false);

            btnRep1.setEnabled(false);
            btnRep2.setEnabled(false);
            btnRep3.setEnabled(false);
            btnRep4.setEnabled(false);
        }
    }//GEN-LAST:event_btnSuivantActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FenetreQuiz().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRep1;
    private javax.swing.JButton btnRep2;
    private javax.swing.JButton btnRep3;
    private javax.swing.JButton btnRep4;
    private javax.swing.JButton btnSuivant;
    private javax.swing.JLabel lblChrono;
    private javax.swing.JLabel lblFeedBack;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
