import com.sun.source.tree.ReturnTree;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.util.Scanner;

 /* ALUNA: MARCELLE ALVES DE BARROS - BOOTCAMP YAMAN AUTOMAÇÃO DE TESTES*/

public class ExerciciosJava {

    public static void main(String[] args) {

        /* EXERCICIOS DE JAVA ENVIADOS PELO PROFESSOR POR E-MAIL */
        System.out.println("Consumo médio = " + consumoMedio(800, 30));
        System.out.println("A diferença entre os valores inteiros é = " + diferencaValoresInteiros(2, 3));
        System.out.println("A diferença entre os valores inteiros é = " + diferencaValoresInteiros(5, 1));
        System.out.println("Conceito pela média é = " + conceitoMedia(7.5, 6.2, 4.7));
        System.out.println("Números impares de 0 a 50 = " + listaNumerosImparOa50());
        somaMedia();
        System.out.println("Valores ordenados:" + ordenarValores(50, 27));
        System.out.println("Maior de 3 números: " + maiorValor(30, 25, 80));
        System.out.println("A soma dos 2 maiores números entre 3 é: " + somaMaiores(30, 25, 80));
        System.out.println(fibonacci());
        baskara();

        /* ALGUNS EXERCICIOS DO CODEWARS - KATA/ COLLETIONS: ESTEIRA DA YAMAN*/
        System.out.println(toBinary(11));
        System.out.println("Resposta:" + arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
        System.out.println("Formou a palavra:"+tripleTrouble("Bm", "aa", "tm"));
        System.out.println("Resultado:"+fuelPrice(8, 2.5d));
        System.out.println("Resultado esperado 22. Resultado obtido ->"+ startSmoking(0,1));
        System.out.println("Resultado esperado 224. Resultado obtido ->"+ startSmoking(1,0));
        System.out.println("Resultado esperado 247. Resultado obtido -> :"+ startSmoking(1,1));
    }


    public static Double consumoMedio(double distancia, double litro) {
        return distancia / litro;
    }

    public static int diferencaValoresInteiros(int A, int B) {
        if (A > B) {
            return A - B;
        } else {
            return B - A;
        }
        /*return A>B ? A-B : B-A;*/
    }

    public static String conceitoMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 9.0) {
            return "A";
        } else if (media >= 7.5 && media < 9.0) {
            return "B";
        } else if (media >= 6.0 && media < 7.5) {
            return "C";
        } else if (media >= 4.0 && media < 6.0) {
            return "D";
        } else
            return "E";
    }

    public static String listaNumerosImparOa50() {
        String listaNumeros = "";

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                if (listaNumeros.isEmpty()) {
                    listaNumeros = Integer.toString(i);
                } else {
                    listaNumeros += ", " + i;
                }
            }
        }
        return listaNumeros;
    }

    public static void somaMedia() {
        Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º valor:"));
        Double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º valor:"));
        Double valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º valor:"));
        Double valor4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4º valor:"));
        Double valor5 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 5º valor:"));
        Double valor6 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 6º valor:"));
        Double valor7 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 7º valor:"));
        Double valor8 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 8º valor:"));
        Double valor9 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 9º valor:"));
        Double valor10 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 10º valor:"));

        Double soma = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8 + valor9 + valor10;
        Double media = soma / 10;
        System.out.println("O somatório dos 10 valores informados é: " + soma + "\n" + "A média é:" + media);

    }

    public static String ordenarValores(int val1, int val2) {
        if (val1 < val2) {
            return val1 + "," + val2;
        } else {
            return val2 + "," + val1;
        }

    }

    public static int maiorValor(int val1, int val2, int val3) {
        int maior;

        if (val1 > val2) {
            maior = val1;
        } else {
            maior = val2;
        }

        if (maior < val3) {
            maior = val3;
        }

        return maior;
    }

    public static int somaMaiores(int val1, int val2, int val3) {
        int maior1, maior2;

        if (val1 > val2 && val1 > val3) {
            maior1 = val1;
            if (val2 > val3) {
                maior2 = val2;
            } else {
                maior2 = val3;
            }
        } else if (val2 > val1 && val2 > val3) {
            maior1 = val2;
            if (val1 > val3) {
                maior2 = val1;
            } else {
                maior2 = val3;
            }
        } else {
            maior1 = val3;
            if (val1 > val2) {
                maior2 = val1;
            } else {
                maior2 = val2;
            }
        }

        return maior1 + maior2;
    }

    public static String fibonacci() {
        int val1 = 0;
        int val2 = 1;
        int proximo = 0;
        String sequenciaFibonacci = val1 + "," + val2;

        for (int i = 1; i <= 11; i++) {
            proximo = val1 + val2;
            val1 = val2;
            val2 = proximo;


            sequenciaFibonacci += "," + proximo;
        }
        return sequenciaFibonacci;
    }

    public static void baskara() {

        Double delta, x1, x2;
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de A"));
        Double b = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de B"));
        Double c = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de C"));

        delta = (b * b) - (4 * a * c);

        /* PASSE  A =1,B= 4 e C=5 */
        if (delta < 0)
        {
            System.out.println("Delta menor que zero. A equação não possui resultados reais");
        }

        else
        {
            x1 = (-b + Math.sqrt(delta))/(2 * a);
            x2 = (-b - Math.sqrt(delta))/(2 * a);

            /* PASSE A =4,B= 4 e C=1 */
            if (delta == 0)
            {
                System.out.println("A equação possui apenas um resultado real ou \n dois resultados iguais");
            }

            /* PASSE  A =1,B= 5 e C=6 */
            if (delta > 0)
            {
                System.out.println("A equação possui dois resultados distintos reais.");
            }


            System.out.println("O Valor de delta é: " + delta);
            System.out.println("O Valor de x1 é: " + Math.round(x1) + ", o valor de x2 é: " + Math.round(x2));
        }
    }

    /* EXERCICIOS CODEWARS ESTEIRA YAMAN*/
    public static int toBinary(int n) {
        int quociente = n/2;
        int resto = n%2;
        String seqBinario = Integer.toString(resto);

        do{
            resto = quociente%2;
            quociente = quociente/2;
            seqBinario += resto;

        }while (quociente != 1);

        seqBinario += "1";

        String[] arrayBinario = seqBinario.split("");
        String seqBinarioInvertido = "";

        for(int i = arrayBinario.length - 1;i >=0;i--){
            seqBinarioInvertido +=arrayBinario[i] + "";
        }
        return Integer.parseInt((seqBinarioInvertido));
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int somaArr1 = 0, somaArr2 = 0;

        for (int i=0; i < arr1.length; i++){
            somaArr1 += arr1[i];
        }

        for (int j=0; j < arr2.length; j++){
            somaArr2 += arr2[j];
        }
        return somaArr1+somaArr2;
    }

    public static String tripleTrouble(String one, String two, String three) {
        String fourTogether = "";

        for (int i=0;i < one.length();i++){
            fourTogether += one.charAt(i) + "" + two.charAt(i) + "" + three.charAt(i);
        }

        return fourTogether;
    }

    public static double fuelPrice(int litres, double pricePerLiter) {
        Double discount = 0.00;
        Double discountperlitres = 0.00;

        if (litres >= 2 && litres <4){
            discount = 0.05;
        }else if (litres >= 4 && litres<6){
            discount = 0.10;
        }else if (litres >= 6 && litres<8){
            discount = 0.15;
        }else if (litres >= 8 && litres<10){
            discount = 0.20;
        } else if(litres >=10){
            discount = 0.25;
        }

        discountperlitres = litres * discount;
        return  (litres * pricePerLiter) - discountperlitres;

    }

    public static int startSmoking(int bars,int boxes) {
        int smoked = ((bars * 10) + boxes) * 18;
        int smokedExtras = 0;
        int cigarretes = smoked;

        while (cigarretes - 5 > 0) {
            smokedExtras++;
            cigarretes -=4;
        }
        return smoked + smokedExtras;
    }


}