/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author davi1
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        // TODO code application logic here
    }
    
    public class Turma {
    Aluno Alunos[] = new Aluno[5];
    
}
    
    public class Aluno {
    public ArrayList<String> nome;
    public ArrayList <Integer> ra;
    public ArrayList <Double> nota1, nota2, nota3, nota4;
    
    public  Aluno (){
        nome = new ArrayList<>();
        ra = new ArrayList<>();
        nota1 = new ArrayList<>();
        nota2 = new ArrayList<>();
        nota3 = new ArrayList<>();
        nota4 = new ArrayList<>();
    }
    
    public void addNome(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe nome do aluno:");
        String aNome = entrada.nextLine();
        nome.add(aNome);        
    }
    public void addRa(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe RA do aluno:");
        int aRa = entrada.nextInt();
        ra.add(aRa);        
    }
    public void addNota1(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe nome do aluno:");
        double aNota1 = entrada.nextDouble();
        nota1.add(aNota1);        
    }
    public void addNota2(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe nome do aluno:");
        double aNota2 = entrada.nextDouble();
        nota2.add(aNota2);        
    }
    public void addNota3(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe nome do aluno:");
        double aNota3 = entrada.nextDouble();
        nota3.add(aNota3);        
    }
    public void addNota4(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe nome do aluno:");
        double aNota4 = entrada.nextDouble();
        nota4.add(aNota4);        
    }
    
}
    
}
