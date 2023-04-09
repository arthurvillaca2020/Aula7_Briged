package example;


public abstract class Valor {
    protected Jogo jogo;

    protected float precoBase;

    public Valor(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
