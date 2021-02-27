public class SelfReview {
    public static void main(String[] args) {
        String s1 = "I am ";
        String s2 = "a boy";
        System.out.printf("%s%n", s1.equals(s2));
        System.out.printf("%s%n", s1 += s2);
//        String s3 = s1+=s2;
//        System.out.printf("%s", s3);
        System.out.printf("%d%n", s1.length());
        System.out.printf("%d%n", s2.length());
//        System.out.printf("%d%n", s3.length());

        // C

    }
      /* *
  14. 1
  a. False -> The equal to sign (==) checks if the compared objects are the same objects, it basically checks if they have the same ID, NOT the same valiues.
  b. False, they can't be modified
      /
  14.2
       */
}
