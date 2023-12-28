package Contests.Week6;

public class Con_03 {
    public static void main(String[] args) {
        Contact contact = new Contact("Alice", new PhoneNumber("+82", "1234567890"));
        ContactManagement cm = new ContactManagement();
        System.out.println("Original contact: " + contact);
        System.out.println();

        Contact updatedContactShallow = cm.editContactShallow(contact, "Bob", "0987654321");
        System.out.println("Shallow copy updated contact: " + updatedContactShallow);
        System.out.println("Original contact after shallow copy: " + contact);
        System.out.println();

        Contact updatedContactDeep = cm.editContactDeep(contact, "Charlie", "1122334455");
        System.out.println("Deep copy updated contact: " + updatedContactDeep);
        System.out.println("Original contact after deep copy: " + contact);
    }
}

class Contact{
    private String name;
    private PhoneNumber phoneNumber;

    public Contact(String name, PhoneNumber phonenumber){
        this.name = name;
        this.phoneNumber =phonenumber;
    }


//    Deep copy constructor
    public Contact(Contact other){
        this.name = other.name;
        this.phoneNumber = other.phoneNumber;
    }

    public PhoneNumber getPhoneNumber(){
        return phoneNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public PhoneNumber setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }


    public String toString() {
        return "[CONTACT] name("+name+") " + phoneNumber.toString();
    }
}

class PhoneNumber{
    private String countryCode;
    private String localNumber;

    public PhoneNumber(String countryCode, String localNumber) {
        this.countryCode = countryCode;
        this.localNumber = localNumber;
    }

    // Deep copy constructor
    public PhoneNumber(PhoneNumber other) {
        this.countryCode = other.countryCode;
        this.localNumber = other.localNumber;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public String getCountryCode(){
        return countryCode;
    }

    public String getLocalNumber(){
        return localNumber;
    }

    public String toString(){
        return "[Phone Number] countryCode("+countryCode+") localNumber("+localNumber+")";
    }
}

class ContactManagement{
    private Contact contact;
    public Contact editContactShallow(Contact contact, String name, String localNumber) {
        contact.setName(name);
        contact.getPhoneNumber().setLocalNumber(localNumber);
        return contact;
    }

    public Contact editContactDeep(Contact contact, String name, String localNumber) {
        Contact contact1 = new Contact(contact);
        PhoneNumber phoneNumber1 = new PhoneNumber(contact.getPhoneNumber());
        contact1.setName(name);
        contact1.setPhoneNumber(phoneNumber1).setLocalNumber(localNumber);
        return contact1;
    }

}