public class CMDPrinter implements MessageHandler {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
