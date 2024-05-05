package Admin;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AuthenticationService {

    public boolean authenticateUser(String userId, String password, String userType) {
        String filename = userType.toLowerCase() + "s.dat"; // Change to .dat files

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            while (true) {
                try {
                    User user = (User) ois.readObject();
                    if (user.getId().equals(userId) && user.getPassword().equals(password)) {
                        return true; // User found and password matches
                    }
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return false; // User not found or password does not match
    }
}

