public class Acai {
    public Integer tamanho;
    public Double valor;

    public Boolean seAcrecimo;

    public Double valorAcai(){
        if(tamanho == 300){
            if(seAcrecimo == true){
                this.valor = 8.00 + 2.00;
            }
            else
                this.valor = 8.00;

        }
        else if(tamanho == 500){
            if(seAcrecimo == true){
                this.valor = 10.00 + 2.00;
            }
            else
                this.valor = 10.00;

        }

        else if(tamanho == 700){
            if(seAcrecimo == true){
                this.valor = 12.00 + 2.00;
            }
            else
                this.valor = 12.00;
        }
        return this.valor;

    }

    public Acai(Integer tamanho, Double valor, Boolean seAcrecimo) {
        this.tamanho = tamanho;
        this.valor = valor;
        this.seAcrecimo = seAcrecimo;
    }
}

