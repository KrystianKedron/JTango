//+======================================================================
// $Source$
//
// Project:   Tango
//
// Description:  java source code for the TANGO client/server API.
//
// $Author: pascal_verdier $
//
// Copyright (C) :      2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,
//						European Synchrotron Radiation Facility
//                      BP 220, Grenoble 38043
//                      FRANCE
//
// This file is part of Tango.
//
// Tango is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// Tango is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License
// along with Tango.  If not, see <http://www.gnu.org/licenses/>.
//
// $Revision: 25898 $
//
//-======================================================================


package fr.esrf.TangoApi.events;

import fr.esrf.Tango.DevFailed;
import fr.esrf.TangoApi.CallBack;
import fr.esrf.TangoApi.DeviceProxy;

/**
 * 
 * @author Gwenaelle Abeille
 */
public interface IEventConsumer {

	// ===============================================================
	// ===============================================================
	public int subscribe_event(final DeviceProxy device,
			final String attribute, final int event, final CallBack callback,
			final String[] filters, final boolean stateless) throws DevFailed;

	// ===============================================================
	// ===============================================================
	public int subscribe_event(final DeviceProxy device,
			final String attribute, final int event, final int max_size,
			final String[] filters, final boolean stateless) throws DevFailed;

	// ===============================================================
	// ===============================================================
	public int subscribe_event(final DeviceProxy device,
			final String attribute, final int event, final CallBack callback,
			final int max_size, final String[] filters, final boolean stateless)
			throws DevFailed;
	// ===============================================================
	// ===============================================================
	public int subscribe_event(final DeviceProxy device,
			final int event, final CallBack callback,final int max_size,
            final boolean stateless) throws DevFailed;

	// ===============================================================
	// ===============================================================
	public void unsubscribe_event(final int event_id) throws DevFailed;
}
