public class User {

  private final String firstName;
  private final String lastName;
  private final String email;
  private final String address;
  private final String phone;
  private final int age;

  private User(Builder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.address = builder.address;
    this.phone = builder.phone;
    this.age = builder.age;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public int getAge() {
    return age;
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;
    private int age;

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}
