package Admin;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class NonBlockingNotification {
//    public static void showNotification(String header, String message2, String userId, String message) {
//        // Create the notification frame
//        JDialog notificationDialog = new JDialog();
//        notificationDialog.setLayout(new FlowLayout());
//        notificationDialog.setSize(300, 300); // Set the size of the notification window
//        notificationDialog.setUndecorated(true); // Optional: hide window decorations
//        notificationDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        notificationDialog.setModalityType(Dialog.ModalityType.MODELESS); // Ensure it's non-modal
//
//        // Add content to the notification window
//        JLabel messageLabel = new JLabel("<html><body>"+ 
//                                         header + "<br>" + "<br>" +  
//                                         message2 + "<br>" + 
//                                         "Customer ID: " + userId + "<br>" + 
//                                         message + "<br>" + 
//                                         "</body></html>");
//        
//        notificationDialog.add(messageLabel);
//
//        // Position the notification (e.g., bottom right corner of the screen)
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = toolkit.getScreenSize();
//        notificationDialog.setLocation(screenSize.width - notificationDialog.getWidth() - 1140, 
//                                       screenSize.height - notificationDialog.getHeight() - 775);
//
//        // Automatically close the notification after some time (e.g., 5 seconds)
//        new Timer(10000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                notificationDialog.dispose();
//            }
//        }).start();
//
//        // Show the notification
//        notificationDialog.setVisible(true);
//    }

    public static void logNotification(String userId, String message) {
        String filename = userId + "_notifications.txt"; // Each user has a separate log file

        try (FileWriter fw = new FileWriter(filename, true); // 'true' to append to the file
                 BufferedWriter bw = new BufferedWriter(fw); PrintWriter out = new PrintWriter(bw)) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);
            out.println(message + " - " + formattedDateTime); // Log the message with a timestamp

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the notification log: " + e.getMessage());
        }
    }
}
