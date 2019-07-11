public class Andriod extends Mobile {

    @Override
    public void call(String message){
        if(message.length() > 10){
            System.out.println("<Andriod> Message cannot be sent");
        }else {
            System.out.println("<Andriod>Message : " + message);
        }

    }

}

