package br.com.ibk.v1.contabancaria;

import br.com.ibk.v1.ebo.BancoType;
import br.com.ibk.v1.ebo.ContaBancariaType;

/**
 * 
 * @author Tayron
 *
 */
public class CarregarContaBancariaImpl implements CarregarContaBancariaPortType 
{
	/**
	 * 
	 */
	public CarregarContaBancariaPorCnpjPessoaOutputType carregarPorCnpjPessoa(
		CarregarContaBancariaPorCnpjPessoaInputType input) throws ContaBancariaFault 
	{
		BancoType banco = new BancoType();
		banco.setCodigo("001");
		banco.setNome("Banco do Brasil");
		
		ContaBancariaType conta = new ContaBancariaType();
		conta.setBanco(banco);
		conta.setCodigo(1l);
		conta.setNumeroAgencia("1234");
		conta.setDigitoVerificadorAgencia("5");
		conta.setNumeroConta("0101456");
		conta.setDigitoVerificadorConta("7");
		
		CarregarContaBancariaPorCnpjPessoaOutputType out = new CarregarContaBancariaPorCnpjPessoaOutputType();
		out.setContaBancaria(conta);
		
		return out;
	}

	/**
	 * 
	 */
	public CarregarContaBancariaPorCodigoPessoaOutputType carregarPorCodigoPessoa(
			CarregarContaBancariaPorCodigoPessoaInputType input) throws ContaBancariaFault 
	{
		return null;
	}
}