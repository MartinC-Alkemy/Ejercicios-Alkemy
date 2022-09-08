package com.alkemy.Grupo3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int operacion;
        int num1;
        int num2;
        int[] resultados = new int[6];


        for (int i=0; i<6; i++){
            System.out.println(" ----- CALCULADORA ------ ");

            System.out.println("Seleccione la operación que desea realizar: " );
            System.out.println("Suma(1), Resta(2), Multiplicación(3) o División(4)");

            Scanner leer = new Scanner(System.in);
            operacion = leer.nextInt();

            switch (operacion){
                case 1:
                    System.out.println("Ingrese dos números enteros a sumar: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();

                    if (num1<0 || num2 <0) {
                        while (num1 < 0 || num2 < 0) {
                            System.out.println("Los números ingresados deben ser positivos!!");
                            System.out.println("Ingrese dos números enteros a sumar: ");
                            num1 = leer.nextInt();
                            num2 = leer.nextInt();
                        }
                    }
                    int suma = num1 + num2;

                    resultados[i] = suma;

                    System.out.println("El resultado de la suma es: " + suma);
                    break;

                case 2:
                    System.out.println("Ingrese dos números enteros a restar: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();

                    if (num1<0 || num2 <0) {
                        while (num1 < 0 || num2 < 0) {
                            System.out.println("Los números ingresados deben ser positivos!!");
                            System.out.println("Ingrese dos números enteros a restar: ");
                            num1 = leer.nextInt();
                            num2 = leer.nextInt();
                        }
                    }
                    int resta = num1 - num2;

                    resultados[i] = resta;

                    System.out.println("El resultado de la resta es: " + resta);
                    break;

                case 3:
                    System.out.println("Ingrese dos números enteros a multiplicar: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    if (num1<0 || num2 <0) {
                        while (num1 < 0 || num2 < 0) {
                            System.out.println("Los números ingresados deben ser positivos!!");
                            System.out.println("Ingrese dos números enteros a multiplicar: ");
                            num1 = leer.nextInt();
                            num2 = leer.nextInt();
                        }
                    }
                    int multiplicacion = num1 * num2;

                    resultados[i] = multiplicacion;

                    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                    break;

                case 4:
                    System.out.println("Ingrese dos números enteros a dividir: ");
                    num1 = leer.nextInt();
                    num2 = leer.nextInt();
                    if (num1<0 || num2 <0) {
                        while (num1 < 0 || num2 < 0) {
                            System.out.println("Los números ingresados deben ser positivos!!");
                            System.out.println("Ingrese dos números enteros a dividir: ");
                            num1 = leer.nextInt();
                            num2 = leer.nextInt();
                        }
                    }
                    int division = num1 / num2;

                    resultados[i] = division;

                    System.out.println("El resultado de la división es: " + division);
                    break;
                default:
            }
        }

        //arreglo
        System.out.println("El historial de tu calculadora es: " );
        for (int resultado : resultados){
            System.out.println(resultado);
        }




    }




}
