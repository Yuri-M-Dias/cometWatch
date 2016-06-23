package cometwatch.dao;

import cometwatch.model.Comet;

import java.sql.*;

/**
 * Created by root on 22/06/16.
 */
public class CometDAO {

    private static final String URL = "jdbc:h2:mem:comet;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE";

    public static Comet find(int usuarioID) throws SQLException {
        // Abrir uma conexão com o banco de dados.
        Connection conn = DriverManager.getConnection(URL);
        String sql2 = "CREATE TABLE COMET(ID INT PRIMARY KEY, NAME VARCHAR(255))";
        PreparedStatement preparedStatement = conn.prepareStatement(sql2);
        preparedStatement.execute();
        preparedStatement.close();
        // Executar instrução SQL.
        String sql = "SELECT * FROM COMET WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, usuarioID);
        ResultSet resultSet = pstmt.executeQuery();
        System.out.println(resultSet.getObject(1));
        Comet comet = (Comet) pstmt.executeQuery();
        // Fechar sentença.
        pstmt.close();
        // Fechar conexão.
        conn.close();
        return comet;
    }


}
