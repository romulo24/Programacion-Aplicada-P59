package ejercicio5_bloqueos1;

import patron_generico.*;

public class banco implements configurable{
    
    public atributos_gen<Double, Integer> datos;
    private double [] cuentas; //Contener todas las cuentas de los clientes
    
    public banco()
    {
        datos = new atributos_gen<Double, Integer>(0.0,0);
        cuentas = new double[50]; //Inicializar el vector de carga de las cuentas
        actualizarCuentas();
    }
    
    public void actualizarCuentas()
    {
        for(int i=0;i<cuentas.length;i++)
        {
            cuentas[i]=1000;
        }
    }
    
    public double capital()
    {
        for (double valor : cuentas) 
            datos.setAtributoT1(datos.getAtributoT1().doubleValue() + valor);
        return datos.getAtributoT1().doubleValue();
    }
    
    public synchronized void transferencias(int cuentaOrigen, int cuentaDestino, double cantidad)
    {
        while(cuentas[cuentaOrigen] < cantidad)
        {
            printUI("$$$$$$$$$$$$$$$$$$$$$$$$$$\t wait(\tHilo: " + Thread.currentThread() + "$$$$$$$$$$$$$$$$$$$$$$$$$$",2);
            printUI("Cuenta de origen:\t" + cuentaOrigen + "\nCuenta de destino:\t"+ cuentaDestino, 2);
            printUI("-------Cantidad de retiro: " + cantidad + "\t Saldo en la cuenta: " + cuentas[cuentaOrigen] + "\tno es posible realizar la transferencia",2);
            try {
                wait(); //Bloquea la ejecucion del hilo
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        printUI("\t*************HILO:\t" + Thread.currentThread() + "\t*************",2);
        //Retiro de dinero
        cuentas[cuentaOrigen] -= cantidad;
        printUI("RETIRO DE LA CUENTA #: " + cuentaOrigen + "\tCANTIDAD DE RETIRO: " + cantidad + "\tSALDO: " + cuentas[cuentaOrigen], 2);
        //Deposito de dinero
        cuentas[cuentaDestino] += cantidad;
        printUI("DEPOSITO EN LA CUENTA #: " + cuentaDestino + "\tCANTIDAD DE DEPOSITO: " + cantidad + "\tSALDO: " + cuentas[cuentaDestino], 2);
        printUI("----------------------------CAPITAL----------------------------" + capital(), 2);
        notifyAll(); //Liberar a todos hilos bloqueados
    }
    
}