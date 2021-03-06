/**
 * This file is part of Relation Analyzer for OSM.
 * Copyright (c) 2001 by Adrian Stabiszewski, as@grundid.de
 *
 * Relation Analyzer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Relation Analyzer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Relation Analyzer.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.osmsurround.ra.report;

import java.util.Collection;

public class ReportItem {

	private Collection<EndNodeDistances> endNodeDistances;
	private double length;

	public ReportItem(Collection<EndNodeDistances> endNodeDistances, double length) {
		this.endNodeDistances = endNodeDistances;
		this.length = length;
	}

	public Collection<EndNodeDistances> getEndNodeDistances() {
		return endNodeDistances;
	}

	public double getLength() {
		return length;
	}

}
