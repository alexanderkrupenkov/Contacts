package de.softan.contacts.app.db.dao;

import java.util.List;

import de.softan.contacts.app.db.entity.PhoneUser;

public interface PhoneUserI extends BaseServiceI{

    List<PhoneUserI> getPhonesByUserId(int userId);

   // PhoneUserI getPhoneByUserId(PhoneUserI phoneUserI);

    void setPhoneForUser(PhoneUser phoneForUser);

}
