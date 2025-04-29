public class TestFan {
    public static void main(String[] args) {
        // First Fan
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // Second Fan
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        // Display results
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
