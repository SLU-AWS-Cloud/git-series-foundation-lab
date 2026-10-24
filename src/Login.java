public class Login {

  public static boolean login(String username, String password) {
    String correctUsername = "admin";
    String correctPassword = "1234";

    if (username.equals(correctUsername) &&
        password.equals(correctPassword)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(login("admin", "1234")); // true
    System.out.println(login("user", "1234")); // false
  }
}