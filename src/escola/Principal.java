package escola;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Funcionario p2 = new Funcionario();
        Aluno p3 = new Aluno();
        Professor p4 = new Professor();

        p1.setNome("Silvana");
        p2.setNome("Angela");
        p3.setNome("Mauricio");
        p4.setNome("Carlos");

        p1.setIdade(18);
        p2.setIdade(19);
        p3.setIdade(20);
        p4.setIdade(21);

        p1.setSexo("F");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("M");

        p3.setCurso("Piloto de Vôo");
        p4.setSalario(5000.0f);
        p4.receberAumento(1000.0f);
        p2.setSetor("Secretaria");



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
