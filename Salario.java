import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        Float Salario, Porcentagem, Acrescimo;
        System.out.println("Digite o salario do Funcionario");
        Salario = valor.nextFloat();
        System.out.println(" Digite a quantidade de acrescimo do salario");
        Porcentagem = valor.nextFloat();
        Acrescimo = Salario +(Porcentagem / 100f *Salario);
        System.out.printf("Seu novo salário tem o valor de: "+ "%.2f",Acrescimo);
        valor.close();
    }
    
}
