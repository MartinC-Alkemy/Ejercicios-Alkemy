package com.alkemy.Grupo4;

import com.alkemy.Grupo4.entity.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Libia", "Freites", 44, 110000.00, "BBVA"));
        empleados.add(new Empleado("Carla", "Devincenzi", 36, 210000.00, "BBVA"));
        empleados.add(new Empleado("Homero", "Simpson", 39, 85000.00, "Planta Nuclear"));
        empleados.add(new Empleado("Moe", "syslak", 50, 70000.00, "Taberna de Moe"));
        empleados.add(new Empleado("Apu", "Najasanamapetila", 46, 300000.00, "QUICK-E-MART"));

        System.out.println("inciso 1");
        double maxSueldo = empleados.get(0).getSueldo();
        Empleado max = empleados.get(0);

        for(int i = 1; i < empleados.size(); i++){
            if(empleados.get(i).getSueldo() > maxSueldo){
                maxSueldo = empleados.get(i).getSueldo();
                max = empleados.get(i);
            }
        }

        System.out.println("El Empleado con mayor sueldo es: " + max.getNombre() + " " + max.getApellido() +
                " Sueldo: $" + max.getSueldo());

        System.out.println("---------------------------------------");
        System.out.println("inciso 2");

        double prom = 0.0;

        for(Empleado empleado: empleados){
            prom += empleado.getSueldo();
        }
        prom /= empleados.size();

        System.out.println("Promedio de sueldos: " + prom);
        System.out.println("---------------------------------------");
        System.out.println("inciso 3");

        int promEdad = 0;

        for(Empleado empleado: empleados){
            promEdad += empleado.getEdad();
        }
        promEdad /= empleados.size();
        System.out.println("Promedio de edades: " + promEdad);

        System.out.println("---------------------------------------");
        System.out.println("inciso 4");

        int uno = 0, dos = 0, tres = 0, cuatro = 0;
        //(UNO: de 18 a 25, DOS: de 26 a 35, TRES: de 36 a 45, CUATRO: 46 en adelante
        for(Empleado empleado: empleados){
            if(empleado.getEdad() >= 18 && empleado.getEdad() <= 25){
                uno++;
            }else if(empleado.getEdad() >= 26 && empleado.getEdad() <= 35){
                dos++;
            }else if(empleado.getEdad() >= 36 && empleado.getEdad() <= 45){
                tres++;
            }else if(empleado.getEdad() >= 46){
                cuatro++;
            }
        }

        System.out.println("Empleados categoria UNO: " + uno + " ,DOS: " + dos + " ,TRES: " + tres + " ,CUATRO: " + cuatro);

        System.out.println("---------------------------------------");
        System.out.println("inciso 5");

        System.out.println("La empresa con mayor cantidad de empleados es: " + maxEmployeesCompany(empleados));


    }

    public static String maxEmployeesCompany(List<Empleado> arr){
        int max = 0;
        String company = null;

        for(int i = 0; i < arr.size(); i++){
            int counter = 0;

            for (Empleado empleado : arr) {
                if (arr.get(i).getEmpresa().equals(empleado.getEmpresa())) {
                    counter++;
                }
            }
            if(counter > max){
                max = counter;
                company = arr.get(i).getEmpresa();
            }
        }
        return company;
    }
     /*  Ejercicio hecho en C
     int numMasRepetido(int arr[]) {

          int max = 0, masRep;

          for(int i = 0; i < sizeof(arr); i++){
            int cont = 0;
            for(int j = 0; j< sizeof(arr); j++){
              if(arr[i] == arr[j]){
                cont++;
              }
            }

            if(cont > max){
              max = cont;
              masRep = arr[i];
            }
          }

          return masRep;
    }

    int main()
    {
        int nums[] = {15, 30, 12, 11, 4, 15, 80, 15};
        printf("El numero mas repetido en el array es: %d \n", numMasRepetido(nums));

        return 0;
    }
    */
}
