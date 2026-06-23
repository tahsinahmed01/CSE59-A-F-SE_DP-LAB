interface MessageService {
    void sendMessage(String message);
}

class EmailSender implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSSender implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void alertUser(String msg) {
        messageService.sendMessage(msg);
    }
}

public class Main {
    public static void main(String[] args) {
        MessageService email = new EmailSender();
        NotificationService service1 = new NotificationService(email);
        service1.alertUser("Hello via Email");

        MessageService sms = new SMSSender();
        NotificationService service2 = new NotificationService(sms);
        service2.alertUser("Hello via SMS");
    }
}
