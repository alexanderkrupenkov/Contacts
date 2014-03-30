package de.softan.contacts.app.db.dao;

import java.sql.SQLException;

public interface BaseServiceI {

    void open() throws SQLException;

    void  close();

}
