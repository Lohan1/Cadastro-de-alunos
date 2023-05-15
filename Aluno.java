public class Aluno {

    public String nome, sexo, endereco, cidade, estado, nomeDoPai, nomeDaMae;  

    public int CEP, RG, grauDeEscolaridade, dataDeNascimento, telefone; 
    
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "André Martins";
        aluno1.sexo = "Masculino";
        aluno1.endereco = "Rua Santo Antonio, 29 - Centro";
        aluno1.cidade = "São Paulo";
        aluno1.estado = "SP";
        aluno1.nomeDoPai = "João Martins";
        aluno1.nomeDaMae = "Maria Martins";
        aluno1.telefone = 2344565;
        aluno1.CEP = 102456827;
        aluno1.RG = 345644334;
        aluno1.dataDeNascimento = 71281;
        aluno1.grauDeEscolaridade = 2;
        
        System.out.println("nome do aluno; " + aluno1.nome);
        System.out.println("sexo do aluno; " + aluno1.sexo);
        System.out.println("endereco do aluno; " + aluno1.endereco);
        System.out.println("cidade do aluno; " + aluno1.cidade);
        System.out.println("estado do aluno; " + aluno1.estado);
        System.out.println("nome do pai do aluno; " + aluno1.nomeDoPai);
        System.out.println("nome da mae do aluno; " + aluno1.nomeDaMae);
        System.out.println("telefone do aluno; " + aluno1.telefone);
        System.out.println("cep do aluno; " + aluno1.CEP);
        System.out.println("rg do aluno; " + aluno1.RG);
        System.out.println("data de nascimento do aluno; " + aluno1.dataDeNascimento);
        System.out.println("grau de escolaidade do aluno; " + aluno1.grauDeEscolaridade);
        
        
    }


}
