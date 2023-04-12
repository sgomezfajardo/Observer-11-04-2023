/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package algoritmoobserverpatrones;

/**
 *
 * @author TUF ASUS
 */
public interface ISubject {
    void registrado(Observer e);

    void Desregistrado(Observer e);

    void NotificacionObservers();
}