package series;

import java.util.*;

public class Day81_1 {
    static class Contact {
        String name;
        String phone;
        Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
        @Override
        public int hashCode() {
            return phone.hashCode();
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Contact)) return false;
            Contact other = (Contact) obj;
            return this.phone.equals(other.phone);
        }
        @Override
        public String toString() {
            return name + " - " + phone;
        }
    }
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Shubham", "9876543210"));
        contacts.add(new Contact("Rahul", "9123456780"));
        contacts.add(new Contact("Shubham", "9876543210")); // duplicate
        contacts.add(new Contact("Amit", "9000000000"));
        contacts.add(new Contact("Rahul", "9123456780"));   // duplicate
        Set<Contact> uniqueContacts = new HashSet<>(contacts);
        System.out.println("Unique Contacts:");
        for (Contact c : uniqueContacts) {
            System.out.println(c);
        }
    }
}