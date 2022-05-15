import java.util.Scanner;
import java.util.InputMismatchException;


public class App {
    public static void main(String[] args) throws Exception {
        Studente studente1 = new Studente("Luca", "Rossi");
        Studente studente2 = new Studente("Luca", "Rossi");
        Insegnante insegnante1 = new Insegnante("Marco", "Neri");
        
        Persona[] classe = {studente1, insegnante1, studente2};

        for(Persona persona : classe) {
            persona.Saluta();
        }

        //EXCEPTION
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserire un numero ");
            int x = scanner.nextInt();
            System.out.println("Inserire un numero ");
            int y = scanner.nextInt();
            int result = x/y;
            System.out.println(result);
        } catch(ArithmeticException e) {
            System.out.println("non puoi dividere per 0");
        } catch(InputMismatchException e) {
            System.out.println("non puoi dividere un numero per una stringa");
        } catch(Exception e) {
            System.out.println("c'è stato un problema");
        }finally {
            System.out.println("eseguito comunque");
            //scanner.close();
        }
    }
}
