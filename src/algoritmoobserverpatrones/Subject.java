/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmoobserverpatrones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TUF ASUS
 */
class Subject implements ISubject {

    List<Observer> observerList = new ArrayList<Observer>();
    private int Libro;

    public int getLibro() {
        return Libro;
    }

    public void setLibro(int Libro) {
        this.Libro = Libro;

        NotificacionObservers();
    }

    @Override
    public void registrado(Observer e) {
        observerList.add(e);
    }

    @Override
    public void Desregistrado(Observer e) {
        observerList.remove(e);
    }

    @Override
    public void NotificacionObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
}
