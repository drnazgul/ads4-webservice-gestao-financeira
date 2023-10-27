package br.senac.go.gestaofinanceirasenacv003.service;

import br.senac.go.gestaofinanceirasenacv003.interfaces.IService;
import br.senac.go.gestaofinanceirasenacv003.model.TipoInvestimento;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TipoInvestimentoService implements IService<TipoInvestimento, Integer> {

    @Override
    public TipoInvestimento create(TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoService.create");
        log.debug(String.format("Executado método TipoInvestimentoService.create | valores: %s",entity.toString()));

        return null;
    }

    @Override
    public TipoInvestimento readById(Integer id) throws Exception {
        log.info("Executado método TipoInvestimentoService.readById");
        log.debug(String.format("Executado método TipoInvestimentoService.readById | valores: %d",id));

        return null;
    }

    @Override
    public TipoInvestimento read(TipoInvestimento entity) throws Exception {
        log.info("Executado método TipoInvestimentoService.read");
        log.debug(String.format("Executado método TipoInvestimentoService.read | valores: %s",entity.toString()));

        return null;
    }

    @Override
    public TipoInvestimento update(TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoService.update");
        log.debug(String.format("Executado método TipoInvestimentoService.update | valores: %s",entity.toString()));

        return null;
    }

    @Override
    public TipoInvestimento updatePart(Integer id, TipoInvestimento entity) throws Exception {
        log.info("Executado método TipoInvestimentoService.updatePart");
        log.debug(String.format("Executado método TipoInvestimentoService.updatePart | valores: %d %s", id, entity.toString()));

        return null;
    }

    @Override
    public TipoInvestimento updateFull(Integer id, TipoInvestimento entity) {
        log.info("Executado método InvestimentoService.updateFull");
        log.debug(String.format("Executado método InvestimentoService.updateFull | valores: %d %s",id,entity.toString()));

        return null;
    }

    @Override
    public TipoInvestimento deleteById(Integer id) {
        log.info("Executado método TipoInvestimentoService.deleteById");
        log.debug(String.format("Executado método TipoInvestimentoService.deleteById | valores: %d", id));

        return null;
    }

    @Override
    public TipoInvestimento delete(TipoInvestimento entity) {
        log.info("Executado método TipoInvestimentoService.delete");
        log.debug(String.format("Executado método TipoInvestimentoService.delete | valores: %s",entity.toString()));

        return null;
    }
}