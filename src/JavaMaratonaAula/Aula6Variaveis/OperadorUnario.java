package JavaMaratonaAula.Aula6Variaveis;

public class OperadorUnario {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero1 + numero2;

        System.out.println("a soma da = " +  numero1 + numero2);   //O valor não saira correto pois a um texto antes do calculo
        System.out.println("a soma da = " + (numero1+ numero2));   // O valor da soma correta
        System.out.println("a soma da = " + soma); //O valor da a soma correta
    }
}
