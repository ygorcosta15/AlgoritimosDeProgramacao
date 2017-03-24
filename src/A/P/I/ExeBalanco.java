package A.P.I;

public class ExeBalanco {

    public static void main(String[] args) {

        int janeiro, fevereiro, marco, GastoTrimestral, MediaMensal; // declaração das variaveis
        // Atribundo os valores as variaveis;
        janeiro = 15000;
        fevereiro = 23000;
        marco = 17000;

        //Soma das variaveis atribuidas;
        GastoTrimestral = janeiro + fevereiro + marco;
        MediaMensal = GastoTrimestral / 3;

        //
        System.out.println("gasto total é :" + GastoTrimestral);
        System.out.println("e a media Mensal é : " + MediaMensal);

    }
}
