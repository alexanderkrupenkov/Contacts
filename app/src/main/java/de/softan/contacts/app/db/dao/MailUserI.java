package de.softan.contacts.app.db.dao;

import de.softan.contacts.app.db.entity.MailUser;

public interface MailUserI extends BaseServiceI {

    MailUserI getMailByUserId(int userId);

    void setMailForUser(MailUser mailForUser);

}
