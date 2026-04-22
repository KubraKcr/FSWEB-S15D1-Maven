package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();


    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }


    public MobilePhone(String  myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return  true;
            }else {
            return false;

        }
    }

    public boolean updateContact(Contact oldC, Contact newC){
        boolean returnVal= false;
        if(myContacts.contains(oldC)){
            Contact replaced = myContacts.set(myContacts.indexOf(oldC), newC);
            returnVal = replaced.equals(oldC);
        }
        return  returnVal;
    }

    public boolean removeContact(Contact contact){
        boolean returnVal = false;

        if(myContacts.contains(contact)){
            returnVal = myContacts.remove(contact);

        }
        return returnVal;
    }

    public int findContact(Contact contact){


        return myContacts.indexOf(contact);
    }

    public int findContact(String name){
        int returnValue= -1;
        for (Contact contact : myContacts){

            if( contact.getName().equals(name)){
            returnValue = findContact(contact);
        }

    }
        return returnValue;
}

public Contact queryContact(String name){
        Contact returnValue = null;

        for(Contact contact: myContacts){
            if(contact.getName().equals(name)){
                returnValue = contact;
                break;
            }
        }
        return  returnValue;
}
public void printContact(){
    for (int i = 1; i <myContacts.size(); i++) {
        Contact contact = myContacts.get(i);
        System.out.println(i + "." + contact.getName() + "->" + contact.getPhoneNumber());

    }
}
}
