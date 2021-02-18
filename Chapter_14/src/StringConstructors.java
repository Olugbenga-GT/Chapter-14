public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'d', 'e', 'c' ,'o' ,'m' ,'p' ,'o' ,'s' ,'i' ,'t' ,'i' ,'o' ,'n' };
        String s = new String("Beyonce");

        // Using String Constructors
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 0 , 8);
        String s5 = new String(charArray, 2,11);
        String s6 = new String(charArray,5,8);
//        s1.getChars(0,5, charArray, 0);

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%ns4 = %s%ns5 = %s%ns6 = %s%n",
                          s1, s2, s3, s4, s5, s6);
        System.out.printf("%n Th reversed of decomposition is : %n ");
        for(int count = s3.length() - 1; count >= 0; count --){
            System.out.printf("%c  ", s3.charAt(count));


        }
    }
}
