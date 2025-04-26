package sio.d3.javafx.cybersensi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DATA_CONNECTION {

    // Informations de connexion à la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/cybersensi";  // URL de la base de données
    private static final String USER = "sensiuser";  // Nom d'utilisateur de la base de données
    private static final String PASSWORD = "sensipass";  // Mot de passe pour la base de données

    /**
     * Méthode statique pour obtenir la connexion à la base de données
     * @return Connection
     * @throws SQLException Si une erreur de connexion se produit
     */
    public static Connection getConnection() throws SQLException {
        try {
            // Charger le driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");  // S'assurer que le driver est chargé
            System.out.println("Connexion à la base de données réussie");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Erreur : Le driver JDBC MySQL n'est pas trouvé.");
            e.printStackTrace();
            throw new SQLException("Erreur de connexion : Driver JDBC non trouvé.", e);
        } catch (SQLException e) {
            System.err.println("Erreur de connexion à la base de données.");
            e.printStackTrace();
            throw e;  // Relancer l'exception pour être géré à un niveau supérieur
        }
    }

    /**
     * Méthode pour fermer une connexion à la base de données
     * @param connection La connexion à fermer
     */
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                if (!connection.isClosed()) {
                    connection.close();  // Fermer la connexion
                    System.out.println("Connexion fermée avec succès.");
                }
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture de la connexion.");
                e.printStackTrace();
            }
        }
    }
}
