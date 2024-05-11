public class UserDemo {

  public static void main(String[] args) {
    User user1 = new User.Builder()
      .firstName("EJ")
      .lastName("Manaloto")
      .email("ej.manaloto@example.com")
      .address("123 Quezon City")
      .phone("0912-345-6789")
      .age(21)
      .build();

    System.out.println("User Details:");
    System.out.println("  First Name: " + user1.getFirstName());
    System.out.println("  Last Name: " + user1.getLastName());
    System.out.println("  Email: " + user1.getEmail());
    System.out.println("  Address: " + user1.getAddress());
    System.out.println("  Phone: " + user1.getPhone());
    System.out.println("  Age: " + user1.getAge());
  }
}
