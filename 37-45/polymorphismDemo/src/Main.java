public class Main {

    public static void main(String[] args) {
        /*BaseLogger[] baseLogger = new BaseLogger[]{new ConsoleLogger(),new FileLogger(),new EmailLogger(),new DatabaseLogger()};
            for (BaseLogger logger:baseLogger){
                logger.Log("Log mesajı ");
            }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
