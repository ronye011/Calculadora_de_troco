import java.util.Scanner;

public class Troco {

    private double compraValor = 0;
    private double compraRecebido = 0;
    private double troco = 0;
    int[] quantTroco = new int[12];
    double[] notas = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05};

    public void getTroco() {
        double trocoCalculo = troco;
        while (trocoCalculo > 0) {
            if (trocoCalculo >= 200) {
                while (trocoCalculo >= 200) {
                    quantTroco[0]++;
                    trocoCalculo -= 200;
                }
            } else if (trocoCalculo >= 100) {
                while (trocoCalculo >= 100) {
                    quantTroco[1]++;
                    trocoCalculo -= 100;
                }
            } else if (trocoCalculo >= 50) {
                while (trocoCalculo >= 50) {
                    quantTroco[2]++;
                    trocoCalculo -= 50;
                }
            } else if (trocoCalculo >= 20) {
                while (trocoCalculo >= 20) {
                    quantTroco[3]++;
                    trocoCalculo -= 20;
                }
            } else if (trocoCalculo >= 10) {
                while (trocoCalculo >= 10) {
                    quantTroco[4]++;
                    trocoCalculo -= 10;
                }
            } else if (trocoCalculo >= 5) {
                while (trocoCalculo >= 5) {
                    quantTroco[5]++;
                    trocoCalculo -= 5;
                }
            } else if (trocoCalculo >= 2) {
                while (trocoCalculo >= 2) {
                    quantTroco[6]++;
                    trocoCalculo -= 2;
                }
            } else if (trocoCalculo >= 1) {
                while (trocoCalculo >= 1) {
                    quantTroco[7]++;
                    trocoCalculo -= 1;
                }
            } else if (trocoCalculo >= 0.5) {
                while (trocoCalculo >= 0.5) {
                    quantTroco[8]++;
                    trocoCalculo -= 0.5;
                }
            } else if (trocoCalculo >= 0.25) {
                while (trocoCalculo >= 0.25) {
                    quantTroco[9]++;
                    trocoCalculo -= 0.25;
                }
            } else if (trocoCalculo >= 0.1) {
                while (trocoCalculo >= 0.1) {
                    quantTroco[10]++;
                    trocoCalculo -= 0.1;
                }
            } else if (trocoCalculo >= 0.05) {
                while (trocoCalculo > 0.00) {
                    quantTroco[11]++;
                    trocoCalculo -= 0.05;
                }
            }
        }
        System.out.println("Valor Total das Compras: R$ " + compraValor);
        System.out.println("Valor Recebido: R$ " + compraRecebido);
        System.out.println("Troco: R$ " + troco);
        for(int i = 0; i < 12; i++) {
            if (quantTroco[i] != 0) {
                if (quantTroco[i] == 1) {
                    if (notas[i] > 1) {
                        System.out.println(quantTroco[i] + " Nota: R$ " + notas[i]);
                    } else {
                        System.out.println(quantTroco[i] + " Moeda: R$ " + notas[i]);
                    }
                } else {
                    if (notas[i] > 1) {
                        System.out.println(quantTroco[i] + " Notas: R$ " + notas[i]);
                    } else {
                        System.out.println(quantTroco[i] + " Moedas: R$ " + notas[i]);
                    }
                }
            }
        }

    }

    public void setTroco() {
        this.troco = this.compraRecebido - this.compraValor;
    }

    public Troco() {}

    public void Informacoes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do compra: ");
        compraValor = sc.nextDouble();
        System.out.print("\nDigite o valor do pagamento: ");
        compraRecebido = sc.nextDouble();
        sc.close();
    }
}
