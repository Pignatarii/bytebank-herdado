public class TesteSistema {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

//        Administrador adm = new Administrador()();
//        adm.setSenha

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

    }

}