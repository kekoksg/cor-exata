package com.kelvin.corexata.service;

import com.kelvin.corexata.dto.MarcaRequest;
import com.kelvin.corexata.model.Marca;

import java.util.List;

public interface MarcaService {
    List<Marca> buscarTodasMarcas();

    Marca buscarMarcaPorId(Long id);

    Marca buscarMarcaPorNome(String nome);

    Marca criarMarca(MarcaRequest marcaRequest);

    Marca atualizarMarca(Long id, MarcaRequest marcaRequest);

    void deletarMarca(Long id);
}
