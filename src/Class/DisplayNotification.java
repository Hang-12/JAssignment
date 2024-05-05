/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author CW
 */
public class DisplayNotification {
    public void displayNotifications(String userId) {
        String filename = userId + "_notifications.txt";
        JFrame notificationFrame = new JFrame("Notifications");
        JTextArea notificationArea = new JTextArea(10, 30);
        notificationArea.setEditable(false);

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                notificationArea.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            notificationArea.setText("No notifications found.");
        }

        notificationFrame.add(new JScrollPane(notificationArea));
        notificationFrame.pack();
        notificationFrame.setVisible(true);
    }
}
