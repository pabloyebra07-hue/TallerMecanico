package org.iesalandalus.programacion.tallermecanico.controlador;

import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Trabajo;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;

import java.time.LocalDate;
import java.util.List;

public interface IControlador {
    void comenzar();

    void terminar();

    void insertarCliente(Cliente cliente) throws TallerMecanicoExcepcion;

    void insertarVehiculo(Vehiculo vehiculo) throws TallerMecanicoExcepcion;

    void insertarRevision(Trabajo trabajo) throws TallerMecanicoExcepcion;

    Cliente buscarCliente(Cliente cliente);

    Vehiculo buscarVehiculo(Vehiculo vehiculo);

    Trabajo buscarRevision(Trabajo trabajo);

    Cliente modificarCliente(Cliente cliente, String nombre, String telefono) throws TallerMecanicoExcepcion;

    Trabajo anadirHoras(Trabajo trabajo, int horas) throws TallerMecanicoExcepcion;

    Trabajo anadirPrecioMaterial(Trabajo trabajo, float precioMaterial) throws TallerMecanicoExcepcion;

    Trabajo cerrarRevision(Trabajo trabajo, LocalDate fechaFin) throws TallerMecanicoExcepcion;

    void borrarCliente(Cliente cliente) throws TallerMecanicoExcepcion;

    void borrarVehiculo(Vehiculo vehiculo) throws TallerMecanicoExcepcion;

    void borrarRevision(Trabajo trabajo) throws TallerMecanicoExcepcion;

    List<Cliente> listarClientes();

    List<Vehiculo> listarVehiculos();

    List<Trabajo> listarRevisiones();

    List<Trabajo> listarRevisionesCliente(Cliente cliente);

    List<Trabajo> listarRevisionesVehiculo(Vehiculo vehiculo);
}
