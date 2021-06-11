package com.example.provapp.model;

public class Imc {

	private float peso;
	private float altura;
	private String resultado;
	private float imc;
	
	public Imc(float altura, float peso) {
        this.imc = peso / (altura * altura);
    }

    public String getResultado() {
        if(imc < 18.5) {
            this.resultado = imc + ", Abaixo do peso, risco para sua Saúde é Elevado!";
        }else if(imc >= 18.5 && imc < 25) {
            this.resultado = imc + ", Peso ideal, risco para sua Saúde é Inexistente!";
        }else if(imc >= 25 && imc < 30) {
            this.resultado =imc +", Excesso de Peso, Risco para sua Saúde é Elevado!";
        }else if(imc >= 30 && imc < 35) {
            this.resultado = imc +", Obesidade Grau 1, risco para sua Saúde é Muito Elevado!";
        }else if(imc >= 35 && imc < 40) {
            this.resultado = imc +", Obesidade Grau 2, risco para sua Saúde é Muitíssimo Elevado!";
        }else if(imc >= 40) {
            this.resultado = imc +", Obesidade Grau 3, risco para sua Saúde é Obesidade Mórbida!";
        }
        return resultado;
    }
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
}
