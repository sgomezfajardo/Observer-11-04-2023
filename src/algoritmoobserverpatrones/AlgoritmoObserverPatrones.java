/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmoobserverpatrones;

/**
 *
 * @author TUF ASUS
 */
public class AlgoritmoObserverPatrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Observer Devolucion = new Observer();
            Subject sub1 = new Subject();
            sub1.registrado(Devolucion);
            System.out.println("El libro ha sido devuelto");
            System.out.println("estado del libro 1");
            sub1.setLibro(1);
            System.out.println("Setting Flag = 25 ");
            sub1.setLibro(25);
            sub1.Desregistrado(Devolucion);
            System.out.println("Setting Flag = 50 ");
            sub1.setLibro(50);
    }
    
}
