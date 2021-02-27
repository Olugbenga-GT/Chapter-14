public class MyStringBuilder {
    public static void main(String[] args) {
//        StringBuilder buffer1 = new StringBuilder();
//        StringBuilder buffer2 = new StringBuilder(10);
//        StringBuilder buffer3 = new StringBuilder("Hello");
        StringBuilder buffer4 = new StringBuilder("Hello, how are you?");

//        System.out.printf("buffer1 = \"%s \" %n", buffer1);
//        System.out.printf("buffer2 = \"%s \" %n", buffer2);
//        System.out.printf("buffer3 = \"%s \" %n", buffer3);

        System.out.printf("buffer4 = %s%nlength = %d%nCapacity = %d%n%n", buffer4.toString(), buffer4.length(), buffer4.capacity());

        buffer4.ensureCapacity(75);
        System.out.printf("New Capacity = %d%n", buffer4.capacity());

        buffer4.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", buffer4.length(), buffer4.toString());
    }
}
