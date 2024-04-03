package questao1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Data dataNasc = new Data();
        Endereco endereco = new Endereco();
        Contato contato = new Contato();

        pessoa.setDataNasc(dataNasc);
        pessoa.setEndereco(endereco);
        pessoa.setContato(contato);

        System.out.print("Nome: ");
        String nome = scString.nextLine();
        pessoa.setNome(nome);

        System.out.println("Data de nascimento:");
        System.out.print("Dia: ");
        int dia = sc.nextInt();
        dataNasc.setDia(dia);

        System.out.print("Mes: ");
        int mes = sc.nextInt();
        dataNasc.setMes(mes);

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        dataNasc.setAno(ano);

        System.out.println("Endereco:");
        System.out.print("Logradouro: ");
        String logradouro = scString.nextLine();
        endereco.setLogradouro(logradouro);

        System.out.print("Numero: ");
        int numero = sc.nextInt();
        endereco.setNumero(numero);

        System.out.print("Bairro: ");
        String bairro = scString.nextLine();
        endereco.setBairro(bairro);

        System.out.print("Cidade: ");
        String cidade = scString.nextLine();
        endereco.setCidade(cidade);

        System.out.print("Estado: ");
        String estado = scString.nextLine();
        endereco.setEstado(estado);

        System.out.print("CEP: ");
        String cep = scString.nextLine();
        endereco.setCep(cep);

        System.out.println("Contato:");
        System.out.print("Telefone Residencial: ");
        String telefoneResid = scString.nextLine();
        contato.setTelefoneResid(telefoneResid);

        System.out.print("Celular: ");
        String celular = scString.nextLine();
        contato.setCelular(celular);

        System.out.print("Email: ");
        String email = scString.nextLine();
        contato.setEmail(email);

        System.out.println("Cadastro realizado!");
        System.out.println(pessoa.toString());
    }
}
