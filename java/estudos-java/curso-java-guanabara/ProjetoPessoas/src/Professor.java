public class Professor extends Pessoa {
    private String especialdade;
    private float salario;
    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public String getEspecialdade() {
        return especialdade;
    }

    public void setEspecialdade(String especialdade) {
        this.especialdade = especialdade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
