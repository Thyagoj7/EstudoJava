package JavaMaratonaAula.Aula6Variaveis;

public class Exercicio {
    public static void main(String[] args) {
        String nome = "Luck";
        String endereco = "Rua Naza";
        String telefone = "020101010101";
        String sexo = "M";
        String estadoCivil = "solteiro";

        if (nome != "" & endereco != "" & telefone != "") {

            System.out.println(nome + " Domiliciado no endereço " + endereco + " e " + " telefone " + telefone + " não possui nenhuma pendencia. ");

        } else {
            System.out.println("Cadastro Inavlido");
        }

        if (nome != "" & endereco != "" & telefone != "") {

        } else {
            if (nome == "") {
                System.out.println(" nome invalido ");
            }
            if (endereco == "") {
                System.out.println(" endereco invalido");
            }
            if (telefone == "") {
                System.out.println("telefone invalido");
            }

        }

        if (nome != "" & endereco != "" & telefone != "") {

            System.out.println(" O Sexo é Masculino = M ou Feminino=F   = " + sexo + " Estado civil " + estadoCivil);
        }
    }
}