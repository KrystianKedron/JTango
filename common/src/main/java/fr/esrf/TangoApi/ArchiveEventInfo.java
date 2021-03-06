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
// $Revision: 25296 $
//
//-======================================================================


package fr.esrf.TangoApi;

import fr.esrf.Tango.ArchiveEventProp;


/**
 *	Class Description: This class is the same class as ArchiveEventProp, 
 *	                   but created for C++ compatibility.
 *
 * @author  verdier
 * @version  $Revision: 25296 $
 */
public class ArchiveEventInfo implements java.io.Serializable
{
	public String rel_change = "";
	public String abs_change = "";
	public String period = "";
	public String[] extensions;
	//-======================================================================
	//-======================================================================
	public ArchiveEventInfo(String rel_change, String abs_change, String period, String[] extensions)
	{
		this.rel_change = rel_change;
		this.abs_change = abs_change;
		this.period     = period;
		this.extensions = extensions;
	}
	//-======================================================================
	//-======================================================================
	public ArchiveEventInfo(ArchiveEventProp ev_prop)
	{
		this.rel_change = ev_prop.rel_change;
		this.abs_change = ev_prop.abs_change;
		this.period     = ev_prop.period;
		this.extensions = ev_prop.extensions;
	}
	//-======================================================================
	//-======================================================================
	public ArchiveEventProp getTangoObj()
	{
		return new ArchiveEventProp(rel_change, abs_change, period, extensions);
	}
}
