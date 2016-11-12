package br.com.ibk.v1.contabancaria;

/**
 * 
 * @author Tayron
 *
 */
public class MovimentarContaBancariaImpl implements MovimentarContaBancariaPortType	 
{
	/**
	 * 
	 */
	public RetirarDeContaBancariaOutputType retirarDeContaBancaria(
		RetirarDeContaBancariaInputType input)
		throws ContaBancariaFault 
	{
		RetirarDeContaBancariaOutputType contaBancaria = new RetirarDeContaBancariaOutputType();
		contaBancaria.setBoolean(true);
		return contaBancaria;
	}

	/**
	 * 
	 */
	public DepositarEmContaBancariaOutputType depositarEmContaBancaria(
		DepositarEmContaBancariaInputType input)
		throws ContaBancariaFault 
	{
		DepositarEmContaBancariaOutputType contaBancaria = new DepositarEmContaBancariaOutputType();
		contaBancaria.setBoolean(true);
		return contaBancaria;
	}
}