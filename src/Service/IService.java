package service;

import model.Cliente;

import java.sql.SQLException;

public interface IService<E> {

    public E save(E cliente) throws SQLException, ClassNotFoundException;

    public E update(E cliente) throws SQLException, ClassNotFoundException;

    public E delete(E cliente) throws SQLException, ClassNotFoundException;

}
