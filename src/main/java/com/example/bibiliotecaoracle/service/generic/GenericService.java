package com.example.bibiliotecaoracle.service.generic;

import com.example.bibiliotecaoracle.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public interface GenericService<T> {
    public T create(T t) throws ServiceException;
    public T update(T t) throws ServiceException;
    public void delete(Long id) throws ServiceException;
    public Optional<T> read(Long id) throws ServiceException;
    public List<T> readAll() throws ServiceException;

}
