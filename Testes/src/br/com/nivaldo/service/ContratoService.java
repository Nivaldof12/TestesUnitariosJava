package br.com.nivaldo.service;

import br.com.nivaldo.dao.IContratoDao;

/**
 * @author nivaldo
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Buscando...";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "excluído";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";
    }
}
