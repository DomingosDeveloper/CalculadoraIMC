public class Calculadora {
    private double peso;
    private double altura;

    public Calculadora() {
    }

    public Calculadora(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Calculadora{" +
                "peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public double calculaIMC(double peso, double altura){
        double resultado = peso/(altura * altura);
        String resultadoS = String.valueOf(resultado);
        String subs_resultadoS = resultadoS.substring(0, 4);

        if (resultado <= 17){
            System.out.println("Seu imc é de magreza");
            System.out.println(subs_resultadoS);
        }
        if (resultado > 17 && resultado <= 18.4 ){
            System.out.println("Seu imc é de abaixo do ideal");
            System.out.println(subs_resultadoS);
        }
        if (resultado > 18.4 && resultado <= 24.9){
            System.out.println("Seu imc é de peso normal");
            System.out.println(subs_resultadoS);
        }
        if (resultado > 25 && resultado <= 29.9){
            System.out.println("Acima do peso.");
            System.out.println(subs_resultadoS);
        }
        if (resultado > 30 && resultado <= 34.9){
            System.out.println("Obesidade tipo 1");
            System.out.println(subs_resultadoS);
        }
        if (resultado > 34.9){
            System.out.println("Obesidade tipo 2");
            System.out.println(subs_resultadoS);
        }
        return 0;
    }
}
