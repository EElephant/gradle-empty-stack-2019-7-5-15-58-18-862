public class Main {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call("10086");
        mobile.setName("Specific Mobile");
        mobile.setColor("Red");
        mobile.setBrand("Vivo");
        mobile.print();

        IPhone iPhone = new IPhone();
        iPhone.call("10010");

        Andriod andriod = new Andriod();
        andriod.call("10000");

        Person person = new Person();
        person.useMobile(mobile,"ahhhhhhhhh");
        person.useMobile(iPhone,"12345678");
        person.useMobile(iPhone,"12345678910");
        person.useMobile(andriod,"12345678");
        person.useMobile(andriod,"12345678910");

        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.print();
        iPhoneRobot.useIPhone(iPhone,"12345678");
        iPhoneRobot.useIPhone(iPhone,"12345678910");


    }
}
