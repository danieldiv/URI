package util;

import java.io.IOException;

class No {

    private int valor;
    private No esquerda;
    private No direita;

    public No() {
    }

    public No(int valor, No esquerda, No direita) {
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

    public static void imprimirPreOrderm(No n) {
//        System.out.println(n.toString());
        System.out.print(n.getValor() + " ");

        if (n.getEsquerda() != null) {
            imprimirPreOrderm(n.getEsquerda());
        }
        if (n.getDireita() != null) {
            imprimirPreOrderm(n.getDireita());
        }
    }

    public static void imprimirEmOrderm(No n) {
        if (n.getEsquerda() != null) {
            imprimirEmOrderm(n.getEsquerda());
        }

        System.out.print(n.getValor() + " ");

        if (n.getDireita() != null) {
            imprimirEmOrderm(n.getDireita());
        }
    }

    public static void imprimirPosOrderm(No n) {
        if (n.getEsquerda() != null) {
            imprimirPosOrderm(n.getEsquerda());
        }

        if (n.getDireita() != null) {
            imprimirPosOrderm(n.getDireita());
        }

        System.out.print(n.getValor() + " ");

    }

    @Override
    public String toString() {
        return "No:{" + "V=" + valor + ", Eq=" + esquerda + ", Dir=" + direita + '}';
    }

}

public class Arvore_Binaria {

    public static void main(String[] args) throws IOException {
        No no = new No(15, new No(10, null, null), new No(50, new No(20, null, null), new No(55, null, new No(60, null, null))));

//        System.out.println(no.toString());
        System.out.println("Pre-Ordem:");
        No.imprimirPreOrderm(no);

        System.out.println("\nEm-Ordem:");
        No.imprimirEmOrderm(no);
        
        System.out.println("\nPos-Ordem:");
        No.imprimirPosOrderm(no);
    }

}
