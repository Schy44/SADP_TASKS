//Dependency Inversion

interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}

public class Main {
    public static void main(String[] args) {

        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();

        NotificationService notificationViaEmail = new NotificationService(emailService);
        NotificationService notificationViaSMS = new NotificationService(smsService);

        notificationViaEmail.sendNotification("Hello, this is an email notification.");
        notificationViaSMS.sendNotification("Hello, this is an SMS notification.");
    }
}
