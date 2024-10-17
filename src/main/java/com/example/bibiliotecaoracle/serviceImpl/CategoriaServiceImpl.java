package com.example.bibiliotecaoracle.serviceImpl;

import com.example.bibiliotecaoracle.dto.CategoriaDTO;
import com.example.bibiliotecaoracle.service.CategoriaService;
import com.example.bibiliotecaoracle.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public class CategoriaServiceImpl implements CategoriaService {

    @Override
    public CategoriaDTO create(CategoriaDTO categoriaDTO) throws ServiceException {
        return null;
    }

    @Override
    public CategoriaDTO update(CategoriaDTO categoriaDTO) throws ServiceException {
        return null;
    }

    @Override
    public void delete(Long id) throws ServiceException {

    }

    @Override
    public Optional<CategoriaDTO> read(Long id) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public List<CategoriaDTO> readAll() throws ServiceException {
        return null;
    }
}
