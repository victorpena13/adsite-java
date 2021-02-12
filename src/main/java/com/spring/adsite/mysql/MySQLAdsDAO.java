package com.spring.adsite.mysql;

import com.spring.adsite.interfaces.Ads;
import com.spring.adsite.models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class MySQLAdsDAO implements Ads {
    private Connection connection;

    public MySQLAdsDAO() throws SQLException {
        DriverManager.registerDriver(new Driver() {
            @Override
            public Connection connect(String url, Properties info) throws SQLException {
                return null;
            }

            @Override
            public boolean acceptsURL(String url) throws SQLException {
                return false;
            }

            @Override
            public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                return new DriverPropertyInfo[0];
            }

            @Override
            public int getMajorVersion() {
                return 0;
            }

            @Override
            public int getMinorVersion() {
                return 0;
            }

            @Override
            public boolean jdbcCompliant() {
                return false;
            }

            @Override
            public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                return null;
            }
        });
        connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        String selectQuery = "SELECT * FROM ads";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(selectQuery);
        return createArray(rs);
    }

    public List<Ad> createArray(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while(rs.next()) {
            ads.add(getDetails(rs));
        }
        return ads;
    }

    public Ad getDetails(ResultSet rs) throws SQLException {
        return new Ad(rs.getLong("id"),
                rs.getString("title"),
                rs.getString("description"));
    }

    @Override
    public long insert(Ad ad) throws SQLException {
        String adding = String.format("INSERT INTO ads (user_id, title, description, categories_id) VALUES (%d, '%s', '%s')",
                ad.getUserID(), ad.getTitle(), ad.getDescription());
        PreparedStatement statement = connection.prepareStatement(adding);
        long queue = statement.executeUpdate(adding);
        return queue;
    }
}
