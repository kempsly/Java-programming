public class Main {
    public static void main(String[] args) {
        GreetingServiceImpl greetingService = new GreetingServiceImpl();
        MessageService messageService = new MessageService();

        //Setter dependency injection

        greetingService.setMessageService(messageService);
        greetingService.sendGreeting();

    }
}