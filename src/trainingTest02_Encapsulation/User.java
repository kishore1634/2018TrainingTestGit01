package trainingTest02_Encapsulation;

public class User {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();

        userDetails.setName("Forrest Biswas");
        userDetails.setEmail("kishore1634@gmail.com");

        System.out.println("User name is: " + userDetails.getName());
        System.out.println("User email is: " + userDetails.getEmail());
    }
}
