package model;

/**
 *
 * @author andre
 */
public class NoSolucoes {
    private int somaSolucaoAtual;
    private int melhorSolucao;
    
    int vetorSolucao[] = new int[4];
    int vetorSolucaoTemporaria[] = new int[4];

    public NoSolucoes(int numTarefas) {
        for(int i=0; i<numTarefas; i++)
            this.vetorSolucao[i] = this.vetorSolucaoTemporaria[i] = -1;
        
        this.melhorSolucao = Integer.MAX_VALUE;
        this.somaSolucaoAtual = 0;
    }

    public int getSomaSolucaoAtual() {
        return somaSolucaoAtual;
    }

    public void setSomaSolucaoAtual(int somaSolucaoAtual) {
        this.somaSolucaoAtual = somaSolucaoAtual;
    }

    public int getMelhorSolucao() {
        return melhorSolucao;
    }

    public void setMelhorSolucao(int melhorSolucao) {
        this.melhorSolucao = melhorSolucao;
    }

    public int[] getVetorSolucao() {
        return vetorSolucao;
    }

    public void setVetorSolucao(int[] vetorSolucao) {
        this.vetorSolucao = vetorSolucao;
    }

    public int[] getVetorSolucaoTemporaria() {
        return vetorSolucaoTemporaria;
    }

    public void setVetorSolucaoTemporaria(int[] vetorSolucaoTemporaria) {
        this.vetorSolucaoTemporaria = vetorSolucaoTemporaria;
    }
       
}
