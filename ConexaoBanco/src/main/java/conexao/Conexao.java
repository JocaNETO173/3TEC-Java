/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 3tecnico
 */
public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/escola2_db?useSSL=false&allowPublicKeyRetrival=true";
    /*private para não ser acessada, static para não ser usada em outro lugar, final para ser constante */
 /* useSSL=false não será utilizado a criptografia SSL*/

    private static final String USUARIO = "root";
    private static final String SENHA = "java123";

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados - " + e.getMessage());
            return null;
        }
    }
    public static void main(String[] args) {
        Connection conn = getConexao();
        
        if(conn != null){
            System.out.println("SUCESSO: Conexão com o MySQL realizada com sucesso!");
            try{
                conn.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        } else {
            System.err.println("FALHA: Não foi possível conectar ao banco de dados MySQL!");
        }
    }
}
