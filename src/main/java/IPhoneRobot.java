public class IPhoneRobot {

    private String name;

    public void useIPhone(IPhone iPhone,String message){
        iPhone.call(message);
    }
    public void print(){
        System.out.println("I only use iPhone");
    }
}
