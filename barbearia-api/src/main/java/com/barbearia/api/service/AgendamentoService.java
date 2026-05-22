package com.barbearia.api.service;

import com.barbearia.api.model.Agendamento;
import com.barbearia.api.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Serviço responsável por gerenciar as regras de negócio de agendamentos.
 */
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    /**
     * Inicializa o serviço com a injeção de dependência do repositório.
     * 
     * @param repository Repositório de agendamentos.
     */
    public AgendamentoService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    /**
     * Registra um novo agendamento no sistema.
     * 
     * @param novoAgendamento Dados do agendamento a ser criado.
     * @return O agendamento salvo com identificador gerado.
     */
    public Agendamento criarAgendamento(Agendamento novoAgendamento) {
        // TODO: Validar se a barbearia está aberta no horário selecionado
        return repository.save(novoAgendamento);
    }

    /**
     * Recupera todos os agendamentos registrados.
     * 
     * @return Lista contendo todos os agendamentos.
     */
    public List<Agendamento> listarTodos() {
        return repository.findAll();
    }
}
