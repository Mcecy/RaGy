package application;

import java.lang.System;
import java.util.Scanner;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> func = new ArrayList<>();

        System.out.println("Quantos funcionario serao registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            System.out.println("Insira os dados do funcionario " + i + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();

            Funcionario funcionario = new Funcionario(id, name, salario);

            func.add(funcionario);
        }

        System.out.println("Algum aumento sera dado?(s/n) ");
        
        String resp = sc.next().toUpperCase();

        if (resp == "S") {
            System.out.println("Qual o id do funcionario que recebera o aumento? ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.println("De quanto sera o aumento? ");
            double raise = sc.nextDouble();

            boolean idFound = false;

            for (Funcionario funcionario : func) {
                if (funcionario.getId() == id) {
                    idFound = true;
                    funcionario.aumentoSalario(raise);
                }
            }

            if (idFound == false) {
                System.out.println("Id nao encontrado.");
            }

        }

        System.out.println("Lista de funcionarios: ");

        for (Funcionario funcionario : func) {
            System.out.println(funcionario.toString());
        }

        sc.close();

    }
}
