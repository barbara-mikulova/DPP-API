package DPPParser.defaultConstrains;

import DPPParser.arguments.Constraint;

/**
 * Basic interface for all long constraints
 */
public interface LongConstraint extends Constraint<Long> {

    @Override
    public boolean isFulfilled(Long argument);
}
