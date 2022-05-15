public class Studente extends Persona {

    String materia;
    String classe = "1A";
    int[] voti = {9, 9, 9};

    Studente(String nome, String cognome) {
        //super evita di fare this.nome = nome, this.cognome = cognome
        super(nome, cognome);
    }

    void studia() {
        System.out.println("Sto studiando...");
    }

    @Override
    void Saluta() {
        System.out.println("Bungiorno");
    }
}
