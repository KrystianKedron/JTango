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


package fr.esrf.TangoApi.Group;

//- Import Java stuffs
import java.util.Collections;
import java.util.Enumeration;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TANGO group reply list for command
 */
public class GroupCmdReplyList extends CopyOnWriteArrayList<GroupCmdReply> implements java.io.Serializable {

    /**
     * Global error flag
     */
    boolean has_failed;
    
    /** Creates a new instance of GroupCmdReplyList */
    public GroupCmdReplyList() {
        has_failed = false;
    }

    public Enumeration<GroupCmdReply> elements() {
        return Collections.enumeration(this);
    }

    /** Adds an element to the list */
    @Override
    public boolean add(GroupCmdReply o) {
        if (o.has_failed) {
            has_failed = true;
        }
        return super.add(o);
    }
    
    /** Resets error flag and clears the list */
    public void reset() {
        clear();
        has_failed = false;
    }
    
    /** Returns error flag */
    public boolean has_failed() {
        return has_failed;
    }
}

