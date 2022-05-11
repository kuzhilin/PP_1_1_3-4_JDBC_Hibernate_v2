package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/learn","admin","admin");
    }

    public static SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration()
                .setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/learn")
                .setProperty("hibernate.connection.username","admin")
                .setProperty("hibernate.connection.password","admin")
                .setProperty("hibernate.hbm2ddl.auto","none")
                .addAnnotatedClass(User.class);
        return configuration.buildSessionFactory();
    }
}
