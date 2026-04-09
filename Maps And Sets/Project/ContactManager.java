package Maps_And_Sets_Project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Map<String, Set<String>> contacts;
  
    public ContactManager() {
        contacts = new HashMap<>();
    }

    // Add Contact
    public void addContact(String name, String phone) {

        contacts.putIfAbsent(name, new HashSet<>());
        contacts.get(name).add(phone);

        System.out.println("Contact Added Successfully");
    }

    // Search Contact
    public void searchContact(String name) {

        if(contacts.containsKey(name)) {
            System.out.println(name + " : " + contacts.get(name));
        } else {
            System.out.println("Contact Not Found");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {

        if(contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact Deleted");
        } else {
            System.out.println("Contact Not Found");
        }
    }

    // Show All Contacts
    public void displayContacts() {

        for(String name : contacts.keySet()) {
            System.out.println(name + " : " + contacts.get(name));
        }
    }
}
