package tn.esprit.interfaces;

import java.util.List;

public interface InterfaceCRUD <T> {
    //CRUD
    public void add(T t);
    public void add2(T t);
    public void delete(T t);
    public void update(T t);
    public List<T> getAll();
}
