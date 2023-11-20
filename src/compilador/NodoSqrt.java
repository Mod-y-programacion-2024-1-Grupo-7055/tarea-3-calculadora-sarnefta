
package compilador;
public class NodoSqrt extends NodoOperador{
    /**
 *
 * @param izq
 * @param der
 */
public NodoSqrt(CompositeEA der) {
    super(null, der);
    precedence=2;
}

/**
 * * La evaluación del nodo, calcula la raiz cuadraada de la evaluación del hijo izquierdo.
 * @return
 */
@Override
public double evalua() throws ArithmeticException {

    return Math.sqrt(der.evalua());
}


}