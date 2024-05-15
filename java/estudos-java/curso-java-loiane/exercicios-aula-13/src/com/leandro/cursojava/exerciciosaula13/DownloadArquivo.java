package com.leandro.cursojava.exerciciosaula13;

import java.util.Scanner;

public class DownloadArquivo {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo para download(MB)? ");
        int tamanhoArquivo = scanner.nextInt();

        System.out.println("Qual a velocidade internet(Mbps)? ");
        int velocidadeInternet = scanner.nextInt();

        int tempoDownload = tamanhoArquivo / velocidadeInternet;

        System.out.println("Tempo aproximado de download: " + tempoDownload + " minutos");

    }
}
