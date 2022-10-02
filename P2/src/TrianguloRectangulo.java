public class TrianguloRectangulo {
    int base;
    int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    String determinarTipoTriangulo() {
        String Respuesta;
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            Respuesta = "Es un triángulo equilátero";
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            Respuesta = "Es un triángulo escaleno";
        else
            Respuesta = "Es un triángulo isósceles";
        return Respuesta;
    }
}
