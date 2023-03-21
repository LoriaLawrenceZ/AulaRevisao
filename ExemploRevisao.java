package AulaRevisao;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner in = new Scanner(System.in, "latin1");

    public void Exemplo1(){
        int totalAulas, totalFaltas;
        double nota1, nota2, mediaNota, porcentagemFrequencia;

        //Iniciando o progeama e lendo as NOTAS do aluno
        System.out.println("--------------------------------------------------------------\nInsira a PRIMEIRA NOTA do aluno.\n[APENAS NÚMEROS] [0 a 100]");
        nota1 = in.nextDouble();

        System.out.println("Insira a SEGUNDA NOTA do aluno");
        nota2 = in.nextDouble();

        //Calculando MÉDIA do aluno
        mediaNota = (nota1 + nota2) / 2;
        System.out.println("A MÉDIA do aluno é "+mediaNota);

        //Lendo informações de FREQUÊNCIA
        System.out.println("Insira o TOTAL de AULAS da disciplina");
        totalAulas = in.nextInt();

        System.out.println("Insira o Total de FALTAS da disciplina");
        totalFaltas = in.nextInt();

        //Calculando FREQUÊNCIA do aluno
        porcentagemFrequencia = ((totalAulas - totalFaltas) * 100) / totalAulas;
        System.out.println("A FREQUÊNCIA do aluno é de "+ porcentagemFrequencia +"%");

        //Condições para ser APROVADO ou REPROVADO
        if(mediaNota >= 50 & porcentagemFrequencia >= 75){
            System.out.println("O aluno foi APROVADO.\nAluno foi APROVADO por NOTAS [Média de  "+ mediaNota +"]\nAluno foi APROVADO por FREQUÊNCIA [FREQUÊNCIA de "+ porcentagemFrequencia +" %]");
        }
        else if(mediaNota >= 50 & porcentagemFrequencia < 75){
            System.out.println("O aluno foi REPROVADO.\nAluno foi APROVADO por NOTAS [Média de  "+ mediaNota +"]\nAluno foi REPROVADO por FREQUÊNCIA [FREQUÊNCIA de "+ porcentagemFrequencia +" %]");
        }
        else if(mediaNota < 50 & porcentagemFrequencia >= 75){
            System.out.println("O aluno está de RECUPERAÇÃO.\nAluno foi REPROVADO por NOTAS [Média de  "+ mediaNota +"]\nAluno foi APROVADO por FREQUÊNCIA [FREQUÊNCIA de "+ porcentagemFrequencia +" %]");
        }
        else{
            System.out.println("O aluno foi REPROVADO.\nAluno foi REPROVADO por NOTAS [Média de  "+ mediaNota +"]\nAluno foi REPROVADO por FREQUÊNCIA [FREQUÊNCIA de "+ porcentagemFrequencia +" %]");
        }
    }
}
