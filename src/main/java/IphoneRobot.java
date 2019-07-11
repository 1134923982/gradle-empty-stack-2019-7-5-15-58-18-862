public class IphoneRobot {
    private Iphone iphone;

    public IphoneRobot(Iphone iphone) {
        this.iphone = iphone;
    }

    public void sendMessage(String message){
        this.iphone.call(message);
    }

}
