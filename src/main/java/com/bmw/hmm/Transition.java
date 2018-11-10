/**
 * Copyright (C) 2015-2016, BMW Car IT GmbH and BMW AG
 * Author: Stefan Holder (stefan.holder@bmw.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bmw.hmm;

import java.util.Objects;

/**
 * Represents the transition between two consecutive candidates.
 *
 * @param <S> the state type
 */
public class Transition<S> {
	/** from state candidate */
    public final S fromCandidate;
    /** to state candidate */
    public final S toCandidate;

    /**
     * initialization
     * @param fromCandidate from state
     * @param toCandidate to state
     */
    public Transition(S fromCandidate, S toCandidate) {
        this.fromCandidate = fromCandidate;
        this.toCandidate = toCandidate;
    }

    /* @see java.lang.Object#hashCode() */
    @Override
    public int hashCode() {
        return Objects.hash(fromCandidate, toCandidate);
    }

    /* @see java.lang.Object#equals(java.lang.Object) */
    @Override
    public boolean equals(Object obj) {
    	// case: same as this instance
        if (this == obj) {
            return true;
        }
        // case: object is null
        if (obj == null) {
            return false;
        }
        // case: different class
        if (getClass() != obj.getClass()) {
            return false;
        }
        // check if fields are same
        @SuppressWarnings("unchecked")
        Transition<S> other = (Transition<S>) obj;
        return Objects.equals(fromCandidate, other.fromCandidate) && Objects.equals(toCandidate,other.toCandidate);
    }

    /* @see java.lang.Object#toString() */
    @Override
    public String toString() {
        return "Transition [fromCandidate=" + fromCandidate + ", toCandidate=" + toCandidate + "]";
    }
}
