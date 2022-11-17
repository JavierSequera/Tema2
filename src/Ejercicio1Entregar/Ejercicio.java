package Ejercicio1Entregar;

public class Ejercicio extends Thread {


    @Override
    public void run() {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int aleatorio;

        //Bucle infinito
        while(true) {
            System.out.println("Soy el bucle "+this.getName()+" y estoy trabajando");
            //Numero aleatorio
            aleatorio = (int)(Math.random() * range) + min;
            try{
                //Tiempo de espera
                Thread.sleep(aleatorio*1000);
            }catch(Exception ex) {
                System.out.println(ex);
            }
        }
    }


    public static void main(String[] args) {
        //Lanzamiento de los 5 bucles
        for (int i = 0; i < 5; i++) {
            Thread hilo = new Ejercicio();
            hilo.setName("Bucle "+i);
            hilo.start();
        }
    }
}
