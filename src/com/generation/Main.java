package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Estructura de control if
       /*
       if(condicion){

        } else if(){

        } else {

        }
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su edad");

        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre?");
        sc.nextLine();
        String nombre = sc.nextLine();

        if(edad > 18){
            System.out.println("Felicidades, " + nombre + " ya puedes votar");
        } else {
            System.out.println("Que onda, " + nombre + " aun no puedes votar homi");
        }

        sc.close();
        */

        /*
         * Solicitar al usuario 3 angulos de un triangulo y determinar si el triangulo es válido.
         * */

       /* Scanner sc = new Scanner(System.in);


        System.out.println("Digite el angulo 1");
        int lado1 = sc.nextInt();
        System.out.println("Digite el angulo 2");
        sc.nextLine();
        int lado2 = sc.nextInt();
        System.out.println("Digite el angulo 3");
        sc.nextLine();
        int lado3 = sc.nextInt();
        int sumaAngulos = lado1 + lado2 + lado3;
        if(sumaAngulos == 180){
            System.out.println("El Triangulo es valido, es un Triangulo de: "+ sumaAngulos + "°");
        } else
           {
                System.out.println("El Triangulo no es valido.");
            }
        sc.close();
        */

        /*
        *Pedir un año al usuario por consola, y determinar si el año es bisiesto.
        */
        /*

        Scanner sc = new Scanner(System.in);
        int anio;
        System.out.println("Ingresa un año");
        anio = sc.nextInt();
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("El año " + anio + " es bisiesto");
        } else {
            System.out.println("El año " + anio + " no es bisiesto");
        }
        sc.close();
        */

        // Control de flujo switch.
        /*
        switch (condicion){
            case 1:
                codigo
                        case 2:
                codigo
                        break;
            default:
                break;
        }
        */

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa otro numero: ");
        int b = sc.nextInt();
        System.out.println("Ingresa la operacion deseada: \n1) Suma \n2) Resta \n3) Multiplicacion \n4) Division ");
        int opc = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch (opc){
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                resultado = a / b;
                break;
            default:
                System.out.println("La operación que seleccionaste es inválida");
        }
        sc.close();
        System.out.println(resultado);
        */
        // Pedir un número al usuario y dependiendo la respuesta mostrar un dia de la semana, ejemplo:
        // 1)Domingo, 2)Lunes ... 7)Sabado
        // Si elige un número fuera de ese rango mostrar un mensaje de error;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int nday = sc.nextInt();

        switch (nday){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Error");
        }
        sc.close();
        System.out.println(nday);

    }
}
