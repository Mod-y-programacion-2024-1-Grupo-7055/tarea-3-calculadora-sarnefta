
package compilador;

public class NodoCoseno extends NodoOperador{
    /**
 *
 * @param izq
 * @param der
 */
public NodoCoseno(CompositeEA izq,CompositeEA der) {
    super(izq, der);
    precedence=2;
}

/**
 * * La evaluación del nodo, calcula el coseno de la evaluación del hijo izquierdo.
 * @return
 */
@Override
public double evalua() throws ArithmeticException {

    return Math.cos(this.der.evalua());
}


}