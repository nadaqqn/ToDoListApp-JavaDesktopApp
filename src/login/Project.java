
package login;

public class Login {

    public static void main(String[] args) {
        // TODO code application logic here
        //nama object nya rg, nama classnya Register
        //nama class huruf besar awalnya, nama object kecil huruf awalnya setelah itu nama_method()
        registerGUI rg = new registerGUI();
        //menampilkan frame register
        //halaman pertama yg ditampilin register
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(registerGUI.EXIT_ON_CLOSE);
    }
    
}
