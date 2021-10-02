package br.unicap.pet.neurotech.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import br.unicap.pet.neurotech.model.exceptions.UsuarioNaoEncontradoException;
import br.unicap.pet.neurotech.view.util.Leitor;

public class MenuPrincipal {

    public static void main(String[] args) throws UsuarioNaoEncontradoException {
      
    	String url = "jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10439832";
        String user = "sql10439832";
        String password = "zAzLrhmaiF";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = (Statement) con.createStatement();
            //st.execute(query1);
            ResultSet rs = st.executeQuery(query2);
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    	int op;
        //MenuCliente acessoCliente = new MenuCliente();
        MenuGerente acessoGerente = new MenuGerente();
        LoginView login = new LoginView();
        
        do {
            
            System.out.println("<<MENU PRINCIPAL>>");
            System.out.println("1 - Cliente"); 
            System.out.println("2 - Gerente"); 
            System.out.println("3 - Sair");
            System.out.println("4 - Cadastrar");
            op = Leitor.getLeitor().nextInt();
            switch (op) {

                case 1:
                    login.Entrar();
                    break;
                case 2:
                    acessoGerente.Menu();
                    break;
                case 3:
                	System.out.println("Saindo!!");
                	break;
                case 4:
                	break;
            }
        } while (op != 4);

    }

}
