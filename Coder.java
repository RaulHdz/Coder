import java.util.*;
public class Coder {
  
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Write your sentence: ");
    String E = keyboard.nextLine();
    System.out.print("Do you want to code or decode? (1 = Code, 2 = Decode)");
    int A = keyboard.nextInt();
    char C;
    int D = 0;
    switch ( A ) {
      case 1:
        String P = "abcdefghijklmnñopqrstuvwxyz";
        String Q = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String R = "1234567890";
        String S = "ábcdéghíjklmnñópqrstúvwxyz";
        String T = "ÁBCDÉFGHÍJKLMNÑÓPQRSTÚVWXYZ";
        System.out.print("How much right shift do you want to apply? ");
        int B = keyboard.nextInt();
        for (int i = 0; i < E.length(); i++) {
          D = 0;
          for (int j = 0; j < P.length() && D == 0; j++) {
            if (E.charAt(i) == P.charAt(j)) {
              C = P.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < Q.length() && D == 0; j++) {
            if (E.charAt(i) == Q.charAt(j)) {
              C = Q.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < R.length() && D == 0; j++) {
            if (E.charAt(i) == R.charAt(j)) {
              C = R.charAt((j + B) % 10);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < S.length() && D == 0; j++) {
            if (E.charAt(i) == S.charAt(j)) {
              C = S.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < T.length() && D == 0; j++) {
            if (E.charAt(i) == T.charAt(j)) {
              C = T.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
        }
        break;
      case 2:
        P = "zyxwvutsrqpoñnmlkjihgfedcba";
        Q = "ZYXWVUTSRQPOÑNMLKJIHGFEDCBA";
        R = "0987654321";
        S = "zyxwvútsrqpóñnmlkjíhgfédcbá";
        T = "ZYXWVÚTSRQPÓÑNMLKJÍHGFÉDCBÁ";
        System.out.print("How much left shift do you want to apply? ");
        B = keyboard.nextInt();
        for (int i = 0; i < E.length(); i++) {
          D = 0;
          for (int j = 0; j < P.length() && D == 0; j++) {
            if (E.charAt(i) == P.charAt(j)) {
              C = P.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < Q.length() && D == 0; j++) {
            if (E.charAt(i) == Q.charAt(j)) {
              C = Q.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < R.length() && D == 0; j++) {
            if (E.charAt(i) == R.charAt(j)) {
              C = R.charAt((j + B) % 10);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < S.length() && D == 0; j++) {
            if (E.charAt(i) == S.charAt(j)) {
              C = S.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
          for (int j = 0; j < T.length() && D == 0; j++) {
            if (E.charAt(i) == T.charAt(j)) {
              C = T.charAt((j + B) % 27);
              D = 1;
              System.out.print(C);
            }
          }
        }
        break;
      default:
        System.out.print("Error! Only accepts 1 and 2");
        break;
    }
  }
}