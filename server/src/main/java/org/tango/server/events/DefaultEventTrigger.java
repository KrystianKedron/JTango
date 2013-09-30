/**
 * Copyright (C) :     2012
 *
 * 	Synchrotron Soleil
 * 	L'Orme des merisiers
 * 	Saint Aubin
 * 	BP48
 * 	91192 GIF-SUR-YVETTE CEDEX
 *
 * This file is part of Tango.
 *
 * Tango is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Tango is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Tango.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.tango.server.events;

import fr.esrf.Tango.DevFailed;

/**
 * manage default Event trigger
 * 
 * @author ABEILLE
 * 
 */
public class DefaultEventTrigger implements IEventTrigger {

    @Override
    public boolean isSendEvent() throws DevFailed {
        return false;
    }

    @Override
    public void setError(final DevFailed error) {

    }

    @Override
    public void updateProperties() {
    }

    @Override
    public boolean doCheck() {
        return true;
    }

}
