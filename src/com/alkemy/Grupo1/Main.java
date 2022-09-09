package com.alkemy.Grupo1;

public class Main {

    public static void main(String[] args) {

        int[] VentasDeCadaVendedor = {3230 , 6300 , 9342 , 6534 , 9876 , 3563 , 4211 , 5987 ,
                                      6756 , 2284 , 3405 , 4409 , 18000 , 51231 , 6623 , 7734 ,
                                      5823 , 3394 , 9405 , 8923 , 42313 , 5495 , 6201 , 7340};
        
        int sueldo = 200;
        int comision;
        int sueldoComision = 0;
        int rangoInicio;
        int rangoFinal;
        
        for(int i = 2; i < 11; i++){
            int contador =0;
            if(i == 10){
                for (int j = 0; j < VentasDeCadaVendedor.length; j++){
                    
                    comision = (int) (VentasDeCadaVendedor[j] * 0.09);
                    sueldoComision = sueldo + comision;
                        
                    if(sueldoComision > 1000){
                        contador++;
                    }
                }
                System.out.printf("%d: " + contador +  "\n", 1000);
            }else{
                rangoInicio = i * 100;
                rangoFinal = rangoInicio + 99;
                
                for (int j = 0; j < VentasDeCadaVendedor.length; j++){
                    
                    comision = (int) (VentasDeCadaVendedor[j] * 0.09);
                    sueldoComision = sueldo + comision;
                    
                    if(sueldoComision >= rangoInicio && sueldoComision <= rangoFinal){
                    contador++;
                    }
                }
                System.out.printf("%02d-%02d:" + contador + "\n", rangoInicio, rangoFinal);
            }
        }

    }
}
