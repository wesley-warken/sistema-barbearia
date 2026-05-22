package com.barbearia.api.controller;

import com.barbearia.api.model.Agendamento;
import com.barbearia.api.service.AgendamentoService;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST responsável por expor os endpoints de agendamento.
 */
@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    /**
     * Inicializa o controlador com a injeção de dependência do serviço.
     * 
     * @param service Serviço de agendamentos.
     */
    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    /**
     * Endpoint HTTP POST para criar um novo agendamento.
     * 
     * @param novoAgendamento Objeto contendo os dados do agendamento enviados no corpo da requisição.
     * @return O agendamento criado com status HTTP correspondente.
     */
    @PostMapping
    public Agendamento criar(@RequestBody Agendamento novoAgendamento) {
        return service.criarAgendamento(novoAgendamento);
    }
}
