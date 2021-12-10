package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        //throw new copiados da pasta de test

        String textoMin = texto.toLowerCase();
        String textoFinal = "";
        for (byte i = 0; i < textoMin.length(); i++) {
            if (textoMin.charAt(i) == ' ' || textoMin.charAt(i) >= '0' && textoMin.charAt(i) <= '9') {
                textoFinal += textoMin.charAt(i);
            } else {
                textoFinal += (char) (textoMin.charAt(i) + 3 );
            }
        }
        if (texto == null) throw new NullPointerException();
        if (texto == "") throw new IllegalArgumentException();

        return textoFinal;
    }
}
