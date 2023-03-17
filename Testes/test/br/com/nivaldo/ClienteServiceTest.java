package br.com.nivaldo;

import br.com.nivaldo.dao.ClienteDao;
import br.com.nivaldo.dao.ClienteDaoMock;
import br.com.nivaldo.dao.IClienteDao;
import br.com.nivaldo.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author nivaldo
 */
public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}
