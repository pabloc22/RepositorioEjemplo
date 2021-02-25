
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Calcu {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);//Scanner para numeros
        Scanner sr= new Scanner(System.in);//Scanner para cadena de respuesta (Si y no)
        double n1=0, n2=0,numerador=0,denominador=0;//Declaracion de variables 
        String opcion ="Si";//Declaracion de cadena para repetir menu
        int opc = 0; //Declaracion de variable para switch
        do{
        
            System.out.println("------Menu----------");
            System.out.println("-------1. Sumar-----");
            System.out.println("------2. Restar------");
            System.out.println("-----3. Multiplicacion---------");
            System.out.println("--------4. Division------------");
            System.out.println("----Escoja una opcion: ");
            opc= sc.nextInt();
            switch(opc){
                case 1:{
                    System.out.println("Ingrese el primer numero: ");
                    n1= sc.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    n2= sc.nextInt();
                    double suma = n1+n2;
                    System.out.println("La suma de los dos numeros es: "+suma);
                };break;
                
                case 2:{
                    System.out.println("Ingrese el primer numero: ");
                    n1= sc.nextInt();
                     System.out.println("Ingrese el segundo numero: ");
                    n2= sc.nextInt();
                    double resta = n1-n2;
                    System.out.println("La resta de los dos numeros es: "+resta);
                };break;
                
                case 3:{
                    System.out.println("Ingrese el primer numero: ");
                    n1= sc.nextInt();
                     System.out.println("Ingrese el segundo numero: ");
                    n2= sc.nextInt();
                    double multiplicacion = n1*n2;
                    System.out.println("La multiplicacion de los dos numeros es: "+multiplicacion);
                };break;
                
                case 4:{
                    System.out.println("Ingrese el numerador: ");
                    numerador= sc.nextInt();
                     System.out.println("Ingrese el denominador: ");
                    denominador= sc.nextInt();
                    if(denominador!=0){
                    double division = numerador/denominador;
                    System.out.println("La suma de los dos numeros es: "+division);
                    }
                    else{
                        System.out.println("Ingrese un denominador diferente de 0 e intente de nuevo");
                        
                    }
                };break;
                
            }
            
            System.out.println("Desea realizar otra opcion? Si/No");
            opcion = sr.nextLine();
            
        }while(opcion.equals("Si")|| opcion.equals("si"));
    }
    
}
