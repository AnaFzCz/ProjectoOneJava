import java.text.DecimalFormat;

public class ManejoVariables {
    public static <Char> void main(String[] args) {
// 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double dato1 = 6.82;
        double dato2 = 8.54;
        double mediaDatos = (dato1 + dato2) / 2;
        System.out.println("1. La media de ambas notas es: " + mediaDatos);

//2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double datoDouble = 8.84;
        int datoInt = (int) datoDouble;
        System.out.println("2. Casting de Double a Int :" + datoInt);

//3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char letra = '@';
        String palabra = "Ana Fernandez";
        System.out.println(String.format("3. Hola  mi nombre es %c%s", letra, palabra));

//4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precioProducto = 8.93;
        int cantidad = 4;
        double resultado = precioProducto * cantidad;

        System.out.println("4. El precio total es: " + resultado);

//5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEnDolares = 16.49;
        double valorReal = 4.94;

        double totalReales = valorEnDolares * valorReal;

        DecimalFormat dosDecimales = new DecimalFormat("#.00");
        String valorFormateado = dosDecimales.format(totalReales);

        System.out.println(String.format("5. El valor de $ %f con un tipo de cambio a reales de R$ %f equivale a un Total de reales R$ %s", valorEnDolares, valorReal, valorFormateado));

//Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precioOriginal = 30.95;
        double porcentajeDescuento = 10.3;
        double precioDescuento = (precioOriginal / porcentajeDescuento);
        double precioFinal = precioOriginal - precioDescuento;

        String valorFormatoPrecio = dosDecimales.format(precioFinal);
        System.out.println("6. El monto total a cancelar incluyendo el descuento es: " + valorFormatoPrecio);
    }
}
