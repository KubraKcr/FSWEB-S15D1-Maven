package org.example.mobile;

public class Contact {

 private String name;
 private  String phoneNumber;

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public static Contact createContact(String name , String phoneNumber){
        return new Contact(name,phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return  true;

            if(obj == null || obj.getClass() != getClass())
                return false;

            Contact contact = (Contact) obj;
            return this.phoneNumber.equals(contact.getPhoneNumber());



    }
}
