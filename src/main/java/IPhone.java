public class IPhone extends Mobile {

    @Override
    public void call(String message){
        if(message.length() > 10){
            System.out.println("<iPhone> Message cannot be sent");
        }else {
            System.out.println("<iPhone>Message : " + message);
        }

    }

}