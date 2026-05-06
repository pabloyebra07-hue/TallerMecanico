package org.iesalandalus.programacion.tallermecanico.controlador;

import org.iesalandalus.programacion.tallermecanico.modelo.cascada.ModeloCascada;
import org.iesalandalus.programacion.tallermecanico.modelo.TallerMecanicoExcepcion;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Cliente;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Trabajo;
import org.iesalandalus.programacion.tallermecanico.modelo.dominio.Vehiculo;
import org.iesalandalus.programacion.tallermecanico.vista.Vista;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Controlador implements IControlador {
    private ModeloCascada modeloCascada;
    private Vista vista;

    public Controlador(ModeloCascada modeloCascada, Vista vista) {
        Objects.requireNonNull(vista,"La vista no puede ser nula");
        Objects.requireNonNull(modeloCascada,"El modelo no puede ser nulo");
        vista.setControlador(this);
        this.modeloCascada = modeloCascada;
        this.vista = vista;
    }

    @Override
    public void comenzar(){
        modeloCascada.comenzar();
        vista.comenzar();
    }

    @Override
    public void terminar(){
        modeloCascada.terminar();
        vista.terminar();
    }

    @Override
    public void insertarCliente(Cliente cliente) throws TallerMecanicoExcepcion {
        modeloCascada.insertar(cliente);
    }

    @Override
    public void insertarVehiculo(Vehiculo vehiculo) throws TallerMecanicoExcepcion {
        modeloCascada.insertar(vehiculo);
    }

    @Override
    public void insertarRevision(Trabajo trabajo) throws TallerMecanicoExcepcion {
        modeloCascada.insertar(trabajo);
    }

    @Override
    public Cliente buscarCliente(Cliente cliente){
        return modeloCascada.buscar(cliente);
    }

    @Override
    public Vehiculo buscarVehiculo(Vehiculo vehiculo){
        return modeloCascada.buscar(vehiculo);
    }

    @Override
    public Trabajo buscarRevision(Trabajo trabajo){
        return modeloCascada.buscar(trabajo);
    }

    @Override
    public Cliente modificarCliente(Cliente cliente, String nombre, String telefono) throws TallerMecanicoExcepcion {
        return modeloCascada.modificar(cliente, nombre, telefono);
    }

    @Override
    public Trabajo anadirHoras(Trabajo trabajo, int horas) throws TallerMecanicoExcepcion {
        return modeloCascada.anadirHoras(trabajo, horas);
    }

    @Override
    public Trabajo anadirPrecioMaterial(Trabajo trabajo, float precioMaterial) throws TallerMecanicoExcepcion {
        return modeloCascada.anadirPrecioMaterial(trabajo,precioMaterial);
    }

    @Override
    public Trabajo cerrarRevision(Trabajo trabajo, LocalDate fechaFin) throws TallerMecanicoExcepcion {
        return modeloCascada.cerrar(trabajo,fechaFin);
    }

    @Override
    public void borrarCliente(Cliente cliente) throws TallerMecanicoExcepcion {
        modeloCascada.borrar(cliente);
    }

    @Override
    public void borrarVehiculo(Vehiculo vehiculo) throws TallerMecanicoExcepcion {
        modeloCascada.borrar(vehiculo);
    }

    @Override
    public void borrarRevision(Trabajo trabajo) throws TallerMecanicoExcepcion {
        modeloCascada.borrar(trabajo);
    }

    @Override
    public List<Cliente> listarClientes(){
        return modeloCascada.getClientes();
    }

    @Override
    public List<Vehiculo> listarVehiculos(){
        return modeloCascada.getVehiculos();
    }

    @Override
    public List<Trabajo> listarRevisiones(){
        return modeloCascada.getRevisiones();
    }

    @Override
    public List<Trabajo> listarRevisionesCliente(Cliente cliente){
        return modeloCascada.getRevisiones(cliente);
    }

    @Override
    public List<Trabajo> listarRevisionesVehiculo(Vehiculo vehiculo){
        return modeloCascada.getRevisiones(vehiculo);
    }


}