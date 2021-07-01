import java.text.DecimalFormat;

public class Paciente {
	
	double pesoPaciente;
	double alturaPaciente;

	public Paciente(double peso, double altura){
			pesoPaciente = peso;
			alturaPaciente = altura;
	}
	
	public double calcularIMC(){
		double imc = pesoPaciente/(alturaPaciente * alturaPaciente);
		return imc;
	}
	
	public void diagnostico(){
		
		double imcValor = calcularIMC();
		//duas casas decimais
		DecimalFormat formato = new DecimalFormat("#.##");
		String dx = formato.format(imcValor);
		
		if (imcValor < 16) {
			System.out.println("Baixo peso, muito grave = IMC abaixo de 16 kg/m² " + " - Seu IMC é : " + dx);
		} else if (imcValor >= 16 && imcValor <= 16.99) {
			System.out.println("Baixo peso, grave = IMC entre 16 e 16.99 kg/m² " + " - Seu IMC é : " + dx);
		} else if(imcValor >= 17 && imcValor <= 18.49 ) {
			System.out.println("Baixo peso = IMC entre 17 e 18.49 kg/m² " + " - Seu IMC é : " + dx);
		} else if (imcValor >= 18.50 && imcValor <= 24.99) {
			System.out.println("Peso Normal = IMC entre 18.50 e 24.99 kg/m² " + " - Seu IMC é : " + dx);
		} else if (imcValor >= 25 && imcValor <= 29.99 ) {
			System.out.println("Sobrepeso = IMC entre 25 e 29.99 kg/m² " + " - Seu IMC é : " + dx);
		} else if (imcValor >= 30 && imcValor <= 34.99) {
			System.out.println("Obesidade grau I = IMC entre 30 e 34.99 kg/m² " + " - Seu IMC é : " + dx);
		} else if (imcValor >= 35 && imcValor <= 39.99) {
			System.out.println("Obesidade grau II = IMC entre 35 e 39.99 kg/m² " + " - Seu IMC é : " + dx);
		} else if (imcValor >= 40 ) {
			System.out.println("Obesidade grau III (obesidade morbida) = IMC igual ou maior que 40 kg/m² " + " - Seu IMC é : " + dx);
		}
	}
	
	
	
}
