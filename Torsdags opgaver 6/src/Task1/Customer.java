package Task1;

// lav instans variable
public class Customer {
   private String firstName;
   private String lastName;
   private String userName;
   private int id;
   private static int counter = 0;

    // constructor
public Customer(String firstName, String lastName, String userName){
this.firstName = firstName;
this.lastName = lastName;
this.userName = userName;
this.id = ++counter;
}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                '}';
    }
}
