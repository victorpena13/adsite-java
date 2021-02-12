package com.spring.adsite.DAO;

import com.spring.adsite.interfaces.Ads;
import com.spring.adsite.mysql.MySQLAdsDAO;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new MySQLAdsDAO();
        }
        return adsDao;
    }
}
