package MyApplication;
import ThirdParty.PostalMailNotificationAdapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Notification System\n\n");

        INofity emailNotification = new EmailNotification();

        emailNotification.sendNotification("Hello, this is a mail", "Rhythm");

        System.out.println("\n\n");

        INofity smsNotification = new SmsNotification();
        smsNotification.sendNotification("Hello, this is a SMS", "Rhythm");

        System.out.println("\n\n");

        INofity postalMailNotificationAdapter = new PostalMailNotificationAdapter(new PostalMailNotification(), "Rampura, Dhaka", 1219);

        postalMailNotificationAdapter.sendNotification("Hello, this is a e-postal mail", "Rhythm");


    }
}