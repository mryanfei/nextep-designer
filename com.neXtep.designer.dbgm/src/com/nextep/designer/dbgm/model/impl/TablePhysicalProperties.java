/*******************************************************************************
 * Copyright (c) 2011 neXtep Software and contributors.
 * All rights reserved.
 *
 * This file is part of neXtep designer.
 *
 * NeXtep designer is free software: you can redistribute it 
 * and/or modify it under the terms of the GNU General Public 
 * License as published by the Free Software Foundation, either 
 * version 3 of the License, or any later version.
 *
 * NeXtep designer is distributed in the hope that it will be 
 * useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     neXtep Softwares - initial API and implementation
 *******************************************************************************/
package com.nextep.designer.dbgm.model.impl;

import com.nextep.datadesigner.model.IElementType;
import com.nextep.designer.dbgm.model.IPhysicalObject;
import com.nextep.designer.dbgm.model.ITablePhysicalProperties;
import com.nextep.designer.dbgm.model.base.AbstractPhysicalProperties;

/**
 * @author Bruno Gautier
 */
public class TablePhysicalProperties extends AbstractPhysicalProperties implements
		ITablePhysicalProperties {

	/** The table for which those physical properties are defined */
	private IPhysicalObject table;

	@Override
	public IPhysicalObject getParent() {
		return table;
	}

	@Override
	public void setParent(IPhysicalObject table) {
		this.table = table;
	}

	@Override
	public IElementType getType() {
		return IElementType.getInstance(ITablePhysicalProperties.TYPE_ID);
	}

}
