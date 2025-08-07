public class Main {
    static class Empresa {
        String nome;
        int funcionarios;

        Empresa(String nome, int funcionarios) {
            this.nome = nome;
            this.funcionarios = funcionarios;
        }
    }

    public static void main(String[] args) {
        Empresa[] empresas = new Empresa[5];
        
        empresas[0] = new Empresa("Googah", 75);
        empresas[1] = new Empresa("Micra airsoft", 30);
        empresas[2] = new Empresa("Pilco", 120);
        empresas[3] = new Empresa("Soone", 45);
        empresas[4] = new Empresa("Escuro Operadora", 60);
        
     
        int total = 0;
        for (int i = 0; i < empresas.length; i++) {
            if (empresas[i].funcionarios > 50) {
                System.out.println(empresas[i].nome);
            }
            total += empresas[i].funcionarios;
        }
        double media = (double) total / empresas.length;
        System.out.println("Média: " + media);
    }
}