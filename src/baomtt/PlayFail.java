/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baomtt;

/**
 *
 * @author Administrator
 */
public class PlayFail extends javax.swing.JFrame {

    char pf[][]={
        {'M','O','N','A','R'},
        {'C','H','Y','B','D'},
        {'E','F','G','I','K'},
        {'L','P','Q','S','T'},
        {'U','V','W','X','Z'}
    };
    /**
     * Creates new form PlayFail
     */
    public PlayFail() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbr = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtkhoa = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();
        btnmahoa = new javax.swing.JButton();
        btngiaima = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ban ro");

        jLabel2.setText("Khoa");

        jLabel3.setText("Ban ma");

        txtbr.setColumns(20);
        txtbr.setRows(5);
        jScrollPane1.setViewportView(txtbr);

        txtkhoa.setColumns(20);
        txtkhoa.setRows(5);
        jScrollPane2.setViewportView(txtkhoa);

        txtbm.setColumns(20);
        txtbm.setRows(5);
        jScrollPane3.setViewportView(txtbm);

        btnmahoa.setText("Ma hoa");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        btngiaima.setText("Giai ma");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        jLabel4.setText("PLAY FAIL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmahoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btngiaima))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmahoa)
                    .addComponent(btngiaima))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        String banro=this.txtbr.getText();
        banro=banro.toUpperCase();
        banro=banro.replace('J', 'I');
        String banma=mahoa(banro);
        this.txtbm.setText(banma);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmahoaActionPerformed

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        String banma=this.txtbm.getText();
        String banro=giaima(banma);
        int n=banro.length();
        String br="";
        for(int i =0;i<n-2;i+=2)
            if(banro.charAt(i)==banro.charAt(i+2))
                br+=banro.charAt(i);
            else 
                br+=banro.charAt(i) + "" +banro.charAt(i+1);
        if(banro.charAt(n-1)=='X')
            br+=banro.charAt(n-2);
        else
            br+=banro.charAt(n-2); br+=banro.charAt(n-1);
            this.txtbr.setText(br);
        // TODO add your handling code here:
    }//GEN-LAST:event_btngiaimaActionPerformed

    private String giaima(String banma){
        int n=banma.length();
        String banro="";
        char a,b;
        for (int i=0;i<n;i+=2){
        a=banma.charAt(i);
        b=banma.charAt(i+1);
        
        banro+=thayTheNguoc(a,b);
        }
          return banro;
            
    }
    
    String thayTheNguoc(char a,char b){
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0)==vtb.charAt(0)){
            x=pf[vta.charAt(0)-'0'][((vta.charAt(1)-'0')-1+5)%5];
            y=pf[vtb.charAt(0)-'0'][((vta.charAt(1)-'0')-1+5)%5];
            return x+""+y;
        }
        if(vta.charAt(1)==vtb.charAt(1)){
            x=pf[((vta.charAt(0)-'0')-1+5)%5][vta.charAt(1)-'0'];
            y=pf[((vtb.charAt(0)-'0')-1+5)%5][vtb.charAt(1)-'0'];
            return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][vtb.charAt(1)-'0'];
        y=pf[(vtb.charAt(0)-'0')][vta.charAt(1)-'0'];
        return x+""+y;
    }
    
    private String mahoa(String banro){
        int n=banro.length();
        int i=0;
        String banma="";
        char a,b;
        while(i<n){
            if(i==n-1){
                a=banro.charAt(i);
                b='X';
                i++;
            }else{
                    a=banro.charAt(i);
                    b=banro.charAt(i+1);
                    if(a==b){
                        b='X';
                        i++;
                    }else{
                        i+=2;
                    }
                }
            banma+=thayThe(a,b);
        }
        return banma;
    }
    
    String thayThe(char a,char b){
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0)==vtb.charAt(0)){
            x=pf[vta.charAt(0)-'0'][((vta.charAt(1)-'0')+1)%5];
            y=pf[vtb.charAt(0)-'0'][((vtb.charAt(1)-'0')+1)%5];
            return x+""+y;
        }
        if(vta.charAt(1)==vtb.charAt(1)){
            x=pf[((vta.charAt(0)-'0')+1)%5][vta.charAt(1)-'0'];
            y=pf[((vtb.charAt(0)-'0')+1)%5][vtb.charAt(1)-'0'];
            return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][vtb.charAt(1)-'0'];
        y=pf[(vtb.charAt(0)-'0')][vta.charAt(1)-'0'];
        return x+""+y;
    }
    
    private String timViTri(char a){
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                if(pf[i][j]==a)
                    return i+""+j;
        return "";
    }
    
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
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayFail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayFail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextArea txtbr;
    private javax.swing.JTextArea txtkhoa;
    // End of variables declaration//GEN-END:variables
}
