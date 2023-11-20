
package compilador;

public class NodoSeno extends NodoOperador{
        /**
     *
     * @param izq
     * @param der
     */
    public NodoSeno(CompositeEA der) {
        super(null, der);
        precedence=2;
    }

    /**
     * * La evaluación del nodo, calcula el seno de la evaluación del hijo izquierdo.
     * @return
     */
    @Override
    public double evalua() throws ArithmeticException {
 
        return Math.sin(der.evalua());
    }


}