
/**
 * Programa que maneja las ventas del Supermercado Santa Fe
 *
 * @author (hfonseca778)
 * @version (23-02-2017)
 */

import  java.lang.Math;
import java.util.Scanner;
public class Supermercado
{
       
    
    public static void main(String args[])
    {
       int valorVenta;
       int modoPago;
       int salir = 1;
       int preguntaVenta = 1;
       int contador = 1;
       int totalVentas = 0;
       
       int ventaEfectivo=0;
       double porcentajeEfectivo=0;
       double totalPorcentajeEfectivo=0;
       int contadorEfectivo = 0;
       
       int ventaTarjeta=0;
       double porcentajeTarjeta=0;
       double totalPorcentajeTarjeta=0;
       int contadorTarjeta = 0;
       
       int ventaCuotas=0;
       double porcentajeCuotas=0;
       double totalPorcentajeCuotas=0;
       int contadorCuotas = 0;
       
       Scanner lector=new Scanner(System.in);
       System.out.print("\f");
       
       System.out.println("Bienvenido al Sistema POS del Supermercado Santa Fe"); 
       
       
       do{
        
       System.out.println("\nIndique el valor de la venta " + contador + " :"); 
       valorVenta = lector.nextInt();
       totalVentas = totalVentas + valorVenta; 
              
       do {
           System.out.println("\nSeleccione el medio de pago: ");
           System.out.println("1. Efectivo");
           System.out.println("2. Tarjeta");
           System.out.println("3. Plan Cuotas");
           System.out.println("Ingrese su opción: ");
           modoPago = lector.nextInt();
           if (modoPago == 1)
               {
               System.out.println("Seleccionaste la opción de pago en efectivo");
               
               ventaEfectivo = ventaEfectivo + valorVenta;
               porcentajeEfectivo = valorVenta * 0.05;
               totalPorcentajeEfectivo = totalPorcentajeEfectivo + porcentajeEfectivo;
               contadorEfectivo++; 
               
               break;
               }
            else if(modoPago == 2)
               {
               System.out.println("Seleccionaste la opción de pago con tarjeta");
               
               ventaTarjeta = ventaTarjeta + valorVenta;
               porcentajeTarjeta = valorVenta * 0.03;
               totalPorcentajeTarjeta = totalPorcentajeTarjeta + porcentajeTarjeta;
               contadorTarjeta++; 
               
               break; 
               }
           else if(modoPago == 3)
               {
               System.out.println("Seleccionaste la opción de pago en modo a cuotas");
               
               ventaCuotas = ventaCuotas + valorVenta;
               porcentajeCuotas = valorVenta * 0.02;
               totalPorcentajeCuotas = totalPorcentajeCuotas + porcentajeCuotas;
               contadorCuotas++; 
               
               break;    
               }
           else
               {
                System.out.println("Opción no valida\n");
                
               }           
           }
           
       while (salir == 1);
           contador++;
           System.out.println("\nVenta registrada");
           System.out.println("\n--------------------------------------------" );
           System.out.println("\nDesea registrar otra venta?");
           System.out.println("\n1. Si");
           System.out.println("\n2. No");
           preguntaVenta = lector.nextInt();
           
           
        }
        while (preguntaVenta==1);
        
        System.out.println("\nCantidad de ventas Totales: " + (contador - 1) + " ventas");
        System.out.println("\nValor total Ventas: $" + totalVentas + " pesos");
        System.out.println("\nValor total Ventas en Efectivo: $" + ventaEfectivo + " pesos");
        System.out.println("\nCantidad de ventas en Efectivo: " + contadorEfectivo + " ventas");
        System.out.println("\nValor total Ventas con Tarjeta: $" + ventaTarjeta + " pesos");
        System.out.println("\nCantidad de ventas con Tarjeta: " + contadorTarjeta + " ventas");
        System.out.println("\nValor total Ventas a Cuotas: $" + ventaCuotas + " pesos");
        System.out.println("\nCantidad de ventas a Cuotas: " + contadorCuotas + " ventas");
        System.out.println("\n--------------------------------------------" );
        System.out.println("\nEl vendedor obtuvo $" + totalPorcentajeEfectivo + " pesos por ventas en efectivo,\n $" + totalPorcentajeTarjeta + " pesos por ventas con tarjetas y\n  $" + totalPorcentajeCuotas + " pesos por ventas a cuotas");
        
    }
}
