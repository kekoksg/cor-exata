package com.kelvin.corexata.service.Impl;

import com.kelvin.corexata.dto.MarcaRequest;
import com.kelvin.corexata.model.Marca;
import com.kelvin.corexata.repository.MarcaRepository;
import com.kelvin.corexata.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public List<Marca> buscarTodasMarcas() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca buscarMarcaPorId(Long id) {
        return marcaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Marca não encontrada"));
    }

    @Override
    public Marca buscarMarcaPorNome(String nome) {
        return marcaRepository.findByNomeContainingIgnoreCase(nome);
    }

    @Override
    public Marca criarMarca(MarcaRequest marcaRequest) {
        if (marcaRepository.findByNomeIgnoreCase(marcaRequest.nome()).isPresent()) {
            throw new RuntimeException("Já existe outra marca com o mesmo nome");
        }
        Marca novaMarca = new Marca(marcaRequest.nome());
        return marcaRepository.save(novaMarca);
    }

    @Override
    public Marca atualizarMarca(Long id, MarcaRequest marcaAtualizada) {
        Marca marcaExistente = buscarMarcaPorId(id);

        Optional<Marca> marcaComMesmoNome = marcaRepository.findByNomeIgnoreCase(marcaAtualizada.nome());
        if (marcaComMesmoNome.isPresent() && !marcaComMesmoNome.get().getId().equals(id)) {
            throw new RuntimeException("Já existe outra marca com o nome " + marcaAtualizada.nome());
        }

        marcaExistente.setNome(marcaAtualizada.nome());
        return marcaRepository.save(marcaExistente);
    }

    @Override
    public void deletarMarca(Long id) {
        Marca marcaExistente = buscarMarcaPorId(id);
        marcaRepository.delete(marcaExistente);
    }
}
