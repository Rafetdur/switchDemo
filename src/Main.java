public class Main {

    public static void main(String[] args) {
        // write your code here
        char grade = 'F';
        switch (grade) {
            case 'A':
                System.out.println("Mukmmel: Gectiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("iyi gectiniz");
                break;
            case 'D':
                System.out.println("fena depil: gectiniz");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");

        }
    }
}
