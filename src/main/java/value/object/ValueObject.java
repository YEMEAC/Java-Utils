package value.object;


import java.util.Objects;

/**
 * @author Yeison Melo {@literal <mailto:melo.yeison@cabonline.com/>}
 *         A value object is defined by its atributes not by a memory reference like
 *         common instances.
 */


public abstract class ValueObject {
    public abstract Object[] getFields();

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof ValueObject)) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Object[] A = getFields();
        Object[] B = ((ValueObject) obj).getFields();

        if (A.length != B.length) {
            return false;
        }

        for (int i = 0; i < getFields().length; ++i) {
            if (!Objects.equals(A[i], B[i])) {
                return false;
            }
        }
        return true;
    }
}