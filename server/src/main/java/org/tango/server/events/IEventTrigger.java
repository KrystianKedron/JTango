/**
 * Copyright (C) :     2012
 * <p>
 * Synchrotron Soleil
 * L'Orme des merisiers
 * Saint Aubin
 * BP48
 * 91192 GIF-SUR-YVETTE CEDEX
 * <p>
 * This file is part of Tango.
 * <p>
 * Tango is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * Tango is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with Tango.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.tango.server.events;

import fr.esrf.Tango.DevFailed;

/**
 * Interface for event triggers
 *
 * @author ABEILLE
 */
public interface IEventTrigger {
    /**
     * @return true if an event must be send
     * @throws DevFailed
     */
    boolean isSendEvent() throws DevFailed;

    /**
     * Notify the trigger of the last error occured
     *
     * @param error
     */
    void setError(final DevFailed error);

    /**
     * Update event properties
     *
     * @throws DevFailed
     */
    void updateProperties() throws DevFailed;

    /**
     * @return true if do the event fire check
     */
    boolean doCheck();

    /**
     * @return true if is pushed from code
     */
    boolean isPushedFromDeviceCode();

}
