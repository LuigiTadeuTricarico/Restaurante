import javax.swing.JOptionPane;

class Veiculo {
    int peso, velocMax;
    float preco;

    
    public Veiculo() {}

    
    public Veiculo(int peso, int velocMax, float preco) {
        this.peso = peso;
        this.velocMax = velocMax;
        this.preco = preco;
    }

    
    public void setPeso(int p) { peso = p; }
    public void setVelocMax(int v) { velocMax = v; }
    public void setPreco(float pr) { preco = pr; }

   
    public int getPeso() { return peso; }
    public int getVelocMax() { return velocMax; }
    public float getPreco() { return preco; }

    
    public void ler() {
        peso = Integer.parseInt(JOptionPane.showInputDialog("Peso:"));
        velocMax = Integer.parseInt(JOptionPane.showInputDialog("Velocidade Máx:"));
        preco = Float.parseFloat(JOptionPane.showInputDialog("Preço:"));
    }

    
    public void mostrar() {
        JOptionPane.showMessageDialog(null,
            "Peso: " + peso +
            "\nVelocidade: " + velocMax +
            "\nPreço: R$ " + preco);
    }
}