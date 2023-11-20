
package compilador;

public class NodoTangente extends NodoOperador{
    /**
 *
 * @param izq
 * @param der
 */
public NodoTangente(CompositeEA der) {
    super(null, der);
    precedence=2;
}

/**
 * * La evaluación del nodo, calcula la tangente de la evaluación del hijo izquierdo.
 * @return
 */
@Override
public double evalua() throws ArithmeticException  {

    return Math.tan(der.evalua());
}

}