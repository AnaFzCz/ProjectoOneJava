import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("Ese es Screen Match");
        System.out.println("Soul");
        String nombrePelicula = "Soul";
        int anoDeLanzamento = 2020;
        System.out.println("Año de Lanzamiento " + anoDeLanzamento);
        boolean incluidoNoPlan = true;
        String plan;
        if (incluidoNoPlan == true) {
            plan = "Incluído en el Plan :)";
        } else
            plan = "Lo siento, no está incluído en el Plan :(";
        System.out.println("***************************");
        //Media calculada por el puntaje de tres personas más

        double media = (9.8 + 6.3 + 8.0) / 3;
        //Da formato a un número decimal bajo solo 2 digitos

        DecimalFormat mediaDos = new DecimalFormat("#.00");
        String valorFormateado = mediaDos.format(media);

        //Casting: Cuando el tipo de dato es compatible con otro tipo de dato CONVERTIDO EN ENTERO

        int mediaEntero = (int)media;
        System.out.println("Calificación redondeada: "+mediaEntero);

        //System.out.println("La calificación del filme es: " + media);
        String sinopsis = "Es una película animada, drama y comedia";

       /* sinopsis = """
                Filme: Soul
                es una película animada y comedia
                Genial
                Ano de lanzamiento:
                """ + anoDeLanzamento;
        */
        System.out.println(String.format("""
                        La Película: %s, lanzada en el año %d, 
                        tiene la siguiente reseña: %s, 
                        la cuál : %s, 
                        con una puntuación de: %s """,
                nombrePelicula, anoDeLanzamento, sinopsis, plan,
                valorFormateado));
        System.out.println("***************************");
    }
}