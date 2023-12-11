package com.eliasfs06.tinktime.controller;

import ch.qos.logback.core.model.Model;
import com.eliasfs06.tinktime.exceptionsHandler.BusinessException;
import com.eliasfs06.tinktime.model.*;
import com.eliasfs06.tinktime.model.dto.PropostaOrcamentoDTO;
import com.eliasfs06.tinktime.model.dto.PropostaIdeiaDTO;
import com.eliasfs06.tinktime.service.ClientService;
import com.eliasfs06.tinktime.service.PropostaOrcamentoService;
import com.eliasfs06.tinktime.service.PropostaIdeiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/proposta-orcamento")
public class PropostaOrcamentoController {

    @Autowired
    private PropostaOrcamentoService propostaOrcamentoService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private PropostaIdeiaService propostaIdeiaService;


    @GetMapping("/list")
    public ModelAndView listOrcamentos(){
        ModelAndView modelAndView = new ModelAndView();
        User cliente = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<PropostaOrcamento> propostasList = propostaOrcamentoService.listPropostasByClienteID(cliente.getId());
        modelAndView.addObject("propostasList", propostasList);
        modelAndView.setViewName("propostaOrcamento/list");
        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView();
        List<Client> clientes = clientService.listClients();
        modelAndView.addObject("newOrcamento", new PropostaOrcamentoDTO());
        modelAndView.addObject("clientes", clientes);
        modelAndView.setViewName("propostaOrcamento/form");
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@RequestParam(value="propostaIdeia", required = true) String ideia,
                         @RequestParam(value="orcamento", required = true) String orcamento,
                         Model model) throws BusinessException {
        try {
            PropostaIdeiaDTO propostaIdeia = propostaIdeiaService.findById(Long.parseLong(ideia));
            propostaOrcamentoService.create(new PropostaOrcamentoDTO(propostaIdeia, Float.parseFloat(orcamento)));

        } catch (BusinessException e) {
            return "redirect:/index";
        }
        return "redirect:/index";
    }

    @GetMapping("/getOrcamentosAprovadosByIdeia")
    @ResponseBody
    public List<PropostaOrcamento> getOrcamentosAprovadosByIdeia(@RequestParam Long ideiaId) {
        return propostaOrcamentoService.findAllByStatusAprovacaoAndPropostaIdeiaId(ideiaId);
    }

    @GetMapping("/recusar/{id}")
    public String recusar(@PathVariable("id") Long id){
        try {
            propostaOrcamentoService.recusar(id);
            return "redirect:/proposta-orcamento/list";
        } catch (BusinessException e) {
            return "redirect:/index";
        }
    }

    @GetMapping("/aprovar/{id}")
    public String aprovar(@PathVariable("id") Long id){
        try {
            propostaOrcamentoService.aprovar(id);
            return "redirect:/proposta-orcamento/list";
        } catch (BusinessException e) {
            return "redirect:/index";
        }
    }

}
